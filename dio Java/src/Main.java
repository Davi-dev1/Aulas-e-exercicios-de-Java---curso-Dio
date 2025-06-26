import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem ?");
        var age = scanner.nextInt();
        System.out.println("você é emancipado ?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >=18 || isEmancipated && age >= 16;
        System.out.printf("Voce pode dirigir ? (%s) \n ", canDrive);

    }
}