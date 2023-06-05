public class MyLinkedListRunning {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        System.out.println("Пустой список: " + myLinkedList);
        System.out.println("Размер пустого списка: " + myLinkedList.size());

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println("Первоначальный список: " + myLinkedList);
        System.out.println("Первый элемент списка: " +myLinkedList.getFirst());
        System.out.println("Обратный список: " + myLinkedList.reversed());

        System.out.println("Размер списка: " + myLinkedList.size());
        System.out.println("Содержит ли список число 2: " + myLinkedList.contains(2));
        System.out.println("Содержит ли список число 6: " + myLinkedList.contains(6));


        System.out.println("Элемент списка под индексом 0: " + myLinkedList.get(0)); // 1
        System.out.println("Элемент списка под индексом 1: " + myLinkedList.get(1)); // 2
        System.out.println("Элемент списка под индексом 2: " + myLinkedList.get(2)); // 3
        System.out.println("Элемент списка под индексом 3: " + myLinkedList.get(3)); // 4
//        System.out.println(myLinkedList.get(4)); // IndexOutOfBounds
        System.out.println();

//        System.out.println(myLinkedList.pop(-1)); // IndexOutOfBounds

        System.out.println("Удалить элемент списка под индексом 2: " + myLinkedList.pop(2)); // 3
        System.out.println("Удалить элемент списка под индексом 2: " + myLinkedList.pop(2)); // 4
//        System.out.println(myLinkedList.pop(2)); // IndexOutOfBounds
        System.out.println(myLinkedList);
        System.out.println("Удалить первый элемент списка: " + myLinkedList.popFirst()); // 1
        System.out.println(myLinkedList); // [2]
    }
}
