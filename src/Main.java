import drinksList.DrinksMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Оберіть напій/напої:");

                while (true) {
                    System.out.println("Доступні напої:");
                    System.out.print("-1. Кава \n-2. Чай \n-3. Лимонад\n-4. Мохіто\n" +
                    "-5. Мінеральна вода\n-6. Кока-кола\n-7. Завершити замовлення\n");

                    System.out.print("Оберіть номер напою:");
                    int makeAChoice = scanner.nextInt();

                   if (makeAChoice == 7) {
                        break;
                    }

                    switch (makeAChoice) {
                        case 1:
                            Drinks.makeDrinks(DrinksMachine.COFFEE);
                            break;
                        case 2:
                            Drinks.makeDrinks(DrinksMachine.TEA);
                            break;
                        case 3:
                            Drinks.makeDrinks(DrinksMachine.LEMONADE);
                            break;
                        case 4:
                            Drinks.makeDrinks(DrinksMachine.MOJITO);
                            break;
                        case 5:
                            Drinks.makeDrinks(DrinksMachine.MINERAL_WATER);
                            break;
                        case 6:
                            Drinks.makeDrinks(DrinksMachine.COCA_COLA);
                            break;
                        default:
                            System.out.println("Неправильний вибір");
                            System.out.println();
                    }
                }
                 Drinks.printTotal();
            }
        }

