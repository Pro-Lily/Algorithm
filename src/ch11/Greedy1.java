package ch11;

import java.util.Arrays;
import java.util.Scanner;

// 모험가 길드
public class Greedy1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 5
		int[] adv = new int[N]; // 2 3 1 2 2

		for (int i = 0; i < N; i++) {
			adv[i] = sc.nextInt();
		}

		int cnt = 0;
		int group = 0;

		Arrays.sort(adv);

		for (int i = 0; i < N; i++) {
			cnt++;
			if (cnt >= adv[i]) {
				cnt = 0;
				group++;
			}
		}
		System.out.println("group: " + group);
	}
}
