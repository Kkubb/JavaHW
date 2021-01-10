package lesson14;//простое форматирование


public class tableee {
    public static void main(String[] args) {
        multiplyTable(10);
    }

    public static void multiplyTable(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
               System.out.print(i * j + " " + "\t");
            }
            System.out.println();
        }
    }

}
