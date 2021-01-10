package lesson16;

public class multiplyTable {
    public static void main(String[] args) {
        multiplyTable(10);

    }
    public static void multiplyTable(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                String placeInTable = formatPlaceInMPTable(i,j);
                System.out.print(placeInTable);
            }
            System.out.println();
        }
    }


    private static String formatPlaceInMPTable(int i, int j) {
        String result = "";
        int input = i*j;
        if (input<10) {
            result = "  " + input;
        } else if(input >= 100) {
            result = "" + input;
        } else {
            result = " " + input;
        }
        return result;

    }
}
