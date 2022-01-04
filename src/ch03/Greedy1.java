package ch03;

import java.util.Scanner;

// °Å½º¸§µ·
public class Greedy1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int money[] = {500, 100, 50, 10};
		int cnt = 0;
		
		for(int i=0; i<money.length; i++) {
			int coin = money[i]; // 500 100 50 10
			cnt += n / coin; // 2 4 5 6
			n = n % coin; // 260 60 10
		}
	}
}
 