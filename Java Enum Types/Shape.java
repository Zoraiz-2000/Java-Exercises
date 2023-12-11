public class Shape {

    //3. Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.
    public enum shape {
        SQUARE,
        CIRCLE,
        RECTANGLE,
        TRIANGLE,
        HEXAGON
    }

    public static void main(String[] args) {
        shape shape1 = shape.CIRCLE;
        shape shape2 = shape.SQUARE;

        System.out.println("First shape: " + shape1);
        System.out.println("Second shape: " + shape2);
    }
}