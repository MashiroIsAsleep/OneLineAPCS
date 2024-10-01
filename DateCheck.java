public class DateCheck{
    public static void main(String[] args){
    //testings 
        System.out.println(isValidDate(3, 6, 1973));
        System.out.println(isValidDate(4, 31, 2010));
        System.out.println(isValidDate(13, 2, 1993));
        System.out.println(isValidDate(5, 13, -203));
        System.out.println(isValidDate(2, 29, 2020));
        System.out.println(isValidDate(2, 29, 2021));
        System.out.println(isValidDate(2, 29, 2100));
        System.out.println(isValidDate(2, 29, 2400));
    }
    public static boolean isLeapYear(int year){
        return !(year % 4 != 0 || (year/100 * 100 == year && (year/100) % 4 != 0));
    }
    public static boolean isValidDate(int month, int day, int year) { 
        return year > 0 && month >= 1 && month <= 12 && day <= ((isLeapYear(year) && month == 2) ? 29 : new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31}[month]); 
    }
    
}