import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int a, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter a number:");
        a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            b = b*i;
        }
        System.out.println("The factorial of " + a + " is " + b);
    }
}
