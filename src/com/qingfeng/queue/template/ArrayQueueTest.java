package com.qingfeng.queue.template;

import sun.misc.Queue;

public class ArrayQueueTest {

    public static void main(String[] args) {
        User liuxin = new User(2018, "liuxin");
        User yanghai = new User(2019, "yanghai");
        User dahai = new User(2020, "dahai");

        /*----------------------------------------------------------*/
        ArrayQueue<User> queue = new ArrayQueue<User>(5);
        queue.add(liuxin);
        queue.add(yanghai);
        queue.add(dahai);
        queue.list();
        /*----------------------------------------------------------*/
        System.out.println();
        System.out.println(queue.get(1));
        /*----------------------------------------------------------*/
        System.out.println();
        queue.remove(0);
        queue.list();


    }
}
