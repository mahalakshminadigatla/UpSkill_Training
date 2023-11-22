import java.util.Scanner;

public class LoginApplication {

    public static void main(String[] args){
        int Max_Attempts = 3;
        int Attempts = 0;
        Scanner sc = new Scanner(System.in);
        while(Attempts < Max_Attempts){
            System.out.println("UserName: ");
            String username = sc.nextLine();
            System.out.println("Password: ");
            String password = sc.nextLine();

            if(isValidCredentials(username,password)){
                System.out.println("Welcome " + username + "!" );
                break;
            }else{
                Attempts++;
                System.out.println("InValid Credentials. Please try again. You still have " + (Max_Attempts-Attempts) + " attempts left");
            }


        }
        if(Attempts == Max_Attempts){
            System.out.println("Contact Admin. To Many unsuccessful attempts");
        }
    }

    private static boolean isValidCredentials(String username, String password) {
      return  username.equals("admin")&&password.equals("password");
    }

}
