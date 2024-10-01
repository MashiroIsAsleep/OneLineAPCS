public class GCF{
    public static void main(String[] args){
        //test
        System.out.println(gcf(6,8));
        System.out.println(gcf(3,15));
        System.out.println(gcf(39,91));
        System.out.println(gcf(1,350));
        System.out.println(gcf(100,8675309));
        System.out.println(gcf(83,83));
    }
    public static int gcf(int a, int b) { 
        return b == 0 ? a : gcf(b, a % b); 
    }
}