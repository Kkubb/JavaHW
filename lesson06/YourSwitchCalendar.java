package lesson06;

public class YourSwitchCalendar {
    public static void main(String[] args) {
        String month = "January";
        System.out.println(stringToIntMonthNumber(month));


    }
    public static int stringToIntMonthNumber(String month){

        int monthNumber = 0;
        switch(month){
            case "January":
                monthNumber = 1;
                break;
            case "Feb":
                monthNumber = 2;
                break;
                case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
                case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
                case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
                case "Sept":
                monthNumber = 9;
                break;
            case "Oct":
                monthNumber = 10;
                break;
                case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;


        }

        return monthNumber;
    }




}
