package com.uestc.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法重写的规则之一：
 *  子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {
        ExceptionDemo1 test=new ExceptionDemo1();
        test.display(new SubClass());

    }
    //子类重写了父类的method方法，根据多态会去调用子类的method方法
    public void display(SuperClass s){
        try {
            s.method();
            //如果这里子类的方法抛出的异常大于父类，这里的父类异常将处理不了
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

class SuperClass{

    public void method() throws IOException{
    }
}

class SubClass extends SuperClass{
    public void method() throws FileNotFoundException,IOException {

    }

}