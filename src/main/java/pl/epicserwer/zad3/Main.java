package pl.epicserwer.zad3;

public class Main {
    public static void main(String[] args) {
        charByIdFromString("Java Exercises",10);
        System.out.println(addTwoString("PHP Exercises and ","Java Exercises"));
    }

    private static void charByIdFromString(String string,int id){//1 zad
        if(string.length() <= id) return;//aby nie wyszedł poza id
        String letter = string.split("")[id];//zwrócenie litery
        System.out.println("The character at position "+id+" is "+letter);//wyświetlenie
    }

    private static String addTwoString(String string1,String string2){//3 zad
        return string1+string2;
    }//konkatenacja 2 stringow
}
