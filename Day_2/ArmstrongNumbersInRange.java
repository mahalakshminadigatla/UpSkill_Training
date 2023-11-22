public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers in the range 100 to 999:");

        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int num) {
        int temp = num,b=0;
        while (temp>0){
            temp = temp/10;
            b++;

        }
        int result = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            result += Math.pow(digit, b);
            temp /= 10;
        }

        return result == num;
    }
}
