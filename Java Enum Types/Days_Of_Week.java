public class Days_Of_Week {

    //1. Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
    public enum days_of_week {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        days_of_week today = days_of_week.MONDAY;
        System.out.println("Today is " + today);
    }
}