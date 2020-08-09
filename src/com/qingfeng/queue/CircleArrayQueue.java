package com.qingfeng.queue;

public class CircleArrayQueue {
    private int capacity;
    private int head;
    private int tail;
    private int[]queue;


    public CircleArrayQueue(int maxSize) {
        this.capacity = maxSize;
        queue=new int[this.capacity];
    }

    /**
     *
     * @return
     */
    public boolean isFull(){
        return (tail+1)%this.capacity==head;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return tail==head;
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
        queue[tail]=value;
        tail=(tail+1)%this.capacity;
    }

    /**
     *
     * @return
     */
    public int pop(){
        if (this.isEmpty()){
            throw  new RuntimeException("the queue is empty!");
        }
        int val = queue[head];
        head=(head+1)%this.capacity;
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
        for (int i = head; i <this.size()+head ; i++) {
            System.out.printf("queue[%d]=%d\n",i%this.capacity,queue[i%this.capacity]);
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
        return queue[head];
    }

    public int size(){
        return (this.tail+this.capacity-this.head)%this.capacity;
    }
}
