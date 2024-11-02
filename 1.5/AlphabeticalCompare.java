public class AlphabeticalCompare {
    public static void main(String[] args) {
        String[] words1 = {"A", "car", "drove", "fast"};// Tests
        String[] words2 = {"A", "cat", "ran", "fast"};
        String[] words3 = {"He", "read", "4", "words"};
        String[] words4 = {"I'm", "really", "really", "tired"};
        String[] words5 = {"tomato"};
        String[] words6 = {};

        System.out.println(isAlphabetical(words1));
        System.out.println(isAlphabetical(words2));
        System.out.println(isAlphabetical(words3)); 
        System.out.println(isAlphabetical(words4)); 
        System.out.println(isAlphabetical(words5)); 
        System.out.println(isAlphabetical(words6)); 
    }
    public static boolean isAlphabetical(String[] words) {
        return java.util.stream.IntStream.range(0, words.length - 1).allMatch(i -> words[i].compareToIgnoreCase(words[i + 1]) <= 0);
    }    
}
