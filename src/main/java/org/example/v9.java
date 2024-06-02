package org.example;
import java.util.ArrayList;
import java.util.List;
public class v9 {
    public static double[] reduceArray(double[] array) {
        List<Double> resultList = new ArrayList<>();
        double lastAdded = array[0];
        resultList.add(lastAdded);

        for (int i = 1; i < array.length; i++) {
            if (array[i] > lastAdded) {
                resultList.add(array[i]);
                lastAdded = array[i];
            }
        }

        return resultList.stream().mapToDouble(Double::doubleValue).toArray();
    }
}