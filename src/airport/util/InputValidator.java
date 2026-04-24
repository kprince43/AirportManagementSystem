package airport.util;

import java.util.Scanner;

public class InputValidator {

    // Validate menu option (e.g. 1 or 2)
    public static int getValidOption(Scanner sc, int min, int max) {
        int option;

        while (true) {
            try {
                option = Integer.parseInt(sc.nextLine());

                if (option < min || option > max) {
                    System.out.print("Invalid choice. Enter a number between "
                            + min + " and " + max + ": ");
                } else {
                    return option;
                }

            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    // Validate non-empty string
    public static String getNonEmptyString(Scanner sc, String fieldName) {
        String input;

        while (true) {
            input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.print(fieldName + " cannot be empty. Re-enter: ");
            } else {
                return input;
            }
        }
    }

    // Validate passport format (simple example)
    public static String getValidPassport(Scanner sc) {
        String passport;

        while (true) {
            passport = sc.nextLine().trim();

            if (!passport.matches("[A-Z0-9]{6,9}")) {
                System.out.print(
                        "Invalid passport format. Use 6–9 uppercase letters/numbers: "
                );
            } else {
                return passport;
            }
        }
    }
}