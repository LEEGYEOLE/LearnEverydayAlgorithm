package baekjoon;

import java.util.Scanner;

public class _1978_소수찾기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		int count, pcount=0;
		for(int i=0; i<n; i++) 
			num[i]=sc.nextInt();		
		
		for(int i=0; i<n; i++) {
			count=0;
			for(int j=2; j<=num[i]; j++) {
				if(num[i]%j==0)
					count++;
			}
			if(count==1)
				pcount++;
		}
		System.out.println(pcount);
	}
}
