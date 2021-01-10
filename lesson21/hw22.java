package lesson21;

public class hw22 {


    public static void main(String[] args) {
        int[] a1 = new int[]{};
        double[] array = generateDoubleArray();
        array = insertedElement(array, 15.120, 5);
        array = updateElement(array, 9.00, 10);
        array = deleteElement(array, 3);

    }

    //1 Plz create random double array with size = 10;
    private static double[] generateDoubleArray() {
        double[] output = new double[10];
        for (int i = 0; i < output.length; i++) {
            output[i] = randomNumber();
        }
        return output;

    }

    public static double randomNumber() {
        double randomNumber = Math.random() * 10000;
        int temp = (int) (randomNumber);
        double temp2 = temp;
        return temp2 / 100;
    }

    //2 Plz insert new element on specific index into array
    public static double[] insertedElement(double[] array, double element, int index) {
        double[] output = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        output[index] = element;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = array[i - 1];
        }
        return output;
    }

    //Plz update one element on specific index
    public static double[] updateElement(double[] array, double element, int index) {
        double[] output = array;
        for (int i = 0; i < output.length; i++) {
            if (i == index) {
                output[i] = element;
            }
        }
        return output;
    }

    //Plz delete one element on specific index.
    private static double[] deleteElement(double[] array, int index) {
        double[] output = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        for (int i = index + 1; i <= output.length; i++) {
            output[i - 1] = array[i];
        }
        return output;
    }

    //Plz print the array with magic color.
    public static void printInColor(int[] output) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        System.out.print(ANSI_BLUE + generateDoubleArray() + ANSI_RESET);
        for (int i = 0; i < output.length; i++) {
            System.out.print(ANSI_PURPLE + ANSI_BLUE + output[i] + generateDoubleArray() + ANSI_RESET);
        }
        System.out.println(ANSI_RED + generateDoubleArray() + ANSI_RESET);
    }

    public static void printIntArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printDoubleArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

}
