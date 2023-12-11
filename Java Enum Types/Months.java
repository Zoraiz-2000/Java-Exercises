public class Months {

    //5. Write a Java program that defines an enum called "Months" with constants representing the months of the year.
    public enum months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        months currentMonth = months.DECEMBER;
        System.out.println("Current month: " + currentMonth);
    }
}