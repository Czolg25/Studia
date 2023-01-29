package pl.epicserwer.zad1;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        multipleTwoNumbers();
        circle();
    }

    private static void circle(){//2 zad
        double radius = getNumber("Input radius value",true);

        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);

        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is = "+area);
    }

    private static void multipleTwoNumbers(){//1 zad
        double number1 = getNumber("Input first number",false);
        double number2 = getNumber("Input second number",false);
        double result = number1*number2;

        System.out.println(number1+" x "+number2+" = "+result);
    }

    private static double getNumber(String message,boolean isPositive){//do pytania o wartości
        double number;

        do{
            System.out.println(message);
            number = SCANNER.nextDouble();
        }while (isPositive&&number <= 0);

        return number;
    }
}
