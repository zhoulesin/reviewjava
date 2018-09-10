# Java修饰符

## 访问控制修饰符

- default 包可见
- private 类可见
- protected 包 + 子类 可见
- public 所有可见

 ### 访问控制和继承

- 父类声明为public的方法在子类中也必须为public
- 父类声明为protected的方法在子类中要么为protected,要么为public
- 父类声明中private的方法,不能被继承



## 非访问修饰符

- static
  - final 类不能被继承,方法不能被重写,变量不能被修改(常量)
- abstract
- synchronized 和 volatile 主要用于多线程

### synchronized

声明方法时同一时间只能被一个线程访问.synchronized修饰符可以应用于四个访问修饰符

```java
public synchronized void showDetails(){ ... }
```

### transient

序列化的对象包含被transient修饰的实例变量时,Java虚拟机跳过该特定的变量

该修饰符包含在定义变量的语句中,用来预处理类和变量的数据类型

```java
public class AA{
    public transient int limt = 11;	//不会持久化
    public int b;	//持久化
}
```

### volatile

volatile修饰的成员变量在每次被线程访问时,都强制从共享内存中重新读取该成员变量的值.而且,当成员变量发生变化时,会强制线程将变化值写到共享内存.这样在任何时刻,两个不同的线程总是看到某个成员变量的同一个值

一个volatile对象引用可能是null

```java
public class MyRunnable implements Runnable{
    private volatile boolean active;
    public void run(){
        active = true;
        while(active){}
    }
    public void stop(){
        active = false;
    }
}
```

通常情况下,在一个线程调用run方法,在另一个线程调用stop方法,如果run中的active被使用,那么stop的active为false时循环不会停止

但是代码中使用了volatile修饰active,所以该循环会停止