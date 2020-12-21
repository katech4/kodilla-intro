import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class LeapYear {

     private static boolean LeapYear(int year)
        {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }

        public static void main(String[] args) {
            int year;

            Scanner in = new Scanner(System.in);
            System.out.println("Podaj rok do sprawdzenia.");
            year = in.nextInt();

            if (LeapYear(year)){
                System.out.println("Podany rok jest przestepny.");
            }
            else {
                System.out.println("Podany rok nie jest przestepny.");
            }
        }
    }