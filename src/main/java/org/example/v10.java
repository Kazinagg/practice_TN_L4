package org.example;
import java.util.ArrayList;
import java.util.List;

public class v10 {
    public static int[] duplicateElement(int[] array, int X) {
        List<Integer> resultList = new ArrayList<>();

        for (int value : array) {
            resultList.add(value);
            if (value == X) {
                resultList.add(value); // Дублирование элемента, равного X
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
