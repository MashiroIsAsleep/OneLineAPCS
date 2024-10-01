public class Totient{
    public static void main(String[] args){
        System.out.println(totient(8)); //tests
        System.out.println(totient(24));
        System.out.println(totient(1));
        System.out.println(totient(105));
        System.out.println(totient(8675309));
       
    }
    public static int gcf(int a, int b){
        return b == 0 ? a : gcf (b, a % b); //euclidian method, recursion until b is 0
    }
    public static int totient(int n) { 
        return (int) java.util.stream.IntStream.rangeClosed(1, n).filter(i -> gcf(n, i) == 1).count(); 
    }

}