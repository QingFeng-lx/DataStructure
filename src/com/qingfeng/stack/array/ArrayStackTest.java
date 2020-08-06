package com.qingfeng.stack.array;
// System.out.println("----- -----");
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        /*------------------------------------------------------------------*/
        System.out.println("-----testPush-----");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(80);
        stack.list();
        /*------------------------------------------------------------------*/
        System.out.println("-----testPop-----");
        stack.pop();
        stack.list();
        /*------------------------------------------------------------------*/
        System.out.println("-----testGetLength-----");
        System.out.println("the length of stack is: "+stack.getLength());


    }
}
