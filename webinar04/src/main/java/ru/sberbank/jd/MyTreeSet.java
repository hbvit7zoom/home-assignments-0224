package ru.sberbank.jd;

import java.util.Comparator;

public class MyTreeSet<T> {

    private Node<T> root;

    private Comparator<T> comparator;

    private int size;


    static class Node<T> {
        private T value;

        private Node<T> parent;
        private Node<T> left;
        private Node<T> right;

        boolean hasNotChildren() {
            return left == null && right == null;
        }

    }

    public MyTreeSet(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public boolean add(T t) {

        Node<T> node = new Node();
        node.value = t;


        if (root == null) {
            root = node;
            size++;
            return true;
        }

        Node<T> current = root;
        while (true) {
            int compare = comparator.compare(t, current.value);

            if (compare == 0) {
                return false;
            }

            if (compare < 0) {
                if (current.left == null) {
                    current.left = node;
                    current.left.parent = current;
                    size++;
                    return true;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = node;
                    current.right.parent = current;
                    size++;
                    return true;
                } else {
                    current = current.right;
                }
            }
        }


    }

    public int size() {
        return size;
    }

    public boolean remove(T t) {

        if (root == null) {
            return false;
        }

        Node<T> current = root;

        int compare = comparator.compare(t, current.value);
        if (compare == 0) {
            boolean leftIsNull = current.left == null;
            boolean rightIsNull = current.right == null;
            if (leftIsNull && rightIsNull) {
                current = null;
                size--;
            } else if (rightIsNull) {
                root = current.left;
                size--;
            } else if (leftIsNull) {
                root = current.right;
                size--;
            } else {
                if (current.left.right == null) {
                    root = current.left;
                    root.right = current.right;
                    root.parent = null;
                    size--;
                } else {
                    Node<T> right = root.right;
                    Node<T> left = root.left;
                    root = current.left.right;
                    root.left = left;
                    root.right = right;
                    root.parent = null;
                    current.left.right = null;
                    size--;
                }
            }
        }
        return true;
    }

}
