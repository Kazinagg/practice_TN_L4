package org.example;
import java.util.Arrays;
public class v13 {
    public static double[] sortBellShaped(double[] array_) {
        double[] array = array_.clone();
        Arrays.sort(array); // Сначала сортируем массив по возрастанию
        double[] tempArray = new double[array.length];

        int left = 0; // Индекс для начала массива
        int right = array.length - 1; // Индекс для конца массива

        for (int i = 0; i < array.length; i++) {
            // Чередуем между началом и концом массива
            if (i % 2 == 0) {
                tempArray[left++] = array[i];
            } else {
                tempArray[right--] = array[i];
            }
        }

        System.arraycopy(tempArray, 0, array, 0, array.length); // Копируем отсортированный массив обратно в исходный
        return array;
    }
}
