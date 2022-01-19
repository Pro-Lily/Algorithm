package ch11;

import java.util.Scanner;

// 볼링공 고르기
public class Greedy5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 볼링공의 개수
		int M = sc.nextInt(); // 볼링공의 최대 무게
		
		int[] K = new int[N]; // 1 3 2 3 2
		
		int answer = 0;
		
		for(int i=0; i<K.length; i++) {
			K[i] = sc.nextInt();
		}
		
		for(int i=0; i<K.length; i++) {
			for(int j=i+1; j<K.length; j++) {
				if(K[i] != K[j]) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
