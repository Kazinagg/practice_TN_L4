package org.example;

public class v6 {
    public static void smoothArray(double[] array_) {
        double[] array = array_.clone();
        for (int times = 0; times < 5; times++) { // Пятикратное сглаживание
            for (int K = 1; K < array.length; K++) {
                array[K] = (array[K - 1] + array[K]) / 2.0; // Сглаживание элемента AK
            }
            printArray(array, times + 1); // Вывод результатов после каждого сглаживания
        }
    }

    public static void printArray(double[] array, int iteration) {
        System.out.println("Результат сглаживания " + iteration + ":");
        for (double v : array) {
            System.out.print(v + " ");
        }
        System.out.println(); // Переход на новую строку после вывода массива
    }
}
