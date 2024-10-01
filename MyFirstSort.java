import java.util.*;

public class MyFirstSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] unsorted = new int[3];
        System.out.println("Enter an integer:");
        unsorted[0] = scan.nextInt();
        System.out.println("Enter another integer:");
        unsorted[1] = scan.nextInt();
        System.out.println("Enter one more integer:");
        unsorted[2] = scan.nextInt();
        
        //Sort the array using sleepSort
        System.out.println("Sorted order:");
        sleepSort(unsorted);
    }
    
    public static void sleepSort(int[] array) { 
        java.util.stream.IntStream.of(array).forEach(number -> new Thread(() -> { try { Thread.sleep(number * 100); System.out.println(number); } catch (InterruptedException e) { e.printStackTrace(); } }).start()); 
    }
}