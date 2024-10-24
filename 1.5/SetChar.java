public class SetChar{
    public static void main(String[] args){
        String word = "touch";
        System.out.println(word);
        word = setChar(word, 3, "g"); //calls String version
        System.out.println(word);
        word = setChar(word, 0, 'r'); //calls char version
        System.out.println(word);
        word = setChar(word,4,(char)(word.charAt(4)-3));//calls char version
        System.out.println(word);
    }
    public static String setChar(String str, int index, String ch){
        return setChar(str, index, ch.charAt(0));//calls char version
    }    
    public static String setChar(String str, int index, char ch) {
        return (str == null || index < 0 || index >= str.length()) ? str : new StringBuilder(str).replace(index, index + 1, String.valueOf(ch)).toString();
    }
}