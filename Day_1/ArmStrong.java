import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        int a, b=0,c = 0,d, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a = sc.nextInt();
        temp = a;
        while(temp>0){
          temp = temp/10;
          b++;

        }
        //System.out.println(b);
        temp = a;
        while (temp>0){
            d = temp%10;
            c += (Math.pow(d,b));
            temp = temp/10;
        }
        if(a==c){
            System.out.println("The given num is ArmStrong num");
        }
        else{
        System.out.println("The given num is not an ArmStrong num");
    }
    }
}
