import java.util.Scanner;

public class ValidNum {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        str = sc.nextLine();

            if(str.indexOf(".")>0){
                try{
                    Double.parseDouble(str);
                    System.out.println(str + " is a valid decimal number");
                }catch (NumberFormatException nfe){
                    System.out.println(str +  " is not a valid number");

                }
            }else{
                try{
                    Integer.parseInt(str);
                    System.out.println(str + " is a valid number");
                }catch (NumberFormatException nfe){
                    System.out.println(str + " is not a valid number");
                }
            }

    }
}
