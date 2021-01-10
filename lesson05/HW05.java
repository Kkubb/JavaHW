package lesson05;


public class HW05 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); //true
        System.out.println(smartDepositBox(false, true)); //true
        System.out.println(smartDepositBox(false, false)); //false
        split();
        System.out.println(smartDepositBoxVersionTwo(true, false));
        System.out.println(smartDepositBoxVersionTwo(false, true));
        System.out.println(smartDepositBoxVersionTwo(false, false));
        System.out.println(smartDepositBoxVersionTwo(true, true));
        split();

    }



    public static boolean smartDepositBoxVersionTwo(boolean mom, boolean dad) {
        return mom && dad; }

    public static boolean smartDepositBox(boolean mom, boolean dad) {
        boolean result = mom || dad;
        return result; }

    public static void split(){
        System.out.println("------------");}

}
//boolean a = (7+8)*5 > 7+8*5;//true
//boolean b = (7+8)*4 != 7+4*5;//true
//boolean c = 3+4 > 9+1 & 16-5 > 3*4;//false
//boolean d = 16/2 < 6+2 | 4+5 <= 4*5;//false or true = true
//boolean e = !(3*4 < 7+8);//not ! false



        /*

        ***
        Программирование всё больше захватывало семью Василия и они решили сделать полностью умный дом. Для
        начала они решили сделать входную дверь учитывая новые стандарты. Дверь больше нельзя открыть обычным
        ключом, пока в доме есть интернет и она подключена к электросети. Напишите тесты для программы
        smartDoorCheckKey. Заказчик(бабушка Василия), хочет, что бы мы проконтролировали работу сторонней фирмы.
        Дополнительные материалы
        Булева алгебра
        Теория множеств
        Очень неплохая статья
        simulator — симулятор логических выражений в электротехнике. Очень помог мне в своё время вспомнить булеву алгебру*/