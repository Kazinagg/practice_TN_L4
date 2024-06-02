package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int NA = 50;
        int NB = 30; // Пример размера для массива B_double
        int NC = 20; // Пример размера для массива C_double

        int XA = 50;
        int XB = 30; // Пример размера для массива B_double
        int XC = 20; // Пример размера для массива C_double

        double[] A_double = new double[NA];
        double[] B_double = new double[NB];
        double[] C_double = new double[NC];

        int[] A_int = new int[NA];
        int[] B_int = new int[NB];
        int[] C_int = new int[NC];

        // Заполнение массивов случайными числами от 0 до 99
        fillArray_double(A_double);
        fillArray_double(B_double);
        fillArray_double(C_double);

        fillArray_int(A_int);
        fillArray_int(B_int);
        fillArray_int(C_int);

        System.out.println("массив A_double: " + java.util.Arrays.toString(A_double));
        System.out.println("массив B_double: " + java.util.Arrays.toString(B_double));
        System.out.println("массив C_double: " + java.util.Arrays.toString(C_double));

        System.out.println("массив A_int: " + java.util.Arrays.toString(A_int));
        System.out.println("массив B_int: " + java.util.Arrays.toString(B_int));
        System.out.println("массив C_int: " + java.util.Arrays.toString(C_int));


        System.out.println("v1 Минимальный элемент массива A_double: " + v1.findMin(A_int));
        System.out.println("v1 Минимальный элемент массива B_double: " + v1.findMin(A_int));
        System.out.println("v1 Минимальный элемент массива C_double: " + v1.findMin(A_int));


        System.out.println("v2 индекс максимального элемента массива A_double: " + v2.findMaxIndex(A_double));
        System.out.println("v2 индекс максимального элемента массива B_double: " + v2.findMaxIndex(B_double));
        System.out.println("v2 индекс максимального элемента массива C_double: " + v2.findMaxIndex(C_double));


        int[] minMaxA = v3.findMinAndMaxIndexes(A_double);
        int[] minMaxB = v3.findMinAndMaxIndexes(B_double);
        int[] minMaxC = v3.findMinAndMaxIndexes(C_double);
        System.out.println("v3 Минимальный элемент массива A_double находится на позиции: " + minMaxA[0]);
        System.out.println("v3 Максимальный элемент массива A_double находится на позиции: " + minMaxA[1]);
        System.out.println("v3 Минимальный элемент массива B_double находится на позиции: " + minMaxB[0]);
        System.out.println("v3 Максимальный элемент массива B_double находится на позиции: " + minMaxB[1]);
        System.out.println("v3 Минимальный элемент массива C_double находится на позиции: " + minMaxC[0]);
        System.out.println("v3 Максимальный элемент массива C_double находится на позиции: " + minMaxC[1]);


        System.out.println("v4 Инвертированный массив A_double: " + java.util.Arrays.toString(v4.invertArray(A_double)));
        System.out.println("v4 Инвертированный массив B_double: " + java.util.Arrays.toString(v4.invertArray(B_double)));
        System.out.println("v4 Инвертированный массив C_double: " + java.util.Arrays.toString(v4.invertArray(C_double)));


        System.out.println("v5 Сглаженный массив A_double: " + java.util.Arrays.toString(v5.smoothArray(A_double)));
        System.out.println("v5 Сглаженный массив B_double: " + java.util.Arrays.toString(v5.smoothArray(B_double)));
        System.out.println("v5 Сглаженный массив C_double: " + java.util.Arrays.toString(v5.smoothArray(C_double)));

        v6.smoothArray(A_double);
        v6.smoothArray(B_double);
        v6.smoothArray(C_double);

        v7.smoothArray(A_double);
        v7.smoothArray(B_double);
        v7.smoothArray(C_double);

        int[] A_int_ = v8.removeElement(A_int, XA);
        int[] B_int_ = v8.removeElement(B_int, XB);
        int[] C_int_ = v8.removeElement(C_int, XC);
        System.out.println("v8 Размер и содержимое массива A_double после удаления: " + A_int_.length + " " + Arrays.toString(A_int_));
        System.out.println("v8 Размер и содержимое массива B_double после удаления: " + B_int_.length + " " + Arrays.toString(B_int_));
        System.out.println("v8 Размер и содержимое массива C_double после удаления: " + C_int_.length + " " + Arrays.toString(C_int_));

        double[] A_double_ = v9.reduceArray(A_double);
        double[] B_double_ = v9.reduceArray(B_double);
        double[] C_double_ = v9.reduceArray(C_double);
        System.out.println("v9 Размер и содержимое упорядоченного массива A_double: " + A_double_.length + " " + java.util.Arrays.toString(A_double_));
        System.out.println("v9 Размер и содержимое упорядоченного массива B_double: " + B_double_.length + " " + java.util.Arrays.toString(B_double_));
        System.out.println("v9 Размер и содержимое упорядоченного массива C_double: " + C_double_.length + " " + java.util.Arrays.toString(C_double_));

        A_int_ = v10.duplicateElement(A_int, XA);
        B_int_ = v10.duplicateElement(B_int, XB);
        C_int_ = v10.duplicateElement(C_int, XC);
        System.out.println("v10 Размер и содержимое массива A_double после дублирования: " + A_int_.length + " " + java.util.Arrays.toString(A_int_));
        System.out.println("v10 Размер и содержимое массива B_double после дублирования: " + B_int_.length + " " + java.util.Arrays.toString(B_int_));
        System.out.println("v10 Размер и содержимое массива C_double после дублирования: " + C_int_.length + " " + java.util.Arrays.toString(C_int_));

        System.out.println("v11 Отсортированный массив A_double: " + Arrays.toString(v11.sortArray(A_double)));
        System.out.println("v11 Отсортированный массив B_double: " + Arrays.toString(v11.sortArray(B_double)));
        System.out.println("v11 Отсортированный массив C_double: " + Arrays.toString(v11.sortArray(C_double)));

        System.out.println("v12 Индексный массив для A_double: " + Arrays.toString(v12.createIndexArray(A_double)));
        System.out.println("v12 Индексный массив для B_double: " + Arrays.toString(v12.createIndexArray(B_double)));
        System.out.println("v12 Индексный массив для C_double: " + Arrays.toString(v12.createIndexArray(C_double)));

        System.out.println("v13 Колоколообразный массив A_double: " + Arrays.toString(v13.sortBellShaped(A_double)));
        System.out.println("v13 Колоколообразный массив B_double: " + Arrays.toString(v13.sortBellShaped(B_double)));
        System.out.println("v13 Колоколообразный массив C_double: " + Arrays.toString(v13.sortBellShaped(C_double)));

        B_double_ = v14.extractOddIndexedElements(A_double);
        C_double_ = v14.extractEvenIndexedElements(A_double);
        System.out.println("v14 Массив B_double (нечетные индексы): Размер: " + B_double_.length + ", Содержимое: " + java.util.Arrays.toString(B_double_));
        System.out.println("v14 Массив C_double (четные индексы): Размер: " + C_double_.length + ", Содержимое: " + java.util.Arrays.toString(C_double_));

        B_int_ = v15.extractEvenNumbers(A_int);
        C_int_ = v15.extractOddNumbers(A_int);
        System.out.println("v15 Массив B_double (четные числа): Размер: " + B_double.length + ", Содержимое: " + java.util.Arrays.toString(B_double));
        System.out.println("v15 Массив C_double (нечетные числа): Размер: " + C_double.length + ", Содержимое: " + java.util.Arrays.toString(C_double));


//        v5.smoothArray(A_double);
    }


    public static void fillArray_int(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
    }
    public static void fillArray_double(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);
        }
    }

}
