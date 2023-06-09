package lesson_3.solutions.task4;

public class MyArrayDataException extends Exception {
    public MyArrayDataException() {
        super("В массиве должны быть только числа");
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(int x, int y) {
        this(String.format("В ячейке [%s][%s] не число", x, y));
    }
}