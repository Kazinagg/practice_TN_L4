package org.example;

public class v3 {
    public static int[] findMinAndMaxIndexes(double[] array) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex}; // Возвращает массив с двумя индексами
    }
}
