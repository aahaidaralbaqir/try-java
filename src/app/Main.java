package app;

public class Main {
  public static void main(String[] args) {  
    Car porsche = new Car();
    Car holder  = new Car();
    
    holder.setModel("MANTAP");
    System.out.println("the model is: " + holder.getModel());
  }
}