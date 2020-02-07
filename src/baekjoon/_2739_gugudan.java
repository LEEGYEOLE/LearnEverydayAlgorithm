package baekjoon;

import java.util.Scanner;

/**
 * baekjoon_2739_gugudan
 * @date 2020. 02. 12
 */
public class _2739_gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}	
