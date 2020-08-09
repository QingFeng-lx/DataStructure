package com.qingfeng.queue.template;

/**
 * @param <T>
 */
public class ArrayQueue<T> {
    private int capacity;
    private int head;
    private int tail;
    private T[] queue;

    /**
     * @param capacity
     */
    public ArrayQueue(int capacity) {
        this.capacity = capacity + 1;
        this.queue = newArray(capacity + 1);
        this.head = 0;
        this.tail = 0;
    }

    /**
     * @param size
     * @return
     */
    @SuppressWarnings("unchecked")
    private T[] newArray(int size) {
        return (T[]) new Object[size];
    }

    /**
     * @return
     */
    public boolean isFull() {
        return (tail + 1) % this.capacity == head;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return tail == head;
    }

    /**
     * @param o
     */
    public boolean add(T o) {
        queue[tail] = o;
        if (this.isFull()) {
            throw new IndexOutOfBoundsException("Queue full");
        }
        this.tail = (this.tail + 1) % capacity;
        return true;
    }

    /**
     * @return
     */
    public T remove(int i) {
        if (i != 0)
            throw new IllegalArgumentException("Can only remove head of queue");
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Queue empty");
        T removed = queue[head];
        queue[head] = null;
        head = (head + 1) % capacity;
        return removed;
    }

    /**
     *
     */
    public void list() {
        if (isEmpty()) {
            System.err.println("the queue is empty!");
            return;
        }
        for (int i = head; i < this.size() + head; i++) {
            System.out.println(queue[i % this.capacity]);
        }
    }

    /**
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue empty");
        }
        return queue[head];
    }

    public int size() {
        return (this.tail + this.capacity - this.head) % this.capacity;
    }

    public T get(int i) {
        int size = size();
        if (i < 0 || i >= size) {
            final String msg = "Index " + i + ", queue size " + size;
            throw new IndexOutOfBoundsException(msg);
        }
        int index = (head + i) % capacity;
        return queue[index];
    }
}
