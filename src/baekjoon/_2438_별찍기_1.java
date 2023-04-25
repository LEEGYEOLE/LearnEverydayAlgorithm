package baekjoon;

import java.util.Scanner;
public class _2438_별찍기_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i = 0, j = 0;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}