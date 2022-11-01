package com.msb.basic.class04;

import java.sql.Array;

public class ArrayTest {
    public static void main(String[] args) {
        //1.声明数组然后申请空间
        int[] array;
        array = new int[5];
        array[0] = 1;

        //2.声明时申请空间
        int[] array2 = new int[5];

        //3.声明并赋值
        int[] array3 = new int[]{1,2,3,4,5};
        int[] array4 = {1,2,3,4,5};

        int[] array5 = new int[]{56, 98, 34, 89, 100};

    }
}
