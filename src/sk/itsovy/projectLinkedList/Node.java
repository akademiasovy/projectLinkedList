package sk.itsovy.projectLinkedList;

public class Node<T> {
    private T data;
    private Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node(T name) {
        this.data = name;
        next=null;
    }
}
