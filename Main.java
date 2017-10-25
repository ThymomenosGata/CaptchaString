package com.yougen.main;

import java.util.Random;

public class Main {

	private static char[] symb = {'0','1','2','3','4','5','6','7','8','9','A','a','B','b','C','c','D','d','E','e','F','f','G','g','H','h',
			'I','i','J','j','K','k','L','l','M','m','N','n','O','o','P','p','Q','q','R','r','S','s','T','t','U','u','V','v',
			'W','w','X','x','Y','y','Z','z'};
	
	public static void main(String[] args) {
		Random random = new Random();
		String str = String.valueOf(symb[random.nextInt(62)]);
		for(int i = 0; i < 11; i++) {
			str+= String.valueOf(symb[random.nextInt(62)]);
		}
		System.out.println(str);
	}

}
