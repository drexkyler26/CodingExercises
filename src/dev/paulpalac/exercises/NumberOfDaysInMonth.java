package dev.paulpalac.exercises;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(3412));
        System.out.println(isLeapYear(6468));
        System.out.println(getDaysInMonth(2,3412 ));
        System.out.println(getDaysInMonth(12,6468 ));
    }
    public static boolean isLeapYear(int year){
        if((year < 1) || (year > 9999)){
            return false;
        }else{
            if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
                return true;
            }else{
                return false;
            }
        }
    }
    public static int getDaysInMonth(int month, int year){

        if(((month < 1) || (month > 12)) ||
                ((year < 1) || (year > 9999))){
            return -1;
        }else{
            if(isLeapYear(year)) {
                int monthNumber;
                switch (month) {
                    case 1:
                        monthNumber = 31;
                        break;
                    case 2:
                        monthNumber = 29;
                        break;
                    case 3:
                        monthNumber = 31;
                        break;
                    case 4:
                        monthNumber = 30;
                        break;
                    case 5:
                        monthNumber = 31;
                        break;
                    case 6:
                        monthNumber = 30;
                        break;
                    case 7:
                        monthNumber = 31;
                        break;
                    case 8:
                        monthNumber = 31;
                        break;
                    case 9:
                        monthNumber = 30;
                        break;
                    case 10:
                        monthNumber = 31;
                        break;
                    case 11:
                        monthNumber = 30;
                        break;
                    case 12:
                        monthNumber = 31;
                        break;
                    default:
                        monthNumber = -1;
                        break;
                }
                return monthNumber;
            }else {
                int monthNumber;
                switch (month) {
                    case 1:
                        monthNumber = 31;
                        break;
                    case 2:
                        monthNumber = 28;
                        break;
                    case 3:
                        monthNumber = 31;
                        break;
                    case 4:
                        monthNumber = 30;
                        break;
                    case 5:
                        monthNumber = 31;
                        break;
                    case 6:
                        monthNumber = 30;
                        break;
                    case 7:
                        monthNumber = 31;
                        break;
                    case 8:
                        monthNumber = 31;
                        break;
                    case 9:
                        monthNumber = 30;
                        break;
                    case 10:
                        monthNumber = 31;
                        break;
                    case 11:
                        monthNumber = 30;
                        break;
                    case 12:
                        monthNumber = 31;
                        break;
                    default:
                        monthNumber = -1;
                        break;
                }
                return monthNumber;
            }
        }
    }
}
