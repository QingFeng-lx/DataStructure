package com.qingfeng.linkedList;

/**
 * test
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        StudentNode node1 = new StudentNode(1, 2018010210, "liuxin");
        StudentNode node2 = new StudentNode(2, 2018010211, "liuyuan");
        StudentNode node3 = new StudentNode(3, 2018010212, "luxiaoyu");


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

        linkedList.addByOrder(node1);
        linkedList.addByOrder(node2);


        linkedList.list();

        /*------------------------------------------------------------------------*/
    }
}

class StudentNode {

    public int id;
    public int num;
    public String name;
    public StudentNode next;

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

class SingleLinkedList {
    /**
     * init a node of head
     */
    private StudentNode head = new StudentNode(0, 0, "");

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
    }

    /**
     * create a node by order
     *
     * @param studentNode
     */
    public void addByOrder(StudentNode studentNode) {
        //get a head node
        StudentNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id > studentNode.id) {
                break;
            } else if (temp.next.id == studentNode.id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println(studentNode.id + "  is existed and can't add again!");
        } else {
            studentNode.next = temp.next;
            temp.next = studentNode;

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