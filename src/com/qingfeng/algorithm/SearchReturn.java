package com.qingfeng.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchReturn {

    public static int findRepeatNumber(int[]nums){
        Set<Integer> set=new HashSet<>();
        for (int num:nums){
            if (!set.add(num)){
                return num;
            }
        }
        return -1;
    }
    public static int findRepeatNumber2(int[]nums){
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static int findRepeatNumber3(int[]nums){
        int lentgh=nums.length;
        int[]temp=new int[lentgh];
        for (int i=0;i<lentgh;i++){
            temp[nums[i]]++;
            if (temp[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]num=new int[]{1,3,2,8,4,5,6,6};
        int number = findRepeatNumber(num);
        System.out.println(number);
        int repeatNumber2 = findRepeatNumber2(num);
        System.out.println(repeatNumber2);
        int number3 = findRepeatNumber3(num);
        System.out.println(number3);
    }
}
