package lesson25;
/*2. Return the number of times that the string "code" appears anywhere
in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
(вернуть значение того, сколько раз встречается слово "code" а заданной строке, причем D может заменяться)
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
3. Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
(вернуть true, если в данной строке есть стринг "bob", причем о может быть любым чаром)
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */

public class homework25 {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));

        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
    }

    private static int countCode(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                result++;
            }
        }
        return result;
    }

    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}
