// Main class - demonstrates the Factory Method Pattern
public class Main {
    public static void main(String[] args) {
        // Using the factory to create shapes
        Shape shape1 = ShapeFactory.createShape("CIRCLE");
        shape1.draw();
        
        Shape shape2 = ShapeFactory.createShape("RECTANGLE");
        shape2.draw();
        
        // Another circle
        Shape shape3 = ShapeFactory.createShape("circle");
        shape3.draw();
    }
}
