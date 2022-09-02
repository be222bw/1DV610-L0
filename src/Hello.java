import java.util.Scanner;

public class Hello {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your name: ");
    String name = scanner.nextLine();
    scanner.close();
    System.out.println("Hello, " + name + "!");
  }
}
