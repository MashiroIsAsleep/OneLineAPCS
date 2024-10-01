import java.util.*;

public class CompareDoubles{
   public static void main(String[] args){
   
      //Prompts for input
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the two doubles to be compared and tolerence, seperated by space");
      double numberOne = scan.nextDouble();
      double numberTwo = scan.nextDouble();
      double tolerance = scan.nextDouble();
      
      //Function call
      System.out.println(approxEquals(numberOne, numberTwo, tolerance));
   }
   public static boolean approxEquals(double a, double b, double tolerance){
      //True if within tolerence, else false
      return Math.abs(a - b) < tolerance;
   }
}