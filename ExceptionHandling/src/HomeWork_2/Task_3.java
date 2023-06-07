package HomeWork_2;
/**
 * Задание 3. Дан следующий код, исправьте его там, где требуется:
 *         public static void main(String[] args) throws Exception {
 *             try {
 *                 int a = 90;
 *                 int b = 3;
 *                 System.out.println(a / b);
 *                 printSum(23, 234);
 *                 int[] abc = { 1, 2 };
 *                 abc[3] = 9;
 *             } catch (Throwable ex) {
 *                 System.out.println("Что-то пошло не так...");
 *             } catch (NullPointerException ex) {
 *                 System.out.println("Указатель не может указывать на null!");
 *             } catch (IndexOutOfBoundsException ex) {
 *                 System.out.println("Массив выходит за пределы своего размера!");
 *             }
 *         }
 *         public static void printSum(Integer a, Integer b) throws FileNotFoundException {
 *             System.out.println(a + b);
 *         }
 */
public class Task_3 {
    public static void main(String[] args) { //Убрать объявление "throws Exception" , т.к. в нём уже есть обработчик исключений.
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) { //Заменить Throwable на Exception в блоке catch и переместить в самый конец, т.к.
            System.out.println("Что-то пошло не так... " + ex); // Throwable может перехватывать исключения, которые не
        }                                                       // являются наследниками класса Exception.
    }
    //В методе printSum убрать объявление throws FileNotFoundException, т.к. при выполнении метода никак не приведет
    // к FileNotFoundException
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
