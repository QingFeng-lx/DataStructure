package com.qingfeng.linkedList.doubles;


/**
 * test
 */
@SuppressWarnings("all")
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        StudentNode node1 = new StudentNode(1, 2018010210, "liuxin");
        StudentNode node2 = new StudentNode(2, 2018010211, "yanghai");
        StudentNode node3 = new StudentNode(3, 2018010212, "huxiaotian");

        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        /*------------------------------------------------------------------------*/
        System.out.println("-------testList-------");
        linkedList.list();
        /*------------------------------------------------------------------------*/
        System.out.println("-------testAdd-------");
        StudentNode node4 = new StudentNode(4, 2018010212, "guoyoudao");
        linkedList.add(node4);
        linkedList.list();
        /*------------------------------------------------------------------------*/
        System.out.println("-------testRemove----");
        linkedList.remove(3);
        linkedList.list();
        /*------------------------------------------------------------------------*/
        System.out.println("-------testUpdate-----");
        StudentNode update = new StudentNode(4, 2018010212, "xiaoming");
        linkedList.update(update);
        linkedList.list();

    }
}

