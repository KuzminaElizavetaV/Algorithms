package HomeWork_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        writeData(createValidHuman(inputData()));
    }

    private static String[] inputData() { // метод получения данных от пользователя
        String[] dataArray = new String[0];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в 1 строку, согласно шаблону:\n" +
                    "Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол");
            String input = scanner.nextLine();
            dataArray = input.split(" ");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return dataArray;
    }

    private static Human createValidHuman(String[] data) {
        try {
            if (data.length == 6) { // проверка количества введенных данных
                Human human = new Human(checkValidName(data[0]), checkValidName(data[1]), checkValidName(data[2]),
                        data[3], data[4], data[5]);
                if (!isValidDate(human.dateBirth)) {
                    throw new IllegalArgumentException("Дата рождения не соответствует формату дд.мм.гггг!");
                }
                if (!isDigits(human.phoneNumber)) {
                    throw new IllegalArgumentException("Неверный формат номера телефона! Введите целое беззнаковое число" +
                            " без форматирования, например 89021451235.");
                }
                if (!isValidGender(human.gender)) {
                    throw new IllegalArgumentException("Некорректный пол! Допустимы только символы: f, m, м, ж.");
                }
                return human;
            } else throw new IllegalArgumentException("Вы ввели меньше или больше данных, чем требуется. Количество данных" +
                    " должно состоять из 6 строк!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static String checkValidName(String name){ // проверка ФИО
        if (name == null || !name.matches("[А-Яа-яЁёA-Za-z]+")) {
            throw new IllegalArgumentException("Некорректные символы в ФИО: " + name);
        }
        return name;
    }

    private static boolean isValidDate(String date) { // Проверка формата даты
        if (date == null || !date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    private static boolean isDigits(String string) { // проверка строки только на числа
        for(int i = 0; i < string.length(); i++) {
            if(!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidGender(String gender) { // Проверка корректности значения пола
        if (gender != null && gender.length() == 1 && (gender.equalsIgnoreCase("m") ||
                gender.equalsIgnoreCase("f"))) return true;
        assert gender != null;
        return gender.equalsIgnoreCase("м") ||
                gender.equalsIgnoreCase("ж");
    }

    private static void writeData(Human human) { // метод записи в файл валидных данных объекта человек
        try {
            if (!(human == null)) {
                String fileName = human.surname + ".txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(
                        "C:\\Users\\ekuzmina\\IdeaProjects\\algorithms\\ExceptionHandling\\src\\HomeWork_3\\" +
                                fileName, true))) {
                    writer.append(human.toString()).append(System.lineSeparator());
                    System.out.println("Данные успешно записаны в файл " + fileName);
                } catch (IOException ex) {
                    throw new RuntimeException(ex.getMessage());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Невозможно записать данные в файл ввиду их некорректного ввода");
        }
    }
}