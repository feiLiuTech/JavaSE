package com.uestc.exception;

public class EcmDef extends RuntimeException {
    static final long serialVersionUID = -7034897190745326939L;
    public  EcmDef(String message){
        super(message);
    }

    public static void main(String[] args) {
        try {

            int a=Integer.valueOf(args[0]);
            int b=Integer.valueOf(args[1]);
            System.out.println(method(a,b));
        } catch (NumberFormatException e) {
            System.out.println("数 据 类 型 不 一 致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺 少 命 令 行 参 数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (EcmDef e){
            System.out.println(e.getMessage());
        }

    }

    public static int method(int a,int b) throws EcmDef{
        if(a<0 || b<0){
            throw new EcmDef("输入负数");
        }
        return a/b;
    }
}
