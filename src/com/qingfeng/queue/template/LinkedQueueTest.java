package com.qingfeng.queue.template;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        /*-------------------------------------------------------*/
        System.out.println("-----testEnQueue-----");
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.list();
        /*-------------------------------------------------------*/
        System.out.println("-----testRemove-----");
        String s = queue.remove(3);
        System.out.println("remove:"+s);
        queue.list();
        /*-------------------------------------------------------*/
        System.out.println("-----testGet-----");
        String s2 = queue.get(2);
        System.out.println(s2);
        /*-------------------------------------------------------*/
        System.out.println("-----testDeQueue-----");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());



    }
}
