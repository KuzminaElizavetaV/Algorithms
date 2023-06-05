public class MyLinkedList <T extends Comparable<? super T>> {

    /**
     * Реализовать следующие методы
     * 1. public int size() - получить размер списка
     * 2. public boolean contains(int value) - проверить наличие элемента в списке
     * 3.* public MyLinkedList reversed() - создать НОВЫЙ список с обратным порядком
     * 4.** Заменить все int значения на дженерик T
     * 5.* Любые другие доработки, которые захотите для тренировки
     */


    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;

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

    public MyLinkedList<T> reversed() {
        // TODO: 25.05.2023 Реализовать пункт 4
        throw new UnsupportedOperationException();
    }

    /**
     * метод поиска последнего элемента списка
     * @return Node last
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
     * @return String
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
     * @return int size
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

