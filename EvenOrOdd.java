import java.io.Console;

public class EvenOrOdd {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number.  I will let you know if the numbers from 1 to that number is even or odd.");
    String stringNumber = myConsole.readLine();
    Integer number = Integer.parseInt(stringNumber);

    for (Integer index = 1; index <= number; index++) {
      if (index % 2 == 0) {
        System.out.println(index + " is even.");
      } else {
        System.out.println(index + " is odd.");
      }
    }
  }
}
