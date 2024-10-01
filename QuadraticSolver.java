import java.util.*;
// import java.util.Math;

public class QuadraticSolver{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      //Coefficients
      System.out.println("Enter a:");
      double a = scan.nextInt();
      System.out.println("Enter b:");
      double b = scan.nextInt();
      System.out.println("Enter c:");
      double c = scan.nextInt();
      
      //determinant = sqrt(b^2 - 4ac)   
      //quadrtic equation = (-b +/- determinant)/(2a)
      
      double delta = Math.pow(b,2) - 4 * a * c;
      double rootOne;
      double rootTwo;
      String imaginaryOne;
      String imaginaryTwo;
            
      if (delta < 0){
         //imaginary case
         double imaginary = Math.sqrt(-delta)/(2 * a);
         double real = (-b)/(2 * a);
         imaginaryOne = real + " + " + imaginary + "i";
         imaginaryTwo = real + " - " + imaginary + "i";
         System.out.print("Solutions are " + imaginaryOne + " and " + imaginaryTwo);
      }
      else{
         //real case
         delta = Math.sqrt(delta);
         rootOne = (-b + delta)/(2 * a);
         rootTwo = (-b - delta)/(2 * a);
         System.out.println("Solutions are " + rootOne + " and " + rootTwo);
      }
   }
}