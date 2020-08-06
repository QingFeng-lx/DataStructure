package com.qingfeng.linkedList.doubles;

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
