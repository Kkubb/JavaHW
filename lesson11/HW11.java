package lesson11;

/*Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b"
        conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
        fizzString("fig") → "Fizz"
        fizzString("dib") → "Buzz"
        fizzString("fib") → "FizzBuzz"/*

 */
public class HW11 {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    private static String fizzString(String str) {
        boolean magicString3 = str.startsWith("f") && str.endsWith("b");

        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }



        //1.отсеять те что начинаются на F и заканчиваются
        //2 отсеять те что просто с F
        //3 отсеять те что просто заканчиваются на b
        //4 все остальное
        //String, int, char, double, boolean
        /*первое решение:
int lastLetter = str.length()-1;
        if(str.substring(0,1).equals("f") && str.substring(lastLetter).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0,1).equals("f")) {
            return "Fizz";
        } else if (str.substring(lastLetter).equals("b")){
            return "Buzz";
        }
        return str;
        }*/


}

