package ch04;

import java.util.Scanner;

// 상하좌우
public class Impl1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] type = sc.nextLine().split(" ");

		int x = 1, y = 1;

		for (int i = 0; i < type.length; i++) {
			if (type[i].equals("L") && y > 1) {
				y--;
			} else if (type[i].equals("R") && y < N) {
				y++;
			} else if (type[i].equals("U") && x > 1) {
				x--;
			} else if (type[i].equals("D") && x < N) {
				x++;
			}
		}
		System.out.println(x + " " + y);
	}
}
