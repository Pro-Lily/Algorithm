package ch11;

// 무지의 먹방 라이브
// https://programmers.co.kr/learn/courses/30/lessons/42891
public class Greedy6 {
	static int solution(int[] food_times, long k) {
		long zero = 0;
		int answer = 0;
		int time = -1;

		while (true) {
			for (int i = 0; i < food_times.length; i++) {
				zero += food_times[i];

				if (k == time) {
					break;
				}
				if (food_times[i] == 0) {
					continue;
				}
				food_times[i]--;
				time++;
				answer = i + 1; // 0번째니까 +1
			}
			if (k == time) {
				break;
			}
			// 더 섭취해야 할 음식이 없다면 -1을 반환
			if (zero <= k) {
				return -1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// 각 음식을 모두 먹는데 필요한 시간이 음식의 번호 순서대로 들어 있는 배열
		int time[] = { 3, 1, 2 };
		// 방송이 중단된 시간
		long k = 5;

		int result = solution(time, k);
		System.out.println(result);
	}
}
