package lesson_3.solutions.task3;

public class EmptyIndexAppealException extends ArrayIndexOutOfBoundsException {
    public EmptyIndexAppealException() {
        super("Выход за пределы массива");
    }

    public EmptyIndexAppealException(String s) {
        super(s);
    }

    public EmptyIndexAppealException(int index) {
        super(index);
    }
}