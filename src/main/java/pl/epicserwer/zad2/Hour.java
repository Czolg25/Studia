package pl.epicserwer.zad2;

public class Hour {
    private final int second;
    private final int minute;
    private final int hour;

    public Hour(long second){//kontuktor

        //oblicza sekundy godziny i minuty
        this.second = (int) (second % 60);
        second = (second - this.second) / 60;

        this.minute = (int) (second % 60);
        second = (second - this.minute) / 60;

        this.hour = (int) (second % 24);
    }

    @Override//metoda to String
    public String toString() {
        return this.hour+":"+this.minute+":"+this.second;
    }
}
