import java.util.Scanner;

public class PrintAPatternLikeRightAngleTriangle {

    //17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
    public static void main(String[] args) {

        int i,j,n;

        System.out.print("Input number of n : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=1;i<=n;i++) {

            for(j=1;j<=i;j++)
                System.out.print(i);
            System.out.println("");
        }
    }
}