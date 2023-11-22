import java.util.Scanner;

public class NextPerfectSqr {
    public static void main(String[] args) {
        System.out.println("Enter the number to print the next perfect square");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        PerfectS(number);
        sc.close();
    }



    private static void PerfectS(int number) {
        int b;
        b=(int) Math.sqrt(number);
        b++;
        b=b*b;
        System.out.println(b);

    }
}
