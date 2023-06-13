package HomeWork_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в 1 строку, согласно шаблону:\nФамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол");
            String input = scanner.nextLine();
            String[] dataArray = input.split(" ");

            if (dataArray.length != 6) {
                throw new IllegalArgumentException("Вы ввели меньше или больше данных, чем требуется. Количество данных должно состоять из 6 строк!");
            }

            String surname = checkValidName(dataArray[0]);
            String name = checkValidName(dataArray[1]);
            String patronymic = checkValidName(dataArray[2]);
            String dateBirth = dataArray[3];
            String phoneNumber = dataArray[4];
            String gender = dataArray[5];

            if (!isValidDate(dateBirth)) {
                throw new IllegalArgumentException("Дата рождения введена некорректно!");
            }

            long phone = parsePhoneNumber(phoneNumber);

            if (!isValidGender(gender)) {
                throw new IllegalArgumentException("Некорректный пол");
            }

            String fileName = surname + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\ekuzmina\\IdeaProjects\\algorithms\\ExceptionHandling\\src\\HomeWork_3\\" + fileName, true));
            writer.append("<").append(surname).append(">").append("<").append(name).append(">").append("<").append(patronymic)
                    .append(">").append("<").append(dateBirth).append("> ").append("<").append(String.valueOf(phone))
                    .append(">").append("<").append(gender).append(">").append(System.lineSeparator());
            writer.close();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String checkValidName(String name){
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

    private static long parsePhoneNumber(String phoneNumber) { // Парсинг номера телефона
        if (phoneNumber == null || !phoneNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Неверный формат номера телефона");
        }
        try {
            return Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона", e);
        }
    }

    private static boolean isValidGender(String gender) { // Проверка корректности значения пола
        if (gender != null && gender.length() == 1 && (gender.equalsIgnoreCase("m") ||
                gender.equalsIgnoreCase("f"))) return true;
        assert gender != null;
        return gender.equalsIgnoreCase("м") ||
        gender.equalsIgnoreCase("ж");
    }
}
