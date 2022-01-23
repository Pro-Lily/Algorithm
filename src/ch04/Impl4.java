package ch04;

import java.util.Scanner;

/* 
 ## 북, 동, 남, 서 
	북 -> 서 (-1, 0)
	동 -> 북 (0, 1) 
	남 -> 동 (1, 0)
	서 -> 남 (0, -1)
*/

// 게임 개발
public class Impl4 {
	public static int direction;

	// 왼쪽으로 회전
	/* 입력 예로 북쪽(0)에 위치하기 때문에 direction이 음수이면
	북에서 서로 이동하기 때문에 3으로 나타내준다. */
	public static void left() {
		direction--;
		if (direction == -1) {
			direction = 3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 북, 동, 남, 서
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		int[][] map = new int[50][50]; // 전체 맵

		int N = sc.nextInt();
		int M = sc.nextInt();

		// (x, y)에서 어느 쪽을 바라보고 서 있는지
		int x = sc.nextInt();
		int y = sc.nextInt();
		direction = sc.nextInt(); // 북(0), 동(1), 남(2), 서(3)

		// 캐릭터의 현재 위치 방문
		map[x][y] = 1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int turn = 0; // 회전을 4번 했는지 체크
		int count = 1;

		while (true) {
			// 왼쪽 방향부터 차례대로 갈 곳을 정한다.
			left();
			int nx = x + dx[direction];
			int ny = y + dy[direction];

			// 가보지 않은 곳(0)일 경우에 그 곳으로 이동한다.
			if (map[nx][ny] == 0) {
				map[nx][ny] = 1;
				x = nx;
				y = ny;
				count++;
				turn = 0;
			}else {
				left();
				turn++;
			}
			
			// 네 방향 모두 이미 가본 칸이거나 바다로 되어 있는 칸인 경우
			// 바라보는 방향을 유지한 채로 한 칸 뒤로 가고 1단계로 돌아간다.
			// 이때 뒤쪽 방향이 바다인 칸이라 뒤로 갈 수 없는 경우에는 움직임을 멈춘다.
			if(turn == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				
				if(map[nx][ny] == 0) {
					x = nx;
					y = ny;
				}else break;
				turn = 0;
			}
		}
		System.out.println(count);
	}
}
