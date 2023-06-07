package HomeWork_2;

import java.util.Scanner;

/**
 * Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
 * введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
 * повторно запросить у пользователя ввод данных.
 */
public class Task_1 {
    public static void main(String[] args) {
        float inputNum = getFloatByUser();
        System.out.println("Получено дробное число: " + inputNum);
    }
    public static float getFloatByUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число, отделяя точкой дробную часть: ");
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не дробное число! Пожалуйста, попробуйте снова.");
            }
        }
    }
}
