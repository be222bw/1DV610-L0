import java.util.Scanner;

public class Hello {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your name: ");
    String name = scanner.nextLine();

    int sum = 0;
    for (int i = 0; i < name.length(); i++) {
      sum += (int) name.charAt(i);
    }
    int mean = sum / name.length();

    scanner.close();
    System.out.println("Hello, " + name + ".");
    System.out.println("The mean value of your name is " +
      mean + ", whose corresponding Unicode character is '" +
      (char) mean + "'.");
  }
}
