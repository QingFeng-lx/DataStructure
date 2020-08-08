package com.qingfeng.queue;

public class CircleArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[]queue;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue=new int[this.maxSize];
    }

    /**
     *
     * @return
     */
    public boolean isFull(){
        return (rear+1)%this.maxSize==front;
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
        queue[rear]=value;
        rear=(rear+1)%this.maxSize;
    }

    /**
     *
     * @return
     */
    public int pop(){
        if (this.isEmpty()){
            throw  new RuntimeException("the queue is empty!");
        }
        int val = queue[front];
        front=(front+1)%this.maxSize;
        return val;

    }

    /**
     *
     */
    public void list(){
        if (this.isEmpty()){
            System.err.println("the queue is empty!");
            return;
        }
        for (int i = front; i <this.size()+front ; i++) {
            System.out.printf("queue[%d]=%d\n",i%this.maxSize,queue[i%this.maxSize]);
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
        return queue[front];
    }

    public int size(){
        return (this.rear+this.maxSize-this.front)%this.maxSize;
    }
}
