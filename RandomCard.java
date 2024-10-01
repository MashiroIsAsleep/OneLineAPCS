public class RandomCard{
    public static void main(String[] args){
      //test
        printRandomCard(2);
        printRandomCard(2);
        printRandomCard(2);
        printRandomCard(2);
        printRandomCard(2);
        printRandomCard(2);
    }
    public static void printRandomCard(int numJokers) { 
        System.out.println((int)(Math.random()*(52+numJokers))+1 <= numJokers ? "Joker" : new String[]{"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}[(int)(Math.random()*13)] + " of " + new String[]{"spades","hearts","clubs","diamonds"}[(int)(Math.random()*4)]); 
    }

}