package HomeWork_2;

/**
 * Задание 2. Если необходимо, исправьте данный код:
 *        try {
 *             int d = 0;
 *             double catchedRes1 = intArray[8] / d;
 *             System.out.println("catchedRes1 = " + catchedRes1);
 *        } catch (ArithmeticException e) {
 *             System.out.println("Catching exception: " + e);
 *        }
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] intArr1 = new int[]{5, 8, 12, 6, 4, 56, 7, 8};
        int[] intArr2 = new int[]{5, 8, 4, 6, 4, 56, 7, 8, 10};
        divideArrNumber(intArr1, 8, 0); // Указан недопустимый индекс элемента массива: java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
        divideArrNumber(intArr2, 8, 0); // Делить на ноль нельзя: java.lang.ArithmeticException: / by zero
        divideArrNumber(intArr2, 8, 1); // Результат = 10.0
    }

    /**
     * Для чистоты эксперимента я сделала метод деления элемента масива по индексу на указанное целое число
     * @param arr искомый массив
     * @param index индекс элемента массива
     * @param number целое число, на которое делим элемент массива
     */
    public static void divideArrNumber(int[] arr, int index, int number) {
        try {
            double result = arr[index] / number;
            System.out.println("Результат = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { // обработка исключения ArrayIndexOutOfBoundsException, которое
            System.out.println("Указан недопустимый индекс элемента массива: " + e); // может возникнуть при попытке
        }                                                 // доступа элемента массива с недопустимым индексом
    }
}
