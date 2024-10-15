import java.util.Arrays;

public class ArraysPartOne {
    public static void main(String[] args) {
        int[] numbers = {8, 6, 7, 5, 3, 0, 9, 0};
        System.out.println(max(numbers));
        System.out.println(min(numbers));
    }
    public static int max(int[] array) { return Arrays.stream(array).max().getAsInt(); }
    public static int min(int[] array) { return Arrays.stream(array).min().getAsInt(); }
}
