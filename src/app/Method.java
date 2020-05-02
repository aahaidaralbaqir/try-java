package app;

public class Method {
  public static void main(String [] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 10;
    calculateNumber(gameOver, score, levelCompleted, bonus);
    calculateNumber(true, 100, 1, 100);
  } 

  public static void calculateNumber(
    boolean gameOver, 
    int score, 
    int levelCompleted,
    int bonus) {
      if(gameOver) {
        int finalScore = score + (levelCompleted + bonus);
        finalScore += 2000;

        System.out.println("Your final score was :" + finalScore);

      }
  }
}