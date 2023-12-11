public class Direction {

    //4. Write a Java program to implement an enum called "Direction" with constants representing the cardinal directions (North, South, East, West).
    public enum direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        direction direction1 = direction.NORTH;
        direction direction2 = direction.WEST;

        System.out.println("First direction: " + direction1);
        System.out.println("Second direction: " + direction2);
    }
}