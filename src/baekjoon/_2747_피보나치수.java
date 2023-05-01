package baekjoon;

import java.util.Scanner;
public class _2747_피보나치수 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0, j=1, x=1;
		for(int z=2; z<=n; z++) {
			x=i+j;
			i=j;
			j=x;
		}
		System.out.println(x);
	}
}