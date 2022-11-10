package javathurlab;

public class Matrix_Multiplication {//class
	
	public static void main(String[] args) {
		int a[][] = {{1,1,1},{2,2,2},{3,3,3}};// declaring a first 3 x 3 matrix
 
        int b[][] = {{1,2,3},{1,2,3},{1,2,3}};// declaring a second 3 x 3 matrix
 
        int c[][] = new int[3][3]; // this is a third matrix used for answer
 
        //matrix multiplication takes place
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j]; //multiplication of two matrix
                }
                System.out.print(c[i][j] + " "); // printing the answer
            }
            System.out.println();
        }
    }
}