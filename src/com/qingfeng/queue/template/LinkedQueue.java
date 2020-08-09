package com.qingfeng.queue.template;

@SuppressWarnings("all")
public class LinkedQueue<T> {
    private Node head;
    private Node tail;

    public LinkedQueue() {
        this.head = new Node(null);
        this.tail = this.head;
    }

    /**
     * @param o
     * @return
     */
    public boolean add(T o) {
        if (o == null) {
            throw new NullPointerException("the pointer is null!");
        }
        Node newNode = new Node(o);
        this.tail.next = newNode;
        this.tail = newNode;
        return true;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return this.head == this.tail;
    }

    public int size() {
        Node temp = head.next;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    /**
     * 
     * @return
     */
    public T deQueue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue empty!");
        }
        Node del = this.head.next;
        Node temp = this.head.next;
        temp = head;
        head = temp.next;
        return del.element;
    }

    /**
     * @param i
     * @return
     */
    public T remove(int i) {
        Node temp = head;
        int j = 1;
        while (temp.next != null && j < i) {
            temp = temp.next;
            j++;
        }
        Node remove = temp.next;
        temp.next = temp.next.next;
        return remove.element;
    }

    /**
     * @param i
     * @return
     */
    public T get(int i) {
        Node temp = head;
        int j = 1;
        while (temp.next != null && j <= i) {
            temp = temp.next;
            j++;
        }
        return temp.element;
    }

    /**
     *
     */
    public void list() {
        for (int i = 1; i <= this.size(); i++) {
            System.out.println(this.get(i));
        }
    }

    /**
     * @return
     */
    public T peek() {
        return (T) this.head.next.element;
    }

    private class Node {
        private T element;
        private Node next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}

