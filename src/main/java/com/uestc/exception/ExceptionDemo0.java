package com.uestc.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * 异常处理的方式二：throws+异常类型
 * 1."throw + 异常类型"写在方法的声明处，指明此方法执行时，可能会出现的异常类型
 *    一旦方法执行时，出现异常仍会在异常代码处生成一个异常类的对象，此对象满足throws异常类型时，就会被抛出，
 *    异常后的代码不会被执行了
 * 2. 体会： try-catch-finally：真正的将异常给处理掉了
 *          throws的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉
 * */
public class ExceptionDemo0 {

    public static void main(String[] args) {
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }

        method3();
    }



    public static void method3(){
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException{
        method1();
    }

    public static void method1() throws IOException{
        File file=new File("hello.txt");
        FileInputStream  fis=new FileInputStream(file);
        int data=fis.read();
        while(data!=-1){
            System.out.println((char)data);
            data=fis.read();
        }
    }

}


