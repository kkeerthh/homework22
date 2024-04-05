import drinksList.DrinksMachine;

public class Drinks {

    static final double COFFEE_PRICE = 22.5;
    static final double TEA_PRICE = 15.0;
    static final double LEMONADE_PRICE = 20.0;
    static final double MOJITO_PRICE = 29.9;
    static final double MINERAL_WATER_PRICE = 14.0;
    static final double COCA_COLA_PRICE = 26.5;

    static int totalDrinks = 0;
    static double totalPrice = 0.0;

    static void makeDrinks(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                totalDrinks++;
                totalPrice += COFFEE_PRICE;
                break;
            case TEA:
                totalDrinks++;
                totalPrice += TEA_PRICE;
                break;
            case LEMONADE:
                totalDrinks++;
                totalPrice += LEMONADE_PRICE;
                break;
            case MOJITO:
                totalDrinks++;
                totalPrice += MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                totalDrinks++;
                totalPrice += MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                totalDrinks++;
                totalPrice += COCA_COLA_PRICE;
                break;
            default:
                System.out.println("Неправильний вибір");
        }
    }


    static void printTotal() {
        System.out.println("Кількість напоїв: " + totalDrinks);
        System.out.println("Загальна сума: ₴" + totalPrice);
    }
}
