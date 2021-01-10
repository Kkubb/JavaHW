package lesson16;

public class coffeeeVendingStarter {
    public static void main(String[] args) {
        myChoice(3);
    }

    public static void myChoice(int customerChoice) {
        switch (customerChoice) {
            case 3:
                coffeeMachine.latte();
                break;
            case 1:
                coffeeMachine.americano();
                break;
            case 2:
                coffeeMachine.cappuccino();
                break;
            case 4:
                coffeeMachine.tee();
                break;
            default:
                coffeeMachine.hotWater(100);
                break;

        }

    }
}
