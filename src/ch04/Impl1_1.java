package ch04;

import java.util.Scanner;

// 상하좌우
public class Impl1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] move = sc.nextLine().split(" ");

		int x = 1, y = 1;

		char[] type = { 'L', 'R', 'U', 'D' };

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { -1, 1, 0, 0 };

		for (int i = 0; i < N; i++) {
			char c = move[i].charAt(0);
			int nx = -1, ny = -1;

			for (int j = 0; j < 4; j++) {
				if (c == type[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			if (nx > N || ny > N || nx < 1 || ny < 1)
				continue;
			x = nx;
			y = ny;
		}
		System.out.println(x + " " + y);
	}
}
