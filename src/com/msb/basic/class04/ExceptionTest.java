package com.msb.basic.class04;

/**
 * 程序运行过程中，如果处理异常的部分包含finally的处理，那么无论代码是否发生异常，finally中的代码总会执行
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("运行结束");
        }

        Integer i = 100;
    }
}
