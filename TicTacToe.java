package javathurlab;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // Declare and initialize necessary variables
        Scanner input = new Scanner(System.in);
        File gameRecords = new File("GameRecords.txt");
        int option;
        int player1Score = 0;
        int player2Score = 0;
        int draws = 0;
        
        do {
            // Print the menu
            System.out.println("Choose an option:");
            System.out.println("1. Play the game");
            System.out.println("2. View the instructions");
            System.out.println("3. View a player's win percentage");
            System.out.println("4. Exit");
            
            // Get user's choice
            option = input.nextInt();
            
            // Execute the chosen option
            switch(option) {
                case 1:
                    playGame(player1Score, player2Score, draws);
                    break;
                case 2:
                    printInstructions();
                    break;
                case 3:
                    viewWinPercentage(player1Score, player2Score, draws);
                    break;
                case 4:
                    saveGameRecords(gameRecords, player1Score, player2Score, draws);
                    break;
            }
        } while(option != 4);
    }
    
    // This method is used to play the game
    public static void playGame(int player1Score, int player2Score, int draws) {
        // Declare and initialize necessary variables
        Scanner input = new Scanner(System.in);
        int playerTurn = 1;
        char[][] board = new char[3][3];
        boolean win = false;
        boolean gameOver = false;
        
        // Initialize the board
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        
        // Main game loop
        while(!gameOver) {
            // Print the board
            printBoard(board);
            
            // Ask the current player to make a move
            System.out.println("Player " + playerTurn + ", make your move:");
            System.out.println("enter the row");
            int row = input.nextInt();
            System.out.println("enter the column");
            int col = input.nextInt();
            
            // Check if the chosen row and column are valid
            if(row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == '-') {
                // Update the board
                board[row][col] = (playerTurn == 1) ? 'X' : 'O';
                
                // Check if the game is won
                win = checkWin(board);
                
                // Check if the game is over
                gameOver = checkGameOver(board);
                
                // Switch player turns
                playerTurn = (playerTurn == 1) ? 2 : 1;
            }
            else {
                System.out.println("Invalid move!");
            }
        }
        
        // Print the board one last time
        printBoard(board);
        
        // Check the result of the game and update the scores
        if(win) {
            System.out.println("Player " + playerTurn + " wins!");
            if(playerTurn == 1) {
                player1Score++;
            }
            else {
                player2Score++;
            }
        }
        else {
            System.out.println("It's a draw!");
            draws++;
        }
    }
    
    // This method is used to print the instructions
    public static void printInstructions() {
        System.out.println("Tic Tac Toe is a two-player game. Each player takes turns to place their symbol on the 3 x 3 game board. The first player to get three of their symbols in a row horizontally, vertically, or diagonally is the winner. If all nine spaces are filled and no player has three in a row, then the game is a draw.");
    }
    
    // This method is used to view the win percentage of a player
    public static void viewWinPercentage(int player1Score, int player2Score, int draws) {
        int total = player1Score + player2Score + draws;
        float p1Percentage = (player1Score * 100.0f) / total;
        float p2Percentage = (player2Score * 100.0f) / total;
        
        System.out.println("Player 1 win percentage: " + p1Percentage);
        System.out.println("Player 2 win percentage: " + p2Percentage);
    }
    
    // This method is used to save the game records
    public static void saveGameRecords(File gameRecords, int player1Score, int player2Score, int draws) {
        try {
            FileWriter fw = new FileWriter(gameRecords);
            fw.write("Player 1 Score: " + player1Score + "\n");
            fw.write("Player 2 Score: " + player2Score + "\n");
            fw.write("Draws: " + draws + "\n");
            fw.close();
        }
        catch(Exception e) {
            System.out.println("Error writing to file!");
        }
    }
    
    // This method is used to print the board
    public static void printBoard(char[][] board) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // This method is used to check if the game is won
    public static boolean checkWin(char[][] board) {
        // Check for horizontal wins
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
        }
        
        // Check for vertical wins
        for(int i = 0; i < 3; i++) {
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return true;
            }
        }
        
        // Check for diagonal wins
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        }
        
        return false;
    }
    
    // This method is used to check if the game is over
    public static boolean checkGameOver(char[][] board) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == '-') {
                    return false;
                }
            }
        }
        
        return true;
    }
}