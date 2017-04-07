package com.knight.rxjavademo;

/**
 * Created by knightoneadmin on 2017/3/19.
 */

public class Test {
    public static void main(String[] args) {
        int[] list = {1, 56, 89, 32, 63, 43, 87, 27, 91, 37};
        int temp = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println("排序后的：" + list[i]);
        }
    }
}
