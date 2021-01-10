package lesson05;

public class HW_05 {

    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true));
        System.out.println(bigBadaBoom(false, false));
        System.out.println(bigBadaBoom(true, false));
    }

    public static boolean bigBadaBoom(boolean cap1, boolean cap2) {
        return cap1 && cap2;
    }
}




 /* Родители Василия добились успехов в программировании и смогли передать свои знания сыну. Василий вырос и
        запрограммировал систему аварийного уничтожения первых космических кораблей земли, улетевших в Альфа-
        Центавру. Система уничтожения реагирует на ввод команд двух старших офицеров корабля.
        bigBadaBoom(true, true) -> true
        bigBadaBoom(false, false) -> false
        bigBadaBoom(true, false) -> false */


