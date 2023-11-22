import java.util.Scanner;

public class ConvertStringToCharArray {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        str = sc.nextLine();
        char[] charArray;
//        charArray = str.toCharArray();
//        for(int i = 0; i<charArray.length; i++){
//            System.out.println(charArray[i]);
//        }
        charArray = new char[str.length()];
        for(int i = 0; i<str.length();i++){
            charArray[i] = str.charAt(i);
            System.out.println(charArray[i]);
        }
    }
}
