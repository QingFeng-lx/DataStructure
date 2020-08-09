package com.qingfeng.test;


public class ArrayTest<T> {
    private T[] arr;
    private int capacity;
    private int index = 1;

    /**
     * @param capacity
     */
    public ArrayTest(int capacity) {
        this.capacity = capacity+1;
        this.arr = newArr(this.capacity);
    }

    /**
     * @param i
     * @return
     */
    @SuppressWarnings("unchecked")
    public T[] newArr(int i) {
        return (T[]) new Object[i];
    }

    public boolean add(T o) {
        this.arr[this.index++] = o;
        return true;
    }

    public void list() {
        for (int i = 1; i < this.capacity; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }

    public static void main(String[] args) {
        User liuxin = new User(2018, "liuxin");
        User yanghai = new User(2019, "yanghai");
        ArrayTest<User> arrayTest = new ArrayTest<User>(10);
        arrayTest.add(liuxin);
        arrayTest.add(yanghai);
        arrayTest.list();
    }
}
