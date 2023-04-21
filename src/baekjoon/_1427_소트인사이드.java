package baekjoon;

import java.util.Scanner;
public class _1427_소트인사이드 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int x;
		int n[]=new int[10];
		for(int i=0; i<s.length(); i++) {
			x=Integer.parseInt(String.valueOf(s.charAt(i)));
			n[x]++; 
		}
		for(int i=9; i>=0; i--) {
			for(int j=1; j<=n[i]; j++)
				System.out.print(i);
		}
	}
}
