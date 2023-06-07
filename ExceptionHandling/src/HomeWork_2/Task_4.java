package HomeWork_2;

import java.util.Objects;
import java.util.Scanner;

/**
 * Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        do {
            System.out.println("Введите строку");
            try {
                input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Пустые строки вводить нельзя!");
                    throw new IllegalArgumentException("Пустая строка!");
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Введите строку! Получено исключение: " + e);
            }
        } while (Objects.requireNonNull(input).isEmpty() && scanner.hasNextLine());
        System.out.println("Вы ввели: " + input);
    }
}
