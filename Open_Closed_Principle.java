/**
* Interface representing a shape.
*/
interface Shape {
   /**
    * Calculates the area of the shape.
    *
    * @return The area of the shape.
    */
   double calculateArea();
}

/**
* Class representing a rectangle.
*/
class Rectangle implements Shape {
   private double width;
   private double height;

   /**
    * Constructor to initialize width and height of the rectangle.
    *
    * @param width  The width of the rectangle.
    * @param height The height of the rectangle.
    */
   Rectangle(double width, double height) {
       this.width = width;
       this.height = height;
   }

   /**
    * Calculates the area of the rectangle.
    *
    * @return The area of the rectangle.
    */
   @Override
   public double calculateArea() {
       return width * height;
   }
}

/**
* Class representing a circle.
*/
class Circle implements Shape {
   private double radius;

   /**
    * Constructor to initialize the radius of the circle.
    *
    * @param radius The radius of the circle.
    */
   Circle(double radius) {
       this.radius = radius;
   }

   /**
    * Calculates the area of the circle.
    *
    * @return The area of the circle.
    */
   @Override
   public double calculateArea() {
       return Math.PI * radius * radius;
   }
}

/**
* A simple demonstration of calculating areas of different shapes.
*/
public class Open_Closed_Principle {
   public static void main(String[] args) {
       // Create different shapes
       Shape rectangle = new Rectangle(5, 4);
       Shape circle = new Circle(3);

       // Calculate and display areas
       System.out.println("Area of rectangle: " + rectangle.calculateArea());
       System.out.println("Area of circle: " + circle.calculateArea());
   }
}

/**
* This example demonstrates the Open-Closed Principle (OCP) by allowing the addition of new shapes
* (e.g., Rectangle, Circle) without modifying existing code. The Shape interface is open for extension
* by implementing new shapes (open), while the existing code that calculates areas remains closed
* for modification (closed). This adherence to OCP promotes code reusability and maintainability,
* as new shapes can be added without impacting existing functionality.
*/
