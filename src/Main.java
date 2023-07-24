import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-5, -4, -2, 0, 1, 2, 3};
        int count = 0;
        for (int i:numbers) {
            if (i>0)count++;
        }

        System.out.println(count);

        long counter = IntStream.of(-5, -4, -2, 0, 1, 2, 3).filter(w -> w>0).count();
        System.out.println(counter);
    }
}