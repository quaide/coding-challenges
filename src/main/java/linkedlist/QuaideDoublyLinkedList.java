package linkedlist;

public class QuaideDoublyLinkedList<T> {

    private int size;
    private QuaideNode<T> head;
    private QuaideNode<T> tail;

    public QuaideDoublyLinkedList() {
        this.size = 0;
    }

    public void append(T value) {
        if(head == null) {
            head = new QuaideNode<>(null, null, value);
        }
        else if(tail == null) {
            tail = new QuaideNode<>(null, head, value);
            head.setNextInLine(tail);
        }
        else {
            //Create new node with our value
            //Point tail to new node
            //Update tail
            QuaideNode<T> newTail = new QuaideNode<>(null, tail, value);
            tail.setNextInLine(newTail);
            tail = newTail;

        }
        size++;
    }

    public void pollLast() {
        tail = tail.getInFrontOfMe();
    }

    public T peek() {
        return head.getValue();
    }

    public int size() {
        return size;
    }

    public T peekLast() {
        if(tail == null) {
            return head.getValue();
        }
        return tail.getValue();
    }
}
