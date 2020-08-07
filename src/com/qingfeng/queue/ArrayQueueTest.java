package com.qingfeng.queue;
//  System.out.println("------ ------");
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        /*-------------------------------------------------------------------*/
        System.out.println("------testAdd------");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.list();
        /*-------------------------------------------------------------------*/
        System.out.println("------testFull------");
       /* queue.add(40);
        queue.add(50);
        queue.list();*/
        /*-------------------------------------------------------------------*/
        System.out.println("------testPeek------");
        System.out.println("the peek of queue is: "+queue.peek());
        /*-------------------------------------------------------------------*/
        System.out.println("------testPop------");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.list();

    }
}
