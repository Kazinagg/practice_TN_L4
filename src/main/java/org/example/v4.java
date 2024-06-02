package org.example;

public class v4 {
    public static double[] invertArray(double[] array_) {
        double[] array = array_.clone();
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
