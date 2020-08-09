package com.qingfeng.test;

import com.sun.org.apache.bcel.internal.classfile.StackMap;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AllTest {
    @Test
    public void test1(){
        int capacity=5;
        int c;
        System.out.println(c=5%5);
    }
    @Test
    public void test2(){
        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>();
        queue.add("10");
        Object peek = queue.peek();
        System.out.println(peek);

    }
    @Test
    public void test3(){
        TreeMap<Object, Object> treeMap = new TreeMap<>();
        treeMap.put("a",10);
        Object a = treeMap.get("a");
        System.out.println(a);


    }
    @Test
    public void test4(){
        LinkedList<Object> list = new LinkedList<>();
        Map<Object, Object> map =  new HashMap<>();

    }
    @Test
    public void test5(){

    }


}
