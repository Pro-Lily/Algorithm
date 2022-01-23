package ch04;

import java.util.Scanner;

// 왕실의 나이트
public class Impl3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");

		int x = str[0].charAt(0) - 96;
		int y = str[1].charAt(0) - '0';

		int[][] move = { { 1, 2 }, { 1, -2 }, { -1, 2 }, { -1, -2 }, { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 } };
		int count = 0;

		for (int i = 0; i < move.length; i++) {
			int dx = x + move[i][0];
			int dy = y + move[i][1];
			if (dx >= 1 && dy >= 1 && dx <= 8 && dy <= 8) {
				count++;
			}
		}

		System.out.println(count);
	}
}
