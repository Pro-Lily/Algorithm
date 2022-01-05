package ch03;

import java.util.Arrays;
import java.util.Scanner;

// 숫자 카드 게임
public class Greedy3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] card = new int[N][M];
		int[] num = new int[N];

		int k = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				card[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			Arrays.sort(card[i]);
		}

		int max = 0;

		for (int i = 0; i < N; i++) {
			if (card[i][0] > max) {
				max = card[i][0];
			}
		}

		System.out.println(max);
	}
}
