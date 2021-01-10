package lesson04;

public class HW4_01_symbols {

        public static void main (String[] args){

            char euroSymbol = '€';
            System.out.println(euroSymbol);
            char dollar = '$';
            System.out.println(dollar);
            String smiley = "\u263A";
            System.out.println(smiley);
            char copyright = '\u00A9';
            System.out.println(copyright);
            char telephone = '\u260e';
            System.out.println(telephone);
            char paragraph = '\u00a7';
            System.out.println(paragraph);
            char trademark= '\u0099';
            System.out.println(trademark);
            //почему же не выводит?
            char rouble = '\u20bd';
            System.out.println(rouble);
            char hearts = '\u2665';
            System.out.println(hearts);
            char chess = '\u265e';
            System.out.println(chess);
            char zodiac = '\u2648';
            System.out.println(zodiac);
            char death = '\u2620';
            System.out.println(death);
            char note = '\u266b';
            System.out.println(note);
            char soviets = '\u262d';
            System.out.println(soviets);

        }
    }
//небольшой вопрос по этому заданию, почему некоторые символы,
// такие как например эмотиконс, например смайлик с hex кодом 1f600, не читается?

