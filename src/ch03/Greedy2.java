package ch03;

import java.util.Arrays;
import java.util.Scanner;

// 큰 수의 법칙
public class Greedy2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 배열의 크기
		int M = sc.nextInt(); // 숫자가 더 해지는 횟수
		int K = sc.nextInt(); // K번 까지 더해짐

		int sum = 0;

		int[] number = new int[N]; // 2 4 5 4 6
		
		for(int i=0; i<N; i++) {
			number[i] = sc.nextInt();
		}

		Arrays.sort(number);
		
		while (true) {		
			for(int i=0; i<K; i++) {
				if (M == 0) {
					break;
				}
				sum += number[N-1];
				M--;
			}
			sum += number[N-2];
			M--;
			
			if (M == 0) {
				break;
			}
		}
		System.out.println(sum);
	}
}
