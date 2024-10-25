import java.util.*;
public class ResizingArray{
   public static void main(String[] args){
      int[] array = {1,2,3,4,5};//initialize array
      System.out.println(Arrays.toString(array));
      array = resize(array, 6);//check if padding works
      System.out.println(Arrays.toString(array));
      array = resize(array, 4);//check if truncating works
      System.out.println(Arrays.toString(array));
   }
   public static int[] resize(int[] array, int newLength) { 
      return java.util.Arrays.copyOf(array, newLength); 
   }
}