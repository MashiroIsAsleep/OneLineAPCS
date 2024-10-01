import java.util.Scanner;

public class Max {
    //Returns the largest of its four arguments.
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a,b), Math.max(c,d));
    }
    
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a,b), Math.min(c,d));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 integers, separated by spaces: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        System.out.println("Largest is " + max(n1, n2, n3, n4));
    }
}