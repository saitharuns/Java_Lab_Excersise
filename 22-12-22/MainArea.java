//Rectangle class
class Rectangle { 
  
    // Data Members 
    double length, breadth; 
  
    // Constructor 
    public Rectangle(double l, double b) 
    { 
        length = l; 
        breadth = b; 
    } 
  
    // Method to find Area of Rectangle 
    public double findArea() 
    { 
        return length * breadth; 
    } 
  
    // Method to find Perimeter 
    public double findPerimeter() 
    { 
        return 2 * (length + breadth); 
    } 
} 
  
// Square class inheriting Rectangle class 
class Square extends Rectangle { 
  
    // Constructor 
    public Square(double s) 
    { 
        // Calling the parent constructor 
        super(s, s); 
    } 
} 
  
// Driver Code 
public class MainArea { 
  
    public static void main(String args[]) 
    { 
        Rectangle r = new Rectangle(10, 5); 
        System.out.println("Area of Rectangle : " + r.findArea()); 
        System.out.println("Perimeter of Rectangle : " 
                           + r.findPerimeter()); 
  
        Square s = new Square(10); 
        System.out.println("Area of Square : " + s.findArea()); 
        System.out.println("Perimeter of Square : " 
                           + s.findPerimeter()); 
    } 
}

/*
C:\Users\TONI-VIJAY\Desktop\22-12-22>java MainArea
Area of Rectangle : 50.0
Perimeter of Rectangle : 30.0
Area of Square : 100.0
Perimeter of Square : 40.0
*/