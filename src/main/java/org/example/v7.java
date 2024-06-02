package org.example;

public class v7 {

    public static void smoothArray(double[] array_) {
        double[] array = array_.clone();
        double[] tempArray = new double[array.length];
        System.arraycopy(array, 0, tempArray, 0, array.length);

        for (int times = 0; times < 5; times++) {
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = calculateSmoothedValue(array, i);
            }
            System.arraycopy(tempArray, 0, array, 0, array.length);
            System.out.println("Сглаживание " + (times + 1) + ": " + java.util.Arrays.toString(array));
        }
    }

    private static double calculateSmoothedValue(double[] array, int index) {
        double sum = array[index];
        int count = 1;

        if (index > 0) {
            sum += array[index - 1];
            count++;
        }
        if (index < array.length - 1) {
            sum += array[index + 1];
            count++;
        }

        return sum / count;
    }
}
