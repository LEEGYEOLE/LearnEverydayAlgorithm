package baekjoon;

import java.util.Scanner;
public class _5585_거스름돈 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		int n=0;
		int sum=1000-s;
		
		for(;sum>=500;n++)
			sum-=500;
		for(;sum>=100;n++)
			sum-=100;
		for(;sum>=50;n++)
			sum-=50;
		for(;sum>=10;n++)
			sum-=10;
		for(;sum>=5;n++)
			sum-=5;
		for(;sum>=1;n++)
			sum-=1;
		System.out.println(n);
	}
}
