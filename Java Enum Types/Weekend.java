public class Weekend {

    //2. Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
    public enum weekend {
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        weekend day1 = weekend.SATURDAY;
        weekend day2 = weekend.SUNDAY;

        System.out.println("First day of the weekend: " + day1);
        System.out.println("Second day of the weekend: " + day2);
    }
}