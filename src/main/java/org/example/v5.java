package org.example;

public class v5 {
    public static double[] smoothArray(double[] array_) {
        double[] array = array_.clone();
        double sum = 0;
        for (int K = 0; K < array.length; K++) {
            sum += array[K]; // Добавляем K-й элемент к сумме
            array[K] = sum / (K + 1); // Заменяем K-й элемент на среднее
        }
        return array;
    }
}
