package lesson_3;


import lesson_3.solutions.task4.MyArrayDataException;
import lesson_3.solutions.task4.MyArraySizeException;
import lesson_3.solutions.task4.Task4;

public class Main {
    public static void main(String[] args) { // throws Exception
//        Counter solution2 = new Counter();
//        System.out.println(solution2);
//        solution2.add();
//        System.out.println(solution2);
//
//        Counter counter = new Counter();
//        counter.close();
//        counter.add();

        String[][] arr = new String[][] {
                {"1", "1.5", "1.5"},
                {"1", "1.5", "1.5"},
                {"1", "1.5", "1.5"}
        };

        try {
            System.out.println(Task4.sum2d(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}