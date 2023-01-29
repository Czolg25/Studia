package pl.epicserwer.zad1;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        multipleTwoNumbers();
        circle();
    }

    private static void circle(){//2 zad
        double radius = getNumber("Input radius value",true);//pobranie wartości

        double perimeter = 2*Math.PI*radius;//obliczenie obwodu
        double area = Math.PI*Math.pow(radius,2);//obliczenie pola

        System.out.println("Perimeter is = "+perimeter);//wypisanie na ekranie
        System.out.println("Area is = "+area);//wypisanie na ekranie
    }

    private static void multipleTwoNumbers(){//1 zad
        double number1 = getNumber("Input first number",false);//pobranie wartości
        double number2 = getNumber("Input second number",false);//pobranie wartości
        double result = number1*number2;//wymnożenie i zapisanie w osobnej zmiennej

        System.out.println(number1+" x "+number2+" = "+result);//wypisanie na ekranie
    }

    private static double getNumber(String message,boolean isPositive){//metoda która zwraca double isPositive czy dodatnie
        double number;

        do{
            System.out.println(message);//wyświetla wiadomość
            number = SCANNER.nextDouble();//odczytanie doubie można dodać try catch
        }while (isPositive&&number <= 0);//sprawdzenie warunku

        return number;
    }
}
