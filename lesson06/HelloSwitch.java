package lesson06;

public class HelloSwitch {
    /*за пятерку по контрольной в Java - велосипед
    за четверку - goPro
    за тройку не будут ругать
    за двойку отругают
    за кол ""
     */
    public static void main(String[] args) {
        int yearGrade = 1;
        int score = 3;

        myFirstSwitch(yearGrade);
        myFirstSwitch(score);
        System.out.println(myFirstSwitch(5));
    }

    public static String myFirstSwitch(int schoolScore) {
        String prize = "";//оператор выбора или ключевое слово, конструкт
        switch(schoolScore){
            case 1:
                prize = "better not even ask";
                break;
            case 2:
                prize = "отругают";
                break;
            case 3:
                prize = "не отругают";
                break;
            case 4:
                prize = "GoPro";
                break;
            case 5:
                prize = "bike";
                break;
            default:
                prize = "таких оценок не существует"; //прописывается для остальных случаев ВСЕГДА
                break;
        }
        return prize;
    }
}
