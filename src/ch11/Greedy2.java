package ch11;

import java.util.Scanner;

// 곱하기 혹은 더하기
public class Greedy2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}

		int answer = s.charAt(0) - '0';

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= 1 || answer <= 1) {
				answer += arr[i];
			} else {
				answer *= arr[i];
			}
		}
		System.out.println(answer);
	}
}
