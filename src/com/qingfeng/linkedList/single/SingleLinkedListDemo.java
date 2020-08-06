package com.qingfeng.linkedList.single;

import java.util.Stack;

/**
 * test
 */
@SuppressWarnings("all")
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        StudentNode node1 = new StudentNode(1, 2018010210, "liuxin");
        StudentNode node2 = new StudentNode(2, 2018010211, "yanghai");
        StudentNode node3 = new StudentNode(3, 2018010212, "huxiaotian");

        SingleLinkedList linkedList = new SingleLinkedList();
        /*------------------------------------------------------------------------*/
        /*linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);

        linkedList.list();*/
        /*------------------------------------------------------------------------*/
        linkedList.addByOrder(node1);
        linkedList.addByOrder(node3);
        linkedList.addByOrder(node2);

        /*linkedList.addByOrder(node1);
        linkedList.addByOrder(node2);*/

        linkedList.list();
        /*------------------------------------------------------------------------*/
       /* System.out.println();
        StudentNode updateNode = new StudentNode(3, 2018010218, "huge");
        linkedList.update(updateNode);
        linkedList.list();
*/
        /*------------------------------------------------------------------------*/
       /* System.out.println();
        linkedList.remove(3);
        //linkedList.remove(1);
        linkedList.list();*/
        /*------------------------------------------------------------------------*/
       /* System.out.println();
        int length = linkedList.getLength(linkedList.getHead());
        System.out.println("length:"+length);*/
        /*------------------------------------------------------------------------*/
       /* System.out.println();
        StudentNode lastIndexNode = linkedList.getLastIndexNode(linkedList.getHead(), 1);
        System.out.println(lastIndexNode);*/
        /*------------------------------------------------------------------------*/
        /*System.out.println();
        linkedList.reverseList(linkedList.getHead());
        linkedList.list();*/
        /*------------------------------------------------------------------------*/
        System.out.println();
        linkedList.reversePrint(linkedList.getHead());




    }
}

