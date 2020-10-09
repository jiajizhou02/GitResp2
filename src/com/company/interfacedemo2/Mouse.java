package com.company.interfacedemo2;

public class Mouse implements Usb{

    @Override
    public void dataTransfer() {
        System.out.println("鼠标来点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("");
    }
}
