package app;

public class Challange {
  public static void main(String[] args) {
    byte myByteValue = 10;
    short myShortValue = 20;
    int IntValue = 50;

    long longTotal = 50000L + 10L * (myByteValue + myShortValue + IntValue);
    System.out.println("the total is: " + longTotal);

    short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + IntValue));
    System.out.println(shortTotal);
  }
}