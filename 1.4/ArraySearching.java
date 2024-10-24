import java.util.Arrays;

public class ArraySearching {
    public static void main(String[] args) {
        int[] testArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};//initialize test array
        System.out.println(Arrays.toString(multiSearch(testArr, 3)));//tests
        System.out.println(Arrays.toString(multiSearch(testArr, 1)));
        System.out.println(Arrays.toString(multiSearch(testArr, 4)));
        System.out.println(Arrays.toString(multiSearch(testArr, 5)));
        System.out.println(Arrays.toString(multiSearch(testArr, 9)));
        System.out.println(Arrays.toString(multiSearch(testArr, 2)));
    }
    public static int[] multiSearch(int[] array, int key) {
        return array == null ? null : java.util.stream.IntStream.range(0, array.length).filter(i -> array[i] == key).toArray();
    }
}
