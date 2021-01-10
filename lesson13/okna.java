package lesson13;

public class okna {
    public static void main(String[] args) {
        double finalPrice = countCost(8, 4,180, 175 );
        System.out.println("Итого " + finalPrice);
    }

    private static double countCost(int doors, int windows, double hight, double width) {

        return doorsPrice(doors) + windowsPrice(windows, hight, width);

    }
    private static double doorsPrice(int doors) {
        double doorsMeterPrice = 120.0;
        double framePrice = 100;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a +b)* 2;
        double area = a*b;
        return (perimeter * framePrice * area * doorsMeterPrice) *doors;

    }
    private static double windowsPrice(int windows, double hight, double width){
        double meterHight = hight /100;
        double meterWidth = width /100;
        double framePrice = 100;
        double glassPrice = 100;
        double perimeter = (meterHight + meterWidth) *2;
        double area = meterHight * meterWidth;
        return (perimeter * framePrice * area * glassPrice) * windows;

    }

}
