import drinksList.DrinksMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Drinks drinks = new Drinks();

        System.out.println("Ціни на напої:");
        for (Drinks.DrinkType drinkType : Drinks.DrinkType.values()) {
            System.out.println(drinkType + ": ₴" + drinkType.getPrice());
        }

        System.out.println("\nВиберіть напій:");
        for (DrinksMachine drink : DrinksMachine.values()) {
            System.out.println((drink.ordinal() + 1) + ". " + drink);
        }

        System.out.println("Для виходу натисніть 0");

        while (true) {
            System.out.print("Ваш вибір: ");
            String choice = scanner.nextLine();
            if (choice.equals("0")) {
                break;
            } else if (choice.matches("\\d+")) {
                int numericChoice = Integer.parseInt(choice);
                if (numericChoice >= 1 && numericChoice <= DrinksMachine.values().length) {
                    drinks.makeDrink(DrinksMachine.values()[numericChoice - 1]);
                } else {
                    System.out.println("Неправильний вибір.");
                }
            } else {
                try {
                    DrinksMachine chosenDrink = DrinksMachine.valueOf(choice.toUpperCase());
                    drinks.makeDrink(chosenDrink);
                } catch (IllegalArgumentException e) {
                    System.out.println("Неправильний вибір.");
                }
            }
        }

        drinks.displayTotal();

        scanner.close();
    }
}