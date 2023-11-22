import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args){
        int n = 6, i, j;
   //     PascalTriangle PT = new PascalTriangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {

                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {

                // nCr formula
                System.out.print(
                        " "
                                + factorial(i)
                                / (factorial(i - j)
                                * factorial(j)));
            }

            // for newline
            System.out.println();
        }
        }

    public static int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
}
