package pl.epicserwer.zad4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        luckyNumber();
        gatherThanTen();
        arrayOperations();

    }

    private static void luckyNumber(){//zad 1
        for (int i = 1; i < 21; i++) {
            if(i == 13) System.out.println("To moja szczesliwa liczba");
            System.out.println(i);
        }
    }

    private static void gatherThanTen(){//zad 2
        int[] array = getArray(10);

        for (int number : array) {
            if(number > 10) System.out.println("Liczba ("+number+") > 10");
            if(number < 10) System.out.println("Liczba ("+number+") < 10");
        }
    }

    private static void arrayOperations(){//zad 4
        int[] array = getArray(50);

        System.out.println(getArrayString(array));
        Arrays.sort(array);
        System.out.println(getArrayString(array));

        HashMap<Integer,Integer> elementsHashmap = getHashmapElementsArray(array);
        System.out.println(elementsHashmap);
        System.out.println("Suma elementow "+getSumOfArrayElements(array));
        System.out.println("Suma elementow "+getSumOfArrayElements(elementsHashmap));//wykorzystuje hashmape

    }

    private static int[] getArray(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = RANDOM.nextInt(20);
        return array;
    }

    private static String getArrayString(int[] array){
        StringBuilder stringBuilder = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if((i+1) != array.length) stringBuilder.append(",");
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    
    private static HashMap<Integer,Integer> getHashmapElementsArray(int[] array){
        HashMap<Integer,Integer> elementsHashmap = new HashMap<>();

        for (int number : array)
            elementsHashmap.put(number,elementsHashmap.getOrDefault(number,0)+1);

        
        return elementsHashmap;
    }

    private static int getSumOfArrayElements(int[] array){
        int sum = 0;

        for (int number : array) sum+=number;

        return sum;
    }

    private static int getSumOfArrayElements(HashMap<Integer,Integer> elementsHashmap){
        int sum = 0;

        for (Integer integer : elementsHashmap.keySet())
            sum = integer*elementsHashmap.get(integer);

        return sum;
    }
}
