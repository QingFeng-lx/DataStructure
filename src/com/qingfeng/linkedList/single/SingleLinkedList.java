package com.qingfeng.linkedList.single;

import java.util.Stack;

public class SingleLinkedList {

    private StudentNode head;

    /**
     * init a node of head
     */
    public SingleLinkedList() {
        head = new StudentNode(0, 0, "");
    }

    public StudentNode getHead() {
        return head;
    }

    /**
     * create node
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
        StudentNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Can't find the node for id!");
        }
    }

    /**
     * get length of linkedList
     *
     * @param head
     * @return
     */
    public int getLength(StudentNode head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        StudentNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    /**
     * get a node of lastIndex
     *
     * @param head
     * @param index
     * @return
     */
    public StudentNode getLastIndexNode(StudentNode head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getLength(head);
        if (index <= 0 || index > size) {
            return null;
        }
        StudentNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * reverse a list
     *
     * @param head
     */
    public void reverseList(StudentNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        StudentNode cur = head.next;
        StudentNode next = null;
        StudentNode reverseHead = new StudentNode(0, 0, "");
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }

    /**
     * print a list by reverse
     *
     * @param head
     */
    public void reversePrint(StudentNode head) {
        if (head.next == null) {
            return;
        }
        Stack<StudentNode> stack = new Stack<StudentNode>();
        StudentNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
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
