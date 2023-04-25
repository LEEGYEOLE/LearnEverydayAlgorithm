package baekjoon;

import java.util.Scanner;
public class _2455_지능형기차 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			int sum = 0;
		    String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				sum += Integer.parseInt(String.valueOf(str.charAt(j)));
			}
			if (n == sum + i) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		return;
	}
}