package homework1709;

import enums.Month;

public class MainMonth {
    public static void main(String[] args) {

        Month month = Month.FEBRUARY;
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("The season is winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("The season is spring");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("The season is summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("The season is autumn");
                break;
        }
    }

}

