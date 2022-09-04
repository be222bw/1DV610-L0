import java.util.Scanner;

public class Hello {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your name: ");
    String name = scanner.nextLine();
    scanner.close();

    String[] phoneticAlphabet = {"Alfa", "Bravo", "Charlie", "Delta",
      "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima",
      "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra",
      "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu"};

    StringBuilder natoName = new StringBuilder(); 
    for (int i = 0; i < name.length(); i++) {
      char letter = Character.toUpperCase(name.charAt(i));
      if (letter >= 65 && letter <= 90) {
        natoName.append(phoneticAlphabet[
          (int) Character.toUpperCase(letter) - 'A']);
      } else if (letter == 'Å') {
        natoName.append("Alfa Alfa");
      } else if (letter == 'Ä') {
        natoName.append("Alfa Echo");
      } else if (letter == 'Ö') {
        natoName.append("Oscar Echo");
      }
      if (i < name.length() - 1) {
        natoName.append(" ");
      }
    }
    System.out.println("Hello, " + natoName.toString() + ".");
  }
}
