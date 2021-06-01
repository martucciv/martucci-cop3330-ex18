import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Input input = new Input();
        input.main();
        Calculation calc = new Calculation();
        double finalTemp = calc.main(input.input1, input.temp);

        if(input.input1.equals("C")){
            System.out.printf("The temperature in Celsius is %.2f", finalTemp);
        }
        else if(input.input1.equals("F")){
            System.out.printf("The temperature in Fahrenheit is %.2f", finalTemp);
        }
    }
}


class Input{
    String input1;
    double temp;

    public void main(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        this.input1 = scanner1.next();
        this.input1 = this.input1.toUpperCase();

        Scanner scanner2 = new Scanner(System.in);

        if(this.input1.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String input2 = scanner2.next();
            this.temp = Double.parseDouble(input2);
        }
        else if(input1.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            String input2 = scanner2.next();
            this.temp = Double.parseDouble(input2);
        }
    }
}

class Calculation{
    public double main(String input1, double temp){
        double tConverted = 0;

        if(input1.equals("C")){
            tConverted = (temp - 32) * (5.0 / 9);
        }
        else if(input1.equals("F")){
            tConverted = (temp * (9.0 / 5)) +32;
        }
        return tConverted;
    }
}
