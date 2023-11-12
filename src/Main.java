import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Party Affiliation:(D/R/I) ");
        String partyChoice = scanner.nextLine();

        String symbol = "Other";
        if ("D".equals(partyChoice)) {
            symbol = "Democratic Donkey";
        } else if ("R".equals(partyChoice)) {
            symbol = "Republican Elephant";
        } else if ("I".equals(partyChoice)) {
            symbol = "Independent Person";
        }

        System.out.println("You get a " + symbol + ".");

    }
}
