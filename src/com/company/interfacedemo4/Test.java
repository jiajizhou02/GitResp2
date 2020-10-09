package com.company.interfacedemo4;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class Test {
    public static void main(String[] args) {
            Computer computer =new Computer();
            CPU cpu = new InterCpu();
            CPU cpu1 = new AmdCpu();
            HardDisk hardDisk =new JSDHardDisk();
            computer.show(cpu,hardDisk);
            PUSH.AALOAD.getExceptions();

    }
}
