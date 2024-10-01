import java.util.*;

    public class Leapyear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter year");
        int year = scan.nextInt();
        System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear(int year){
        return !(year % 4 != 0 || (year/100 * 100 == year && (year/100) % 4 != 0));
    }
}