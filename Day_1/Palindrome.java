import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        int a,b =0, c,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = sc.nextInt();
        temp =a;
        while (temp>0){
            c = temp%10;
            b = b*10 + c;
            temp = temp/10;
        }
        if(a==b){
            System.out.println("The given number is Palindrome");
        }
        else {
            System.out.println("the given number is not a Palindrome");
        }
    }

}
