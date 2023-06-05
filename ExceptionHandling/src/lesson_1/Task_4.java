package lesson_1;

import java.util.*;
/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
 * и в каждой ячейке может лежать только значение 0 или 1.
 * Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Task_4 {
    public static void main(String[] args) {
        int[][] arr0 = new int[][] {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        start(arr0);
    }

    private static boolean isNotSquareArray(int[][] arg) {
        for (int[] ints: arg) {
            if (ints.length != arg.length) return true;
        }
        return false;

    }

    private static boolean isDataNotCorrect(int[][] arg) {
        List<Integer> container = List.of(0, 1);
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg.length; j++) {
                if (!container.contains(arg[i][j])) return true;
            }
        }
        return false;

    }

    public static void start(int[][] arr) {
        if (isNotSquareArray(arr)) {
            throw new RuntimeException("Массив не квадратный.");
        }
        if (isDataNotCorrect(arr)) {
            throw new RuntimeException("Массив должен содержать 0 или 1.");
        }
        int result = 0;
        for (int [] ints: arr) {
            result += Arrays.stream(ints).sum();
        }
        System.out.println(result);
    }
}
