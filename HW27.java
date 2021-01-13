package lesson27;

public class HW27 {
    public static void main(String[] args) {
        System.out.println("Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.\n" + "Return 0 if they both go over: ");
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println("-------");
        System.out.println("Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,\n" + "it does not count towards the sum.");
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
        System.out.println("-------");
        System.out.println("Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right\n" +
                "are gone. So \"abcd\" yields \"ad\" and \"ab**cd\" also yields \"ad\".");
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
        System.out.println("-------");
        System.out.println("Return the number of times that the string \"hi\" appears anywhere in the given string.");
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }

    private static int loneSum(int a, int b, int c) {
        int result = 0;
        if (a != b && a != c) {
            result = a;
        }
        if (b != a && b != c) {
            result += b;
        }
        if (c != a && c != b) {
            result += c;
        }
        return result;
    }

    private static int blackjack(int i, int j) {
        if (i > 21 && j > 21) {
            return 0;
        } else if (i > 21) {
            return j;
        } else if (j > 21) {
            return i;
        } else if (i > j) {
            return i;
        }
        return j;
    }

    private static String starOut(String input) {
        return input.substring(0, input.indexOf("*") - 1) + input.substring(input.lastIndexOf("*") + 2);
    }
    private static int countHi(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'h' && input.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }
}









