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
 * Class representing a square.
 */
class Square implements Shape {
    private double side;

    /**
     * Constructor to initialize the side length of the square.
     *
     * @param side The side length of the square.
     */
    Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the square.
     *
     * @return The area of the square.
     */
    @Override
    public double calculateArea() {
        return side * side;
    }
}

/**
 * A simple demonstration of calculating areas of different shapes.
 */
public class Liskovs_Substitution_Principle {
    public static void main(String[] args) {
        // Create different shapes
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        // Calculate and display areas
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of square: " + square.calculateArea());
    }
}

/**
 * This example demonstrates the Liskov Substitution Principle (LSP) by allowing the usage of
 * subtype instances (e.g., Square) wherever the base type (e.g., Shape) is expected. The Square
 * class, which is a subtype of Shape, behaves consistently with the base type and does not violate
 * the expected behavior of the Shape interface. This adherence to LSP promotes code reliability
 * and extensibility, as subtype instances can seamlessly replace base type instances without
 * affecting the correctness of the program.
 */
