package lesson16;

public class coffeeMachine {

    //public static void main(String[] args) {
    //    americano();
    //    cappuccino();
    //    latte();}

    public static void cappuccino() {
        System.out.println("Cappuccino ready");
        hotWater(20);
        coffee(40);
        milk(30);
        System.out.println("-------");
    }

    public static void tee() {
        System.out.println("Take your hot water");
        hotWater(100);
    }

    public static void latte() {
        System.out.println("Latte ready");
        hotWater(70);
        coffee(30);
        milk(40);
        System.out.println("-------");
    }


    public static void americano() {
        System.out.println("Americano ready");
        hotWater(100);
        coffee(20);
        milk(0);
        System.out.println("-------");
    }

    public static void hotWater(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    private static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }

    private static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }


}
