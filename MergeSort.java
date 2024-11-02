import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        return arr.length < 2 ? arr : IntStream.concat(Arrays.stream(mergeSort(Arrays.copyOfRange(arr, 0, arr.length / 2))), 
                                                       Arrays.stream(mergeSort(Arrays.copyOfRange(arr, arr.length / 2, arr.length))))
                                                       .sorted()
                                                       .toArray();
    }
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        int[] sorted = mergeSort(array);
        System.out.println(Arrays.toString(sorted));
    }
}
