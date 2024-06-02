package org.example;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
public class v12 {
    public static Integer[] createIndexArray(double[] array) {
        Integer[] indexArray = IntStream.range(0, array.length).boxed().toArray(Integer[]::new);
        Arrays.sort(indexArray, Comparator.comparingDouble(i -> array[i]));
        return indexArray;
    }
}
