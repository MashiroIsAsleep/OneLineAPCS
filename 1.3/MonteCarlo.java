public class MonteCarlo{
   public static void main(String[] args){
      double sum = 0;//counts the win
      int trials = 1000000;//stores total trial #
      for (int i = 0; i < trials; i ++)
         if (rollEm() == true)//paly the game trial times, increment the sum each time we win
            sum += 1;
      System.out.println(sum / trials);//print the probability of winning by dividing wins/ total plays
   }
   public static boolean rollEm(){
      return !(roll() == 6 || roll() == 6 || roll() == 6 || roll() == 6);//roll 4 times, if any one time is a 6, return false
   }
   public static int roll(){
      return (int)(Math.random()*6)+1;//roll a random int from 1 to 6
   }
}