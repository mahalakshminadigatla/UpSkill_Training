public class DistanceArray {
    public static void main(String[] args) {
        int[] number = {1, 3, 9,4};
        int[] distances = new int[number.length - 1];



        for (int i = 0; i < number.length - 1; i++) {
            int distance = Math.abs(number[i + 1] - number[i]);
            distances[i] = distance;

        }



        // Find the least number in the distances array
        int leastNumber = distances[0];
        for (int i = 1; i < distances.length; i++) {
            if (distances[i]  < leastNumber) {
                leastNumber = distances[i];
            }
        }



        System.out.println("Least number in distances array: " + leastNumber);
    }
}