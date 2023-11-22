import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EncryptionCaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //   Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String pt = br.readLine();
       // String pt = sc.nextLine();
        String ct;
        System.out.println("Enter Key Value: ");
        int key = Integer.parseInt(br.readLine());
      //  int key = sc.nextInt();
        ct = doEncrypt(pt,key);
        System.out.println(ct);

        pt = doDecrypt(ct,key);
        System.out.println(pt);
    }
    static String doEncrypt(String pt, int key){
        char c;
        int num;
        StringBuffer sb = new StringBuffer(pt);
        for(int i=0;i< sb.length();i++){
            num= sb.charAt(i)-65;
           // System.out.println((int)sb.charAt(i));
           // System.out.println(num);
            num = num + key;
            if(num>=26)
                num = num-26;

            c = (char) (num + 65);

            sb.setCharAt(i,c);
        }
        return sb.toString();
    }
    static String doDecrypt(String ct, int key){
        return doEncrypt(ct, 26-key );
    }
}
