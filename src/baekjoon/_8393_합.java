package baekjoon;

import java.util.Scanner;
public class _8393_합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum=0;
		for(int i=1; i<=n; i++) 
			sum+=i;
		System.out.println(sum);
	}
}