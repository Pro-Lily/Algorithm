package ch12;

import java.util.Scanner;

// 럭키 스트레이트
public class Impl1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] N = sc.nextLine().split("");
		int size = N.length/2;
		int left = 0, rigth = 0;
		
		for(int i=0; i<size; i++) {
			left += N[i].charAt(0) - '0';
			rigth += N[i+size].charAt(0) - '0';
		}

		if(left == rigth) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
	}
}
