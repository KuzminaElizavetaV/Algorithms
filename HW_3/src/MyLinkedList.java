public class MyLinkedList <T extends Comparable<? super T>> {
    private class Node {
        T value;
        Node next;
        Node(T value) {
            this.value = value;
        }
    }
    private Node head;

    /**
     * Метод добавления элемента в список
     * @param value значение, которое необходимо добавить
     */
    public void add(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
        }
    }
    public T getFirst() {
        return get(0);
    }
    public T get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index && current != null) {
            return current.value;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public T popFirst() {
        return pop(0);
    }
    public T pop(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }
        if (index == 0) {
            T pop = head.value;
            head = head.next;
            return pop;
        }
        Node previous = head; // предыдущая от искомой
        int currentIndex = 1;
        while (previous.next != null) {
            if (currentIndex == index) {
                T pop = previous.next.value;
                previous.next = previous.next.next;
                return pop;
            }

            previous = previous.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException(index);
    }

    /**
     * метод создания нового реверсирвного списка
     * @return новый список элементов в обратной последовательности
     */
    public MyLinkedList<T> reversed() {
        MyLinkedList<T> reversed = new MyLinkedList<>();
        addReversedRecursive(head, reversed);
        return reversed;
    }
    private void addReversedRecursive(Node current, MyLinkedList<T> result) {
        if (current.next != null) {
            addReversedRecursive(current.next, result);
        }
        result.add(current.value);
    }
    /**
     * метод поиска последнего элемента списка
     * @return последний элемент списка
     */

    private Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    /**
     * метод вывода списка в виде форматированной строки
     * @return список ввиде строки
     */

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }

        int length = result.length();
        if (length > 4) {
            result.delete(length - 4, length);
        }

        result.append("]");
        return result.toString();
    }

    /**
     * метод получения размера списка
     * @return размер списка
     */
    public int size() {
        int currentSize = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            currentSize++;
        }
        return currentSize;
    }

    /**
     * метод проверки наличия элемента в списке
     * @param value значение, которое надо найти в списке
     * @return boolean
     */
    public boolean contains(T value) {
        Node current = head;
        while (current.next != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
    return false;
    }
}

