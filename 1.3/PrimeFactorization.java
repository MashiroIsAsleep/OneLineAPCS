import java.util.stream.IntStream;

public class PrimeFactorization{
    public static void main(String[] args) {
        System.out.println(primeFactor(42));
        System.out.println(primeFactor(12));
        System.out.println(primeFactor(65536));
        System.out.println(primeFactor(8675309));

    }
    public static String primeFactor(int n) {
        return n < 2 ? "" : (n % 2 == 0 ? "2 " + primeFactor(n / 2) :IntStream.iterate(3, i -> i + 2).limit((int)Math.sqrt(n)).filter(i -> n % i == 0).boxed().findFirst().map(i -> i + " " + primeFactor(n / i)).orElse(String.valueOf(n)));
    }
}