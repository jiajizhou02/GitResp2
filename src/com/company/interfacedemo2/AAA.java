package com.company.interfacedemo2;

public class AAA implements Usb{

    @Override
    public void dataTransfer() {
        System.out.println("AAA进行数据传递");
    }

    @Override
    public void play() {

    }
}
