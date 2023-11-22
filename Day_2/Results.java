import java.util.Scanner;

public class Results {
    public static void main(String[] args){
        int sub1,sub2,sub3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 marks: ");
        sub1 = sc.nextInt();
        System.out.println("Enter Sub2 marks: ");
        sub2 = sc.nextInt();
        System.out.println("Enter sub3 marks: ");
        sub3 = sc.nextInt();

        if(sub1>60 && sub2>60 && sub3>60){
            System.out.println("Passed");
        } else if ((sub1>60 && sub2>60) || (sub1>60 && sub3>60) || (sub2>60 && sub3>60)) {
            System.out.println("Promoted");
        }
        else {
            System.out.println("Failed");
        }
    }
}
