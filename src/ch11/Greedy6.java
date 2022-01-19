package ch11;

// 무지의 먹방 라이브
// https://programmers.co.kr/learn/courses/30/lessons/42891
public class Greedy6 {
	static int solution(int[] food_times, long k) {
		// 더 섭취해야 할 음식이 없다면 -1을 반환
        long summary = 0;
        for (int i = 0; i < food_times.length; i++) {
            summary += food_times[i];
        }
        if (summary <= k) return -1;
		
		k += 1;
		int answer = 0;
		int time = 0;
		int status = 0;
		while (true) {
			for (int i = 0; i < food_times.length; i++) {
				if(k==time) {
					break;
				}
				if (food_times[i] == 0) {
					continue;
				}
				food_times[i] -= 1;
				System.out.println("배열 안에: " + food_times[i]);
				time++;
				System.out.println("현재 시간은: " + time);
				answer = i+1;
			}
			if(k==time) {
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int time[] = { 3, 1, 2 }; // 각 음식을 모두 먹는데 필요한 시간이 음식의 번호 순서대로 들어 있는 배열
		long k = 5; // 방송이 중단된 시간

		int result = solution(time, k);
		System.out.println(result);
	}
}
