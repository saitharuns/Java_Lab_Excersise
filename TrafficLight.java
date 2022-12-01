package javathurlab;

public class TrafficLight { // class is created 
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            // Red light
            System.out.println("RED light is ON. Remaining time: 3 seconds.");
            Thread.sleep(3000);// using thread sleep for 3 seconds
            System.out.println("RED light is OFF.");
            // Green light 
            System.out.println("GREEN light is ON. Remaining time: 5 seconds.");
            Thread.sleep(5000); // using thread sleep for 5 seconds
            System.out.println("GREEN light is OFF.");
            // Yellow light
            System.out.println("YELLOW light is ON. Remaining time: 2 seconds.");
            Thread.sleep(2000); // using thread sleep for 2 seconds
            System.out.println("YELLOW light is OFF.");
        }
    }
}