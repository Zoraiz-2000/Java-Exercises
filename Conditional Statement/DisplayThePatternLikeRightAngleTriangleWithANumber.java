import java.util.Scanner;

public class DisplayThePatternLikeRightAngleTriangleWithANumber {

    //16. Write a Java program to display the pattern like a right angle triangle with a number.
    public static void main(String[] args) {

        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++) {

            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}