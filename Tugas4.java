/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dini aryani
 */
public class Tugas4 {
    public static class sport {
    public int pushUpDurationInMinute;
    public int plankDurationInMinute;
    public int runningDurationInMinute;

    sport(
      int pushUpDurationInMinute, 
      int plankDurationInMinute,
      int runningDurationInMinute
    ) {
      this.pushUpDurationInMinute = pushUpDurationInMinute;
      this.plankDurationInMinute = plankDurationInMinute;
      this.runningDurationInMinute = runningDurationInMinute;
    }
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sport helfi = new sport(60, 5, 5);
    getWorkoutSummary(helfi);
  }

  public static void getWorkoutSummary(sport human) {
    final double pushUpCaloriesLostPerMinute = 6.666666666666667;
    final float plankCaloriesLostPerMinute = 5;
    final float runningCaloriesLostPerMinute = 60;

    int pushUpDuration = human.pushUpDurationInMinute;
    int plankDuration = human.plankDurationInMinute;
    int runningDuration = human.runningDurationInMinute;


    System.out.println(
     "Pushup anda menghilangkan " + (float) (pushUpCaloriesLostPerMinute * pushUpDuration) + " kalori"
    );

    System.out.println(
     "Plank anda menghilangkan " + (float) (plankCaloriesLostPerMinute * plankDuration) + " kalori"
    );

    System.out.println(
     "Lari anda menghilangkan " + (float) (runningCaloriesLostPerMinute * runningDuration) + " kalori"
    );

    }
    
}
