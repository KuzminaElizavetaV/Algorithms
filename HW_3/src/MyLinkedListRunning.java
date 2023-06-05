public class MyLinkedListRunning {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.reversed());

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(2));
        System.out.println(myLinkedList.contains(6));


        System.out.println(myLinkedList.get(0)); // 1
        System.out.println(myLinkedList.get(1)); // 2
        System.out.println(myLinkedList.get(2)); // 3
        System.out.println(myLinkedList.get(3)); // 4
//        System.out.println(myLinkedList.get(4)); // IndexOutOfBounds
        System.out.println();

//        System.out.println(myLinkedList.pop(-1)); // IndexOutOfBounds

        System.out.println(myLinkedList.pop(2)); // 3
        System.out.println(myLinkedList.pop(2)); // 4
//        System.out.println(myLinkedList.pop(2)); // IndexOutOfBounds
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.popFirst()); // 1
        System.out.println(myLinkedList); // [2]

    }
}
