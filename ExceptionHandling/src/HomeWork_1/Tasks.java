package HomeWork_1;

public class Tasks {
    public static void main(String[] args) {
        int[] a = null;
        int[] b = {4, 5, 6};
        int[] c = {7, 12};
        int[] d = {7, 8, 0};
        int[] e = {7, 8, 0, 4, 6};

        System.out.println("ЗАДАНИЕ 1");
        System.out.println("Проверка метода 1:");
        System.out.println(compareArraysLength(b, c));
        System.out.println("************************");
        System.out.println(compareArraysLength(b, d));
        System.out.println();
        System.out.println("Проверка метода 2:");
        System.out.println(checkArraysNull(a, d));
        System.out.println("************************");
        System.out.println(checkArraysNull(b, c));
        System.out.println();
        System.out.println("Проверка метода 3:");
        System.out.println(compareArrIndexArrLength(b, d));
        System.out.println("************************");
        System.out.println(compareArrIndexArrLength(e, b));
        System.out.println("ЗАДАНИЕ 2");

        String[][] arr0 = new String[][]{
                {"1", "2", "3", "4", "5"},
                {"5", "4", "3", "2", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        System.out.println(sum2d(arr0));
        System.out.println("************************");
        String[][] arr = new String[][]{
                {"1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
        System.out.println(sum2d(arr));
        System.out.println("************************");
        String[][] arr1 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "а", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"c", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        System.out.println(sum2d(arr1));
        System.out.println("************************");



    }


    /**
     * Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения.
     * 1. Сравнение длин массивов
     */
    public static boolean compareArraysLength(int[] arr1, int[] arr2) {
        try {
            if (arr1.length != arr2.length) {
                throw new IllegalArgumentException("Arrays are not of equal length!!!");
            } else return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Arrays are not of equal length!!!");
            return false;
        }
    }

    /**
     * 2. Проверка массива на null
     */
    public static boolean checkArraysNull(int[] arr1, int[] arr2) {
        try {
            if (arr1 == null || arr2 == null) {
                throw new NullPointerException("One of the arrays is null or Arrays are null");
            } else return true;
        } catch (NullPointerException e) {
            System.out.println("One of the arrays is null or Arrays are null");
            return false;
        }
    }

    /**
     * 3. Проверка последнего индекса первого массива с длиной второго массива (Такой своеобраздый метод сравнения масивов)
     */
    public static boolean compareArrIndexArrLength(int[] arr1, int[] arr2) {
        try {
            if (arr1.length - 1 >= arr2.length) {
                throw new IndexOutOfBoundsException("Index is out of bounds ");
            }
            else return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
            return false;
        }
    }

    /**
     * Задание 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
     * public static int sum2d(String[][] arr) {
     *         int sum = 0;
     *         for (int i = 0; i < arr.length; i++) {
     *             for (int j = 0; j < 5; j++) {
     *                 int val = Integer.parseInt(arr[i][j]);
     *                 sum += val;
     *             }
     *         }
     *         return sum;
     *     }
     */

    private static int sum2d(String[][] arr) {
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Массив не квадратный или в нем присутствуют не только числа");
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
