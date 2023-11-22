public class ExceptionExp {
    public static void main(String[] args){
        int x = 4;
        int y =0;
        try {
            System.out.println(x / y);
        }
        catch (Exception e) {
            System.out.println("Invalid operation(shouldn't be divided by zero)");
        }
        finally {
            System.out.println("Hello");
        }
    }
}
