public class ModernUnidirectionalLinkedList<T> {
    private Node<T> head;


    public T contains(T i) {
        return i;
    }

    public int size() {
        return sizeRecursively(head);
    }

    private int sizeRecursively(Node<T> current) {
        if (current == null) {
            return 0;
        }
        return 1 + sizeRecursively(current.next);
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        head = addRecursively(head, data);
    }

    private Node<T> addRecursively(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);
        }
        current.next = addRecursively(current.next, data);
        return current;
    }

    public void remove(T data) {
        head = removeRecursively(head, data);
    }

    private Node<T> removeRecursively(Node<T> current, T data) {
        if (current == null) {
            return null;
        }
        if (current.data.equals(data)) {
            return current.next;
        }
        current.next = removeRecursively(current.next, data);
        return current;
    }

    public void printList() {
        printRecursively(head);
        System.out.println();
    }

    private void printRecursively(Node<T> current) {
        if (current == null) {
            return;
        }
        System.out.print(current.data + " ");
        printRecursively(current.next);
    }
}