package ex18;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Input {
    String input1;
    double temp;
    Scanner scanner = new Scanner(System.in);

    public void main(){
        this.input1 = getTempType();
        this.input1 = this.input1.toUpperCase();
        this.temp = inputTemp(this.input1);
    }

    public String getTempType(){
        System.out.print("""
                Press C to convert from Fahrenheit to Celsius.
                Press F to convert from Celsius to Fahrenheit.
                Your choice:\s""");
        return scanner.next();
    }

    public double inputTemp(String input1){
        if(this.input1.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String input2 = scanner.next();
            this.temp = Double.parseDouble(input2);
        }
        else if(input1.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            String input2 = scanner.next();
            this.temp = Double.parseDouble(input2);
        }
        return this.temp;
    }
}
