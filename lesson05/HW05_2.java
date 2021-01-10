package lesson05;

public class HW05_2 {
    public static void main(String[] args) {
        System.out.println(doorbell(true, true));
        System.out.println(doorbell(false, false));
        System.out.println(doorbell(true, false));
    }

    public static boolean doorbell(boolean bell1, boolean bell2) {
        return bell1 ^ bell2;
        //return !(bell1 == bell2);
        //return bell1 != bell2;
    }
}



        /* На даче у родителей Васи Сидорова решили поставить звонок, который должен звонить при нажатии на кнопку
        звонка у калитки или у двери дома. Если соседские дети начинают играться и нажимать на кнопки звонка
        одновременно и на калитке и на доме, звонок не должен реагировать. Напишите программу управления звонком.
        doorbell(true, true) -> false
        doorbell(false, false) -> false
        doorbell(true, false) -> true*/
