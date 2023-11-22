
import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args){
        int[] arr = new int[15];
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched in the array: ");
        int num = sc.nextInt();
        for(int i = 0; i< arr.length; i++){
            if(num==arr[i]){
                System.out.println("The element "+ num + " is found in the array at "+ i + "position");

                break;
            }else {
                c++;
            }
            }
       // System.out.println(arr.length);
     //   System.out.println(c);
        if(c == arr.length){
            System.out.println("The element is not found in the given array");

        }

    }
}
