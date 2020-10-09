package com.company.interfacedemo;

//
//5.接口不可以被实例化
//6.接口中的变量都是静态常量，如果变量没有使用stati关键字修饰，它也表示静态常量,不用final关键字,也是常量；
//7.接口中的方法和常量吴润是否添加public修饰，默认的权限有且仅有一个，就是public
public interface  Lock {
    //写不写 static final 都没关系，如果你没写，系统会自动帮你写上，但规范上建议还是自己写上
    /*static final int a=200;*/
    int  a=2;

    //接口中的方法 默认是 也一定是public abstract 不管写不写都是public abstract 而不是default
    void openLock();
    void closeLock();
}
