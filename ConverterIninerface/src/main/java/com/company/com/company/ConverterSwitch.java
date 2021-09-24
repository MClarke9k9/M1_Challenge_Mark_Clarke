package com.company;



public class ConverterSwitch implements Converter{

    private int num;

    public ConverterSwitch(){
    };


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ConverterSwitch(int num) {
        this.num = num;
    }

    @Override
    public String convertMonth(int monthNumber){


        switch (monthNumber) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("You must choose a number 1 - 12");
        }


        return null;
    }


    @Override
    public String convertDay(int dayNumber){


        switch (dayNumber) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("You must choose a number 1 - 7");
        }

        return null;
    }






}