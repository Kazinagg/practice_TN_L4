package org.example;

import java.util.ArrayList;
import java.util.List;

public class v15 {

    public static int[] extractEvenNumbers(int[] sourceArray) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int value : sourceArray) {
            if (value % 2 == 0) {
                evenNumbers.add(value);
            }
        }
        return evenNumbers.stream().mapToInt(i -> i).toArray();
    }

    public static int[] extractOddNumbers(int[] sourceArray) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int value : sourceArray) {
            if (value % 2 != 0) {
                oddNumbers.add(value);
            }
        }
        return oddNumbers.stream().mapToInt(i -> i).toArray();
    }
}
