package lesson_3.solutions.task3;

import java.io.FileNotFoundException;

public class NonExistedFileException extends FileNotFoundException {
    public NonExistedFileException() {
        super("Указанный файл не найден");
    }

    public NonExistedFileException(String message) {
        super(message);
    }

    public NonExistedFileException(String message, String pathToFile) {
        this(String.format("Файла по пути %s не существует: %s", pathToFile, message));
    }
}