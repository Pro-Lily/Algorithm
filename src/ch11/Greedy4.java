package ch11;

import java.util.Arrays;
import java.util.Scanner;

// 만들 수 없는 금액
public class Greedy4 {
	public static void main(String[] args) {
		/* N이 5일 때 1원, 1원, 2원, 3원, 9원는
		       만들 수 있는 금액 = 1원, 2원, 3원, 4원(1+1+2), 5원(2+3), 6원(3+2+1), 7원(3+2+1+1), 9원 등등
		       만들 수 없는 금액 중에 최소는 8원이 된다.*/

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int j = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > j) {
				break;
			}
			j += arr[i];
		}
		System.out.println(j);
	}
}
