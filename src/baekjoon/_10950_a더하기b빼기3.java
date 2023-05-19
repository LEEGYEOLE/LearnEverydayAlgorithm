package baekjoon;

import java.util.Scanner;

public class _10950_a더하기b빼기3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt() + sc.nextInt();
		}
		for (int i : s)
			System.out.println(i);
		sc.close();
	}
}
