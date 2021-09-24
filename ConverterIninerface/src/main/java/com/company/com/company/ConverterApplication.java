
package com.company;


public class ConverterApplication {

    public static void main(String[] args) {


        ConverterIf ifInput = new ConverterIf();
        ConverterSwitch switchInput = new ConverterSwitch();

        ifInput.convertMonth(2);
        ifInput.convertDay(3);

        switchInput.convertMonth(4);
        switchInput.convertDay(5);


    }

}
