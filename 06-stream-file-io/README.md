#  Stream-File-IO

## 介绍

Java.io包几乎包含了所有操作输入.输出需要的类.所有这些流类代表了输入源和输出目标.

java.io包中的流支持很多种格式,比如.基本类型,对象,本地化字符集等等

一个流可以理解为一个数据的序列.输入流表示从一个源读取数据,输出流表示向一个目标写数据

java为io提供了强大而且灵活的支持,使其更广泛地应用到文件传输和网络编程中

## 读取控制台输入

System.in

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

调用read()方法读取一个字符