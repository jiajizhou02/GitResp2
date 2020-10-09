package com.company.interfacedemo3;

public class CopyMechine implements  InkBox,Paper{

    @Override
    public void getWriteAndBlock() {
        System.out.println("使用黑白墨盒打印");
    }

    @Override
    public void getColor() {
        System.out.print("使用彩色墨盒打印");
    }

    @Override
    public void getA4() {
        System.out.println("在A4纸上");
    }

    @Override
    public void getB5() {
        System.out.println("***使用A5纸打印***");
    }

    public static void main(String[] args) {
        CopyMechine copyMechine = new CopyMechine();
        copyMechine.getColor();
        copyMechine.getA4();
        copyMechine.getB5();
    }
}
