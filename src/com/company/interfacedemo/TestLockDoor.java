package com.company.interfacedemo;

// 接口的使用：
//      1.接口代表一种能力，接口可以定义N多方法，子类进行实现的时候，必须要实现这些方法
//              将这些方法进行实现，就意味着具体方法的能力
public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor= new LockDoor();
        lockDoor.openDoor();
        lockDoor.closeDoor();
        lockDoor.openLock();
        lockDoor.closeLock();
        System.out.print(lockDoor.a);
    }
}
