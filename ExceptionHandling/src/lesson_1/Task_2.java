package lesson_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
 * 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * 3. если вместо массива пришел null, метод вернет -3
 * 4. Напишите метод, в котором реализуйте взаимодействие с пользователем.
 * То есть, этот метод запросит искомое число у пользователя, вызовет первый,
 * обработает возвращенное значение и покажет читаемый результат пользователю.
 * Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int []{2, 7, 4};
        //System.out.println(checkArrayLength(array, 4, 7));
        start(array, 3);
    }

    public static int checkArrayLength(int[] arr, int limit, int number) {
        int length = arr.length;
        if (length < limit) {
            return -1;
        } else {
            List <Integer> inner = Arrays.stream(arr).boxed().toList();
            if (!inner.contains(number)) return -2;
            else return inner.indexOf(number);
            // for (int i = 0; i < arr.length; i++) {
            //     if (arr[i] == number) return i;
            // }
            // return -2;
        }
    }

    public static void start(int[] array, int limit) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите искомое число: ");
        int number = input.nextInt();
        System.out.println(checkArrayLength(array, limit, number));

    }
}
