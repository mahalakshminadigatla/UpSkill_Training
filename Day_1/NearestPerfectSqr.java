import java.util.Scanner;

public class NearestPerfectSqr {
    public static void main(String[] args) {

        System.out.println("Enter the number to print the nearest perfect square");

        Scanner sc= new Scanner(System.in);

        int number=sc.nextInt();

        PerfectS(number);

        sc.close();
}
    private static void PerfectS(int number) {

        int b;

        b = (int) Math.sqrt(number);

        int a = b++;


        int x = a * a;

        int y = b * b;

        int d = number - y;

        int e = x - number;

        if (d > e) {

            System.out.println(y);

        } else {

            System.out.println(x);

        }
    }}