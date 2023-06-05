package lesson_1;
/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
 * Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
 * в качестве кода ошибки, иначе - длину массива
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int []{2, 7};
        System.out.println(chekArrayLength(array, 2));
    }

    public static int chekArrayLength(int[] arr, int limit) {
        int length = arr.length;
        if (length < limit) {
            return -1;
        } else return length;
    }
}
