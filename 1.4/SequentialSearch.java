public class SequentialSearch{
   public static void main(String[] args){
      int[] testArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};//initialize test array
      System.out.println(search(testArr, 4));//tests
      System.out.println(search(testArr, 1));
      System.out.println(search(testArr, 3));
      System.out.println(search(testArr, 5));
      System.out.println(search(testArr, 6));
      System.out.println(search(testArr, 7));
      System.out.println("------");
      System.out.println(search(testArr, 5, 0));
      System.out.println(search(testArr, 5, 3));
      System.out.println(search(testArr, 5, 4));
      System.out.println(search(testArr, 5, 6));
      System.out.println(search(testArr, 5, 9));
      System.out.println(search(testArr, 9, 2));
      System.out.println(search(testArr, 9, 6));
      System.out.println(search(testArr, 4, 4));
      System.out.println(search(testArr, 7, 0));
      
   }
   public static int search(int[] array, int key){
      return search(array, key, 0);
   }
   public static int search(int[] array, int key, int startIndex){
      return (startIndex >= array.length) ? -1 : (array[startIndex] == key ? startIndex : search(array, key, startIndex+1));
   } 
}