package org.example;
import java.util.Arrays;
public class v8 {
    public static int[] removeElement(int[] array, int X) {
        return Arrays.stream(array)
                .filter(value -> value != X)
                .toArray();
    }
}
