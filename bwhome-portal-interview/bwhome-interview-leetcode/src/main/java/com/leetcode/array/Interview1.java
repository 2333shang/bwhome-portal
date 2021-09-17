package com.leetcode.array;

import java.util.*;


public class Interview1 {
    /**
     * 消除数组重复元素
     * hashSet
     */
    public static int[] removeRepeat(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(item->{
            set.add(item);
        });
        int[] res = new int[set.size()];
        int i = 0;
        for(Integer item : set){
            res[i] = item;
            i++;
        }
        return res;
    }

    /**
     * 数组升序排序
     * 冒泡
     * @param s
     */
    public static void sort(int[] s){
        //Arrays.sort(s); 时间复杂度O(n²)
        for(int i = 0; i < s.length; i++){
            for (int j = i + 1; j < s.length; j++){
                if(s[i] > s[j]){
                    int temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                }
            }
        }
    }

    /**
     * 单词反转
     * 栈
     */
    public static String reverse(String word){
        String[] strs = word.split(" ");
        String[] res = new String[strs.length];
        Stack<String> stack = new Stack<>();
        for (String s : strs){
            stack.push(s);
        }
        for(int i = 0; i < res.length; i++){
            res[i] = stack.pop();
        }
        return String.join(" ",res);
    }

    /**
     * 寻找不重复元素
     * @param nums
     * @return
     */
    public static int SingleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
       /*  数组去重
        int[] nums = {1,1,1,2,3,4,5,6,6};
        Arrays.stream(Interview1.removeRepeat(nums)).forEach(item->{
            System.out.println(item);
        });*/
       /* 交换排序-冒泡排序
       int[] nums = {1,1,1,2,3,4,5,6,6,2,3,4};
       Interview1.sort(nums);*/
        /* 单词反转
        System.out.println(Interview1.reverse("This is a word"));*/

        int nums[] = {1,2,3,4,1,2,3};
        System.out.println(Interview1.SingleNumber(nums));
    }
}


