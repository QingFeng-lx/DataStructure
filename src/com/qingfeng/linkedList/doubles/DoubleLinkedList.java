package com.qingfeng.linkedList.doubles;

public class DoubleLinkedList {
    /**
     * init a node of head
     */
    private StudentNode head;

    public DoubleLinkedList( ) {
        head = new StudentNode(0, 0, "");
    }

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
            if (temp == null) {
                break;
            }
            if (temp.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
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
