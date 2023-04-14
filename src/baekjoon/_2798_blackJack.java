package baekjoon;

import java.util.Scanner;
/**
 * baekjoon__2798_blackJack
 * @date 2023. 04. 14
 */
public class _2798_blackJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if ((arr[i] + arr[j] + arr[k]) <= m)
						max = max < (arr[i] + arr[j] + arr[k]) ? (arr[i] + arr[j] + arr[k]) : max;
				}
			}
		}
		System.out.println(max);
	}
}
