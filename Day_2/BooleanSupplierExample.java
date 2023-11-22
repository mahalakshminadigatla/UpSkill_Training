import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
    public static void main(String[] args) {
        // Using a lambda expression
        BooleanSupplier isTrueSupplier = () -> true;
        System.out.println("Result: " + isTrueSupplier.getAsBoolean());

        // Using a method reference
        BooleanSupplier isFalseSupplier = BooleanSupplierExample::getFalse;
        System.out.println("Result: " + isFalseSupplier.getAsBoolean());
    }

    private static boolean getFalse() {
        return false;
    }
}

