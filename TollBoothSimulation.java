package javathurlab;
public class TollBoothSimulation {
	
	public static void main(String[] args) {
		
		//Initialize the threads for each vehicle
		Thread vehicle1 = new Thread(new Vehicle(1));
		Thread vehicle2 = new Thread(new Vehicle(2));
		Thread vehicle3 = new Thread(new Vehicle(3));
		Thread vehicle4 = new Thread(new Vehicle(4));
		Thread vehicle5 = new Thread(new Vehicle(5));
		
		//Start the threads
		vehicle1.start();
		vehicle2.start();
		vehicle3.start();
		vehicle4.start();
		vehicle5.start();
	}
	
	//Runnable class to represent a vehicle
	static class Vehicle implements Runnable {
		
		private int vehicleNumber;
		
		public Vehicle(int vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}
		
		@Override
		public void run() {
			try {
				System.out.println("Vehicle " + vehicleNumber + " has started the journey.");
				Thread.sleep(1000);
				System.out.println("Vehicle " + vehicleNumber + " has arrived at the toll.");
				
				//Acquire lock to enter the toll booth
				synchronized (TollBoothSimulation.class) {
					System.out.println("Vehicle " + vehicleNumber + " is entering the toll booth.");
					Thread.sleep(1000);
					System.out.println("Vehicle " + vehicleNumber + " is exiting the toll booth.");
				}
				
				Thread.sleep(1000);
				System.out.println("Vehicle " + vehicleNumber + " is crossing the bridge.");
				Thread.sleep(1000);
				System.out.println("Vehicle " + vehicleNumber + " has completed the journey.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}