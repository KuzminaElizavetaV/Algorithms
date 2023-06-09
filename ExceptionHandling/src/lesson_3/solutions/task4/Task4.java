package lesson_3.solutions.task4;

public class Task4 {
    public static double sum2d(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (isNotSquareArray(arr)) throw new MyArraySizeException();

        double count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!isDigit(arr[i][j])) throw new MyArrayDataException(i, j);
                count += Double.parseDouble(arr[i][j]);
            }
        }
        return count;
    }

    private static boolean isNotSquareArray(String[][] arr) {
        if (arr.length != 3) return true;
        for(String[] elem : arr) {
            if (elem.length != arr.length) return true;
        }
        return false;
    }

    private static boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDataNotCorrect(String[][] arr){
        for (String[] strings : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (!isDigit(strings[j])) return true;
            }
        }
        return false;
    }

}