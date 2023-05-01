package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2606_바이러스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Queue<Integer> que = new LinkedList<Integer>();
		boolean[][] connect = new boolean[num + 1][num + 1];
		boolean[] isInfected = new boolean[num + 1];

		int connectCount = sc.nextInt();
		for (int i = 1; i <= connectCount; i++) {
			int row = sc.nextInt(), col = sc.nextInt();
			connect[row][col] = true;
			connect[col][row] = true;
		}
		isInfected[1] = true;
		que.offer(1);
		int count = 0;
		while (que.peek() != null) {
			int i = que.poll();
			for (int j = 2; j <= num; j++) {
				if (connect[i][j] == true) {
					if (!isInfected[j]) {
						que.offer(j);
						isInfected[j] = true;
						count++;
					} else
						continue;
				}
			}
		}
		System.out.println(count);
	}
}
