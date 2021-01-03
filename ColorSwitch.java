import java.util.Scanner;

public class ColorSwitch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj pierwszą litere koloru:");
        String firstLetter = s.nextLine();


        switch (firstLetter) {
            case "b":
                System.out.println("Biały");
            break;
            case "c":
                System.out.println("Cytrynowy");
            break;
            case "d":
                System.out.println("Dzika róża");
            break;
            case "e": System.out.println("Emaliowy");
            break;

            default: System.out.println("Nie ma takiego koloru w bazie");
        }
    }

}
