package lesson03;

public class ex06 {
    public static void main(String[] args) {
        countMoneyIntheBank(1000, 7);

    }
    public static double countMoneyIntheBank (double money, int years) {
        double interest = 3.5;
        double output;
        output = (money / 100) * interest + years;
        return output;



    }
}
