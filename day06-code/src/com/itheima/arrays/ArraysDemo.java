package com.itheima.arrays;

import java.util.Arrays;

public class ArraysDemo {
     /*
        Arrays类常用方法 :
        -------------------------------------------------------------------------------------------
        public static String toString (类型[] a) : 将数组元素拼接为带有格式的字符串
        public static boolean equals (类型[] a, 类型[] b) : 比较两个数组内容是否相同
        public static int binarySearch (int[] a, int key) : 查找元素在数组中的索引 (二分查找法: 保证数组的元素是排好序的)
                                                                - 如果查找的元素, 在数组中不存在: 返回 (-(插入点) - 1)
        public static void sort (类型[] a) : 对数组进行默认升序排序
                    TODO: 后面学完了红黑树, 回头对这个方法做补充
        -------------------------------------------------------------------------------------------
     */
     public static void main(String[] args) {

         int[] arr1 = new int[]{11,22,33,44,55};
         int[] arr2 = new int[]{11,22,33,44,55};

         //将数组元素拼接为带有格式的字符串
         System.out.println(Arrays.toString(arr1));//[11, 22, 33, 44, 55]

         //比较两个数组内容是否相同
         System.out.println(Arrays.equals(arr1, arr2));

         //查找元素在数组中的索引 (二分查找法: 保证数组的元素是排好序的)——- 如果查找的元素, 在数组中不存在: 返回 (-(插入点) - 1)
         System.out.println(Arrays.binarySearch(arr1, 17));//-2(插入点:1,所以是-1-1=-2)
         System.out.println(Arrays.binarySearch(arr1, 11));//0

         // 对数组进行默认升序排序
         int[] arr3 ={11,33,22,55,44};
         Arrays.sort(arr3);
         System.out.println(Arrays.toString(arr3));

     }
}
