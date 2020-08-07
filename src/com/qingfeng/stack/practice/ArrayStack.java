package com.qingfeng.stack.practice;

@SuppressWarnings("all")
public class ArrayStack {
    /**
     * max size of the stack
     */
    private int maxSize;
    /**
     * a stack object
     */
    private int[] stack;
    /**
     * init the top of the stack
     * from 0 to  maxSize
     */
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * Whether the stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Whether the stack is full
     *
     * @return
     */
    public boolean isFull() {
        return top > this.maxSize - 1;
    }

    /**
     * push a element
     *
     * @param value
     */
    public void push(int value) {
        if (this.isFull()) {
            System.out.println("the stack is full ! can't push !");
            return;
        }
        stack[++top] = value;
    }

    /**
     * pop a element
     *
     * @return
     */
    public int pop() {
        if (isFull()) {
            throw new RuntimeException("the stack is empty!");
        }
        return stack[top--];
    }

    /**
     * print a stack
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("the stack is empty!");
        }
        for (int i = top; i >= 0; i--) {
            System.out.print("stack[" + i + "]=");
            System.out.println(stack[i]);
        }
    }

    /**
     * get  length of stack
     * @return
     */
    public int getLength(){
        return top+1;
    }

    public int peek(){
        return stack[top];
    }
}
