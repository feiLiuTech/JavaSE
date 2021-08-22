package com.uestc.exception;

public class ExceptionDemo2 {


    public static void main(String[] args) {
        try {
            Student stu=new Student();
            stu.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class Student{

    private int id;
    public void regist(int id) throws Exception{
        if(id>0){
            this.id=id;
        }else {
            throw new RuntimeException("输入的数据非法");
        }
    }
}