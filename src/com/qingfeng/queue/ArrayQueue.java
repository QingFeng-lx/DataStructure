package com.qingfeng.queue;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[]queue;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue=new int[this.maxSize];
        front=-1;
        rear=-1;
    }

    /**
     *
     * @return
     */
    public boolean isFull(){
        return rear==maxSize-1;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return rear==front;
    }

    /**
     *
     * @param value
     */
    public void add(int value){
        if (this.isFull()){
            System.err.println("the queue is full");
            return;
        }
        queue[++rear]=value;
    }

    /**
     *
     * @return
     */
    public int pop(){
        if (this.isEmpty()){
            throw  new RuntimeException("the queue is empty!");
        }
        return queue[++front];
    }

    /**
     *
     */
    public void list(){
        if (this.isEmpty()){
            System.err.println("the queue is empty!");
            return;
        }
        for (int i = 0; i <queue.length ; i++) {
            System.out.printf("queue[%d]=%d\n",i,queue[i]);
        }
    }

    /**
     *
     * @return
     */
    public Integer peek(){
        if (this.isEmpty()){
            System.err.println("the queue is empty!");
            return null;
        }
        return queue[front+1];
    }
}
