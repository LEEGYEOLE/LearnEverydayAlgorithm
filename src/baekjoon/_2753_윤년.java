package baekjoon;

import java.util.Scanner;
public class _2753_윤년 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
			System.out.println((n%4==0&&n%100!=0||n%400==0?"1":"0"));
		sc.close();
	}
}