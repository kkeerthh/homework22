import drinksList.DrinksMachine;

public class Drinks {
    enum DrinkType {
        COFFEE(22.5),
        TEA(15.0),
        LEMONADE(20.0),
        MOJITO(27.5),
        MINERAL_WATER(15.6),
        COCA_COLA(33.0);
        private final double price;

        DrinkType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    static private int totalDrinks = 0;
    static private double totalPrice = 0.0;

    void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Готується кава...");
                totalDrinks++;
                totalPrice += DrinkType.COFFEE.getPrice();
                break;
            case TEA:
                System.out.println("Готується чай...");
                totalDrinks++;
                totalPrice += DrinkType.TEA.getPrice();
                break;
            case LEMONADE:
                System.out.println("Готується лимонад...");
                totalDrinks++;
                totalPrice += DrinkType.LEMONADE.getPrice();
                break;
            case MOJITO:
                System.out.println("Готується мохіто...");
                totalDrinks++;
                totalPrice += DrinkType.MOJITO.getPrice();
                break;
            case MINERAL_WATER:
                System.out.println("Готується мінеральна вода...");
                totalDrinks++;
                totalPrice += DrinkType.MINERAL_WATER.getPrice();
                break;
            case COCA_COLA:
                System.out.println("Готується кока-кола...");
                totalDrinks++;
                totalPrice += DrinkType.COCA_COLA.getPrice();
                break;
            default:
                System.out.println("Неправильний вибір.");
        }
    }

    void displayTotal() {
        System.out.println("Загальна кількість напоїв: " + totalDrinks);
        System.out.println("Загальна сума до оплати: ₴" + totalPrice);
    }
}