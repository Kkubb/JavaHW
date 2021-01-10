package holidayHW;

public class enigmaCaesar {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
    }

    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + symbolCode(input.charAt(i));
        }
        return output;
    }

    private static char symbolCode(char symbol) {
        char result = 0;
        // 1. result = (char) (symbol + 3);
        // 2. первый плюс исключения через ифы
        // 3. Сделать свою таблицу инпута и оутпута черер Стринг или через массив символов
        // 4. Switch
        String input = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ,.";
        String output = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв ,.";

        int index = input.indexOf(symbol);
        result = output.charAt(index);
        return result;
    }
}