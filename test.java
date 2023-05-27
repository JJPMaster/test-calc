import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    try {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter your first number: ");
      int numberA = myObj.nextInt();
      System.out.println("Enter your second number: ");
      int numberB = myObj.nextInt();
      System.out.println("What operation would you like to be performed? Type + for addition, - for subtraction, * for multiplication, or / for division.");
      myObj.nextLine();
      String operation = myObj.nextLine();
      switch (operation) {
        case "+":
          int sum = numberA + numberB;
          System.out.println(numberA + " + " + numberB + " = " + sum);
          break;
        case "-":
          int difference = numberA - numberB;
          System.out.println(numberA + " - " + numberB + " = " + difference);
          break;
        case "*": 
          int product = numberA * numberB;
          System.out.println(numberA + " * " + numberB + " = " + product);
          break;
        case "/":
          float floatA = (float) numberA;
          float floatB = (float) numberB;
          float quotient = floatA / floatB;
          System.out.println(numberA + " / " + numberB + " = " + quotient);
          break;
        default:
          System.out.println("Sorry, your operation must be '+', '-', '*', or '/'.");
      }
    }
    catch(Exception e) {
      System.out.println("Sorry, your input must be a 32-bit integer.");
      System.exit(0);
    }
  }
}
