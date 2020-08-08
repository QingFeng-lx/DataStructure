package com.qingfeng.queue;

public class CircleArrayQueueTest {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(5);
        /*-------------------------------------------------------------------*/
        System.out.println("------testAdd------");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.list();
        /*-------------------------------------------------------------------*/
        System.out.println("------testFull------");
        /*queue.add(40);
        queue.list();*/
        /*-------------------------------------------------------------------*/
        System.out.println("------testFull------");
        System.out.println("the head of queue is :"+queue.peek());
        /*-------------------------------------------------------------------*/
        System.out.println("------testPop------");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.list();
        /*-------------------------------------------------------------------*/
        System.out.println("------testAgainAdd------");
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.list();


    }
}
