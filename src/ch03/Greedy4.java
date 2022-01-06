package ch03;

import java.util.Scanner;

// 1이 될 때까지
public class Greedy4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int cnt = 0;

		while (N != 1) {
			if (N % K != 0) {
				N -= 1;
				cnt++;
			} else {
				N /= K;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
