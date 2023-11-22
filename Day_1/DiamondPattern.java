import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args){
        int n, c, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        n = sc.nextInt();
        for(k=1; k<=n; k++) {
            for (c = 1; c <= n - k; c++)
                System.out.print(" ");
            for (c = 1; c <= 2 * k - 1; c++)
                System.out.print("*");
            System.out.println("");
        }
        for(k=n-1; k>=0; k--){
            for (c = 1; c <=n-k; c++)
                System.out.print(" ");
            for (c = 1; c <= 2*k - 1; c++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
