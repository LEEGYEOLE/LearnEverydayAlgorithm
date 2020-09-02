package swea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 
 * @date 2020. 9. 2.
 * @author Lee GyeoLe
 * @filename _1767.java
 * 1767. [SW Test 샘플문제] 프로세서 연결하기
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV4suNtaXFEDFAUf
 */
public class _1767 {
	
	static class Process {	//좌표
		int y;
		int x;
		Process(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	static int N;	// core수
	static int[][] map;
	static int[] dy = { -1, 1, 0, 0 }; 
	static int[] dx = { 0, 0, -1, 1 };

	static ArrayList<Process> list;
	static int min;
	static int max;

	public static void main(String[] args) throws Exception {
		File file = new File("././resource/data/sample_input1767.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		int ts = Integer.parseInt(br.readLine().trim());

		for (int t = 1; t <= ts; t++) {

			N = Integer.parseInt(br.readLine().trim());

			map = new int[N][N];
			list = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (map[i][j] == 1) {	// 현재 위치가 코어인 경우
						if (i - 1 < 0 || j - 1 < 0 || i + 1 >= N || j + 1 >= N)	//가장자리이면 전선 연결 필요없음. pass
							continue;
						list.add(new Process(i, j)); // 벽이 아닌 코어 저장
					}
				}
			}
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;

			dfs(0, 0, 0);

			System.out.println("#" + t + " " + min);
		}

	}

	public static void dfs(int idx, int coreCnt, int len) {

		// 종료조건 : 증가되는 인덱스가 list의 사이즈만큼 되었을 때 -> 모든 코어 다 check
		if (idx == list.size()) {
			if (max < coreCnt) { // 코어 개수가 더 많아서 갱신해야할 때
				max = coreCnt;
				min = len;
			} else if (max == coreCnt) { // 코어 개수가 같아서 길이 비교
				if (min > len)
					min = len;
			}
			return;
		}

		int y = list.get(idx).y;
		int x = list.get(idx).x;

		for (int dir = 0; dir < 4; dir++) {

			int count = 0;
			int originY = y;
			int originX = x;
			int ny = y;
			int nx = x;

			while (true) {
				ny += dy[dir];
				nx += dx[dir];

				if (ny < 0 || nx < 0 || ny >= N || nx >= N) { // 벽을 만날때까지
					break;
				}

				if (map[ny][nx] == 1) { // 전선을 만나면 못가는 곳
					count = 0;
					break;
				}

				count++;
			}

			// len += count;

			for (int i = 0; i < count; i++) {
				originY += dy[dir];
				originX += dx[dir];

				map[originY][originX] = 1;
			}

			if (count == 0) { // 전선을 연결할 수 없는 코어
				dfs(idx + 1, coreCnt, len);
			} else {
				dfs(idx + 1, coreCnt + 1, len + count);

				originY = y;
				originX = x;
				for (int i = 0; i < count; i++) {
					originY += dy[dir];
					originX += dx[dir];

					map[originY][originX] = 0;
				}
				// len -= count;
			}

		}

	}

}