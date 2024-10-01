public class PerfectNumbers {
    public static void main(String[] args) {
        //run the method for all numbers from 1 to 50,000,000
        for (int j = 1; j <= 50000000; j++){
            if (isPerfect(j))
                System.out.println(j); 
        }
    }

    public static boolean isPerfect(int number) { 
        return number >= 2 && number % 2 == 0 && (1 + java.util.stream.IntStream.rangeClosed(2, (int)Math.sqrt(number)).filter(i -> number % i == 0).mapToLong(i -> i + (number / i != i ? number / i : 0)).sum()) == number; 
    }

}
