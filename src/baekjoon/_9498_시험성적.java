package baekjoon;

import java.util.Scanner;
public class _9498_시험성적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n>=90&&n<=100?"A":n>=80&&n<=89?"B":n>=70&&n<=79?"C":n>=60&&n<=69?"D":"F");
		sc.close();
	}
}