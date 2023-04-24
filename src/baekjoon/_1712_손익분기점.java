package baekjoon;

import java.util.Scanner;
public class _1712_손익분기점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int x = 0;
		if (b>=c)
			System.out.println("-1");
		else {
			x = a / (c - b)+1;
			System.out.println(x);
		}
		sc.close();
	}
}