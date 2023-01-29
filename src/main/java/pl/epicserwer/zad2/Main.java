package pl.epicserwer.zad2;

public class Main {
    public static void main(String[] args) {
        Hour hour = new Hour(86399);//4 zad stworzenie obiektu
        System.out.println(hour);//wypisanie na ekranie

        double inch = 1_000.0;
        System.out.println(inch+" inch is "+inchesToMeters(inch)+" meters");//5 zad wypisanie na ekranie oraz wywołanie inchesToMeters
    }

    private static double inchesToMeters(double inches){//metoda przekształcająca cale na metry
        return 0.0254*inches;
    }
}
