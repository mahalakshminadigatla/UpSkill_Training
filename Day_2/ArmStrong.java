package Day_2;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int num, b=0,c = 0,d,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the num");
        num = sc.nextInt();
        temp = num;
        while (temp>0){
           temp = temp/10;
           b++;

        }
        temp = num;
        while(temp>0){
            d = temp%10;
            c += (Math.pow(d,b));
            temp = temp/10;
        }
        if(num==c){
            System.out.println("The given num is ArmStrong num");
        }
        else {
            System.out.println("The given num is not an ArmStrong num");
        }
    }
}