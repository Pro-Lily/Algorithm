package ch12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// 문자열 재정렬
public class Impl2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] N = sc.nextLine().split("");
		ArrayList<Character> list = new ArrayList<Character>();

		int num = 0;

		Arrays.sort(N);

		for (int i = 0; i < N.length; i++) {
			char c = N[i].charAt(0);
			if (Character.isLetter(c)) {
				list.add(c);
			} else {
				num += c - '0';
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

		if (num > 0) {
			System.out.println(num);
		}
	}
}
