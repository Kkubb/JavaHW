package lesson16;

public class genPassword {
    public static void main(String[] args) {
        //generate 10 passwords
        //1symbol
        //2password
        //repeat how may times
        //System.out.println(giveMeChar(97, 122));
        //System.out.println(giveMeChar('a', 'z'));
        //System.out.println(giveMePass(20));
        mTimesPassGenerate(10);

    }

    public static void mTimesPassGenerate(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(giveMePass(20));
        }
    }

    private static String giveMePass(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + giveMeChar(97, 122);
        }
        return result;
    }


    private static String giveMeChar(int min, int max) {
        String result = "";
        char myChar = (char) (Math.random() * (max - min) + 1 + min);
        result = "" + myChar;
        return result;
    }
}
