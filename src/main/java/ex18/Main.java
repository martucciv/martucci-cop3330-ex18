package ex18;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */

public class Main {
    public static void main(String[] args){
        Main app = new Main();
        Input input = new Input();
        input.main();
        double finalTemp = app.computeConversion(input.input1, input.temp);
        app.printOutput(input.input1, finalTemp);
    }

    public double computeConversion(String input1, double temp){
        double tConverted = 0;

        if(input1.equals("C")){
            tConverted = (temp - 32) * (5.0 / 9);
        }
        else if(input1.equals("F")){
            tConverted = (temp * (9.0 / 5)) +32;
        }
        return tConverted;
    }

    public void printOutput(String input1, double finalTemp){
        String type = "";
        if(input1.equals("C")){
            type = "Celsius";
        }
        else if(input1.equals("F")){
            type = "Fahrenheit";
        }
        System.out.printf("The temperature in " +type+ " is %.2f", finalTemp);
    }
}