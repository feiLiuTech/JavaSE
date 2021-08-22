package com.uestc.exception;


public class ExceptionDemo3 {
    public void test() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行了。。。。");
        }
        System.out.println("执行了。。。。");
    }

    public static int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("finally执行了。。。。");
            return 3;
        }
    }

    public static void main(String[] args) {
        int num = method();
        System.out.println(num);
    }
}