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

class StudentNode {

    public int id;
    public int num;
    public String name;
    public StudentNode next;
    public StudentNode pre;

    public StudentNode(int id, int num, String name) {
        this.id = id;
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentNode{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

class DoubleLinkedList {
    /**
     * init a node of head
     */
    private StudentNode head = new StudentNode(0, 0, "");

    public StudentNode getHead() {
        return head;
    }

    /**
     * create node of LinkedList
     *
     * @param studentNode
     */

    public void add(StudentNode studentNode) {
        StudentNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;

            }
        }
        temp.next = studentNode;
        /**
         * 1) temp.next.pre=temp;
         * 2) studentNode.pre=temp;
         */

        studentNode.pre = temp;
    }

    /**
     * update a node
     *
     * @param studentNode a student object
     */
    public void update(StudentNode studentNode) {
        if (head.next == null) {
            System.out.println("linkedList is empty!");
            return;
        }
        StudentNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.id == studentNode.id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.num = studentNode.num;
            temp.name = studentNode.name;
        } else {
            System.out.println("Can't find :" + studentNode.id + " node!");
        }
    }

    /**
     * remove a node by id
     *
     * @param id
     */
    public void remove(int id) {
        StudentNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp== null) {
                break;
            }
            if (temp.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
             temp.pre.next=temp.next;
             if (temp.next!=null){
                 temp.next.pre=temp.pre;
             }


        } else {
            System.out.println("Can't find the node for id!");
        }
    }


    /**
     * order the list
     */
    public void list() {
        if (head.next == null) {
            System.out.println("LinkedList is empty!");
            return;
        }

        StudentNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            } else {
                System.out.println(temp);
            }
            temp = temp.next;
        }
    }
}