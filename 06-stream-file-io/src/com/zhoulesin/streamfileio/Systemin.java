package com.zhoulesin.streamfileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Systemin {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		char condition ;
//		do {
//			condition = (char) bufferedReader.read();
//			System.out.println(condition);
//		} while (condition != 'q');
		
		
		String str;
		do {
			str = bufferedReader.readLine();
			System.out.println(str);
		} while (!"end".equals(str));
		
		
	}
}
