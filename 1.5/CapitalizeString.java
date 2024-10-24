public class CapitalizeString {
    public static void main(String[] args) {
        // Test cases
        System.out.println(capitalize("bobby"));      // Bobby
        System.out.println(capitalize("ILENE"));      // Ilene
        System.out.println(capitalize("yOU-tUbER"));  // You-tuber
        System.out.println(capitalize("l33t haXXor"));// L33t haxxor
        System.out.println(capitalize("3-Point shot"));// 3-point shot
    }
    public static String capitalize(String str) {
        // If the string is null or empty, return it as is
        // Otherwise, capitalize the first letter and lowercase the rest
        return (str == null || str.isEmpty()) ? str : str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
