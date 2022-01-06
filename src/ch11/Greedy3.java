package ch11;

import java.util.Scanner;

// 문자열 뒤집기
public class Greedy3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int[] arr = new int[s.length()];
		int zero = 0, one = 0;

		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
		if (arr[0] == 0) {
			zero++;
		} else {
			one++;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				if (arr[i] == 0) {
					zero++;
				}
				if (arr[i] == 1) {
					one++;
				}
			}
		}
		System.out.println(Math.min(zero, one));
	}
}
