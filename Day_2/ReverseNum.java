import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        int a,b = 0,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = sc.nextInt();

        while(a>0){
            y = a%10;
            b = b * 10 + y;
            a = a/10;

        }
        System.out.println("Reversed number is :" + b);
    }
}
