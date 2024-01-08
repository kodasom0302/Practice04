package com.javaex.practice;

public class Ex08 {

/*	
배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
(중복체크 할 것)
*/
	public static void main(String[] args) {
		
		int[] lotto=new int[6];
		lotto[0]=(int)(Math.random()*45)+1;
		lotto[1]=(int)(Math.random()*45)+1;
		lotto[2]=(int)(Math.random()*45)+1;
		lotto[3]=(int)(Math.random()*45)+1;
		lotto[4]=(int)(Math.random()*45)+1;
		lotto[5]=(int)(Math.random()*45)+1;
		
		for (int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}

	}

}
