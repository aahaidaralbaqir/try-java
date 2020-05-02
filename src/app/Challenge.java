package app;

public class Challenge {
  public static void main(String[] args) {
    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("ahmad", highScorePosition);
  }

  public static void displayHighScorePosition(String playerName, int rank) {
    System.out.println(playerName + " managed to get into position " + rank + " on the high score table");
  }

  public static int calculateHighScorePosition( int playerScore) {
    if(playerScore > 1000 ) {
      return 1;
    }else if(playerScore > 500 && playerScore < 1000) {
      return 2;
    }else if(playerScore > 100 && playerScore < 500) {
      return 3;
    }else {
      return 4;
    }
  }
}