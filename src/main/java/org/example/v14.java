package org.example;
import java.util.stream.IntStream;
public class v14 {
    public static double[] extractOddIndexedElements(double[] sourceArray) {
        return IntStream.range(0, sourceArray.length)
                .filter(i -> i % 2 == 0)
                .mapToDouble(i -> sourceArray[i])
                .toArray();
    }

    public static double[] extractEvenIndexedElements(double[] sourceArray) {
        return IntStream.range(0, sourceArray.length)
                .filter(i -> i % 2 != 0)
                .mapToDouble(i -> sourceArray[i])
                .toArray();
    }
}
