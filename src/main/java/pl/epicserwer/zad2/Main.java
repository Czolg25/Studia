package pl.epicserwer.zad2;

public class Main {
    public static void main(String[] args) {
        Hour hour = new Hour(86399);//4 zad
        System.out.println(hour);

        double inch = 1_000.0;
        System.out.println(inch+" inch is "+inchesToMeters(inch)+" meters");//5 zad
    }

    private static double inchesToMeters(double inches){
        return 0.0254*inches;
    }
}
