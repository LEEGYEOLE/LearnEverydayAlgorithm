package baekjoon;

import java.util.Scanner;

public class _11718_그대로출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			System.out.println(a);
		}
		sc.close();
	}
}
