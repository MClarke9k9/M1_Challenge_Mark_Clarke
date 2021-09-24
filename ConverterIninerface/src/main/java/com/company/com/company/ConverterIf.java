package com.company;

public class ConverterIf implements Converter{


    private int num;


    public ConverterIf(int num) {
        this.num = num;
    }

    public ConverterIf() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String convertMonth(int monthNumber) {


        if (monthNumber == 1) {
            System.out.println("January");
        }
        else if (monthNumber == 2) {
            System.out.println("February");
        }
        else if (monthNumber == 3) {
            System.out.println("March");
        }
        else if (monthNumber == 4) {
            System.out.println("April");
        }
        else if (monthNumber == 5) {
            System.out.println("May");
        }
        else if(monthNumber == 6) {
            System.out.println("June");
        }
        else if(monthNumber == 7) {
            System.out.println("July");
        }
        else if (monthNumber == 8) {
            System.out.println("August");
        }
        else if (monthNumber == 9) {
            System.out.println("September");
        }
        else if(monthNumber == 10) {
            System.out.println("October");
        }
        else if (monthNumber == 11) {
            System.out.println("November");
        }
        else if (monthNumber == 12) {
            System.out.println("December");
        }
        else {
            System.out.println("Not a valid number. Must be 1 - 12");
        }
        return null;
    }




    @Override
    public String convertDay(int dayNumber) {


        if (dayNumber == 1) {
            System.out.println("Sunday");
        }
        else if (dayNumber == 2) {
            System.out.println("Monday");
        }
        else if (dayNumber == 3) {
            System.out.println("Tuesday");
        }
        else if (dayNumber == 4) {
            System.out.println("Wednesday");
        }
        else if (dayNumber == 5) {
            System.out.println("Thursday");
        }
        else if(dayNumber == 6) {
            System.out.println("Friday");
        }
        else if(dayNumber == 7) {
            System.out.println("Saturday");
        }

        else {
            System.out.println("Not a valid number. Must be 1 - 7");
        }
        return null;
    }

};
