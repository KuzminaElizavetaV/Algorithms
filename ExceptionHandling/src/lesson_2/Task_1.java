package lesson_2;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Изучите данный код. Все ли с ним хорошо? Если нет,
 * скорректируйте код, попробуйте обосновать свое решение.
 */

public class Task_1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        int index = scanner.nextInt();
        try {
            arr[index] = 1;
            //System.out.println(Arrays.toString(arr));

        } catch (InputMismatchException e) {
            System.err.println("Вы ввели не число!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.err.println("Указан индекс за пределами массива");
        }
    }
}
