package baekjoon;

import java.util.Scanner;

public class _1182_부분수열의합 {
	static int n, s, count;
	static int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		s= sc.nextInt();
		arr= new int[n];
		count=0;
		
		//배열에 원소 대입
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		 
		subset(0, 0);
		System.out.println(count);
	}
	public static void subset(int k, int sum) {
		if(sum==s) {
			if(k!=0) count++;	
		}
		if(k>=n) return;
		
		for(int i=k; i<n; i++) {
			subset(i+1, sum+arr[i]);
		}
		
	}
}