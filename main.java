public class Main {
  public static void main(String[] args) {

    // winter, spring, summer, autumn
    // warm jacket, T-shirt, swimming suite, rain coat

    double temp = -15.0;

    if (temp <= 5) {
      System.out.println("Wear super warm");
    }
    else if (temp <= 15) {
      System.out.println("Wear warm");
    }
    else if (temp <= 30) {
      System.out.println("Wear normal");
    }
    else {
      System.out.println("You need cooling");
    }
  }
}
