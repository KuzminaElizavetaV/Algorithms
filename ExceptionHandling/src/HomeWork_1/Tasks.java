package HomeWork_1;

public class Tasks {
    public static void main(String[] args) {
        int[] a = null;
        int[] b = {4, 5, 6};
        int[] c = {7, 12};
        int[] d = {7, 8, 0};

    }


    /**
     * Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения.
     * 1. Сравнение длин массивов
     */
    public static int[] arrayDiffSize(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays are not of equal length!!!");
        }
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /**
     * 2. Проверка массива на null
     */
    public static int[] checkArrayNullPointer(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new NullPointerException("Array is null");
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /**
     * 3. Проверка индексов первого массива с длиной второго массива
      */
    public static int[] compareArraysIndexOut(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (i >= arr2.length) {
                throw new IndexOutOfBoundsException("Index is out of bounds " + i);
            }
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /**
     * Задание 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
     * Надо обработать код исключениями!
     */

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    /**
     * Задание 3: Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый
     * массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины
     * массивов не равны, необходимо как-то оповестить пользователя.
     */

    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы не одинаковой длины!!!");
        }
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /**
     * Задание 4: Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый
     * массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины
     * массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
     * которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new NullPointerException("Array is null");
        }

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Array lengths are not equal!");
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Division by zero!");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
