import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelSum extends RecursiveTask<Long> {
    private static final int THRESHOLD = 1000;
    private long[] array;
    private int start;
    private int end;

    public ParallelSum(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            return computeSequentially();
        }

        int split = length / 2;
        ParallelSum leftTask = new ParallelSum(array, start, start + split);
        leftTask.fork(); // Fork the left half

        ParallelSum rightTask = new ParallelSum(array, start + split, end);
        Long rightResult = rightTask.compute(); // Compute the right half

        Long leftResult = leftTask.join(); // Join the result of the left half
        return leftResult + rightResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // an array of numbers;
        long result = forkJoinPool.invoke(new ParallelSum(array, 0, array.length));
        System.out.println("Result: " + result);
    }
}

