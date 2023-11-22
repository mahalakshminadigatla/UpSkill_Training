import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args){
        int CTC;
        double Tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CTC: ");
        CTC = sc.nextInt();
        if(CTC<=180000){
            System.out.println("The Tax amount is Nill");
        } else if (CTC<=300000) {
            Tax = CTC*0.10;
            System.out.println("The Tax amount is " + Tax);
        } else if (CTC<=500000) {
            Tax = CTC*0.2;
            System.out.println("The Tax amount is " + Tax);
        } else if (CTC<=1000000) {
            Tax = CTC*0.3;
            System.out.println("The Tax amount is " + Tax);
        }
    }
}
