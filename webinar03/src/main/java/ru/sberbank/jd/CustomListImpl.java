package ru.sberbank.jd;


public class CustomListImpl<T> implements CustomList<T> {

    private Node<T> root;

    private Node<T> last;

    private int size;

    class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;
    }

    @Override
    public boolean add(T item) {
        if (root == null) {
            Node<T> node = new Node<>();
            node.value = item;
            node.previous = null;
            node.next = null;

            root = node;
            last = node;
        } else {
            Node<T> node = new Node<>();
            node.value = item;
            node.previous = last;
            node.next = null;

            last.next = node;

            last = node;
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (root == null) {
            return "";
        }
        Node<T> current = root;

        StringBuilder sb = new StringBuilder();
        do {
            sb.append(current.value).append(" ");
        } while ((current = current.next) != null);
        return sb.toString();
    }
}
