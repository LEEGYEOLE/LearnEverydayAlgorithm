package baekjoon;

import java.util.Scanner;
public class _2588_곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		int sum=0, n;
		for (int i = 0; i < 3; i++) {
			n=n1*(n2%10);
			System.out.println(n);
			sum+=n*Math.pow(10,i);
			n2/=10;
		}
		System.out.println(sum);
		sc.close();
	}
}