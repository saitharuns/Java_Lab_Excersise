package javathurlab;

enum Cars { // declaring cars in enum

Audi, BMW, Volvo 

}
enum Models{ // declaring cars in enum
	A6,B5,V4
}

public class Car { //class name

public static void main(String[] args) {

	//getting enum variables
	Cars c1 = Cars.Audi; 
	Cars c2 = Cars.BMW;
	Cars c3 = Cars.Volvo;
	Models m1= Models.A6;
	Models m2= Models.B5;
	Models m3= Models.V4;

	// printing the car names and car models
	System.out.println("Car model: " + m1);
	System.out.println("Car name: " + c1);
	System.out.println("Car model: " + m2);
	System.out.println("Car name: " + c2);
	System.out.println("Car model: " + m3);
	System.out.println("Car name: " + c3);

}
}
