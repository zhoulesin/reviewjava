package com.zhoulesin.basicdatatype;

public class Overflow {
	public static void main(String[] args) {
		int i = 129;
		
//		00000000 00000000 00000000 10000001  129有符号二进制 源码
//		00000000 00000000 00000000 10000001  129有符号二进制 反码
//		00000000 00000000 00000000 10000001  129有符号二进制 补码
		
		//补码截取为byte   10000001	
		//反码 = 补码-1    10000000
		//源码 = 反码 (符号位不变,其他位取反)         11111111
		
		//这样得到的结果是-127s
		System.out.println((byte)i); //-127
	}
}
