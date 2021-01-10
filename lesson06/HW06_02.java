package lesson06;
/* Напишите программу действий кассира магазина,
если у него пытаются купить алкоголь следующие 5 покупателей: 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
 */
public class HW06_02 {

    public static void main(String[] args) {

        System.out.println(myFirstSwitch(11));
    }

    public static String myFirstSwitch(int algoholismAge) {
        String cashierReply = "";
        switch(algoholismAge){
            case 10:
                cashierReply = "I am gonna call your mom right now";
                break;
            case 17:
                cashierReply = "Sorry no, better go do your exams";
                break;
            case 18:
                cashierReply = "Not in this country";
                break;
            case 20:
                cashierReply = "Too soon, sorry no";
                break;
            case 30:
                cashierReply = "Yes, sure, there is a discount is you take two";
                break;
            default:
                cashierReply = "Show me your passport";
                break;
        }
        return cashierReply;
    }
}


