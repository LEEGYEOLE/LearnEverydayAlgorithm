package baekjoon;

import java.util.Scanner;
public class _1110_더하기사이클 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a, b, sum=0, count=0;
		if(n<10) a=0;
		else a=n/10;
		b=n%10;
		while(true) {
			sum=a+b;
			count++;
			if((b*10+sum%10)==n)
				break;
			a=b;
			b=sum%10;
		}
		System.out.println(count);
	}

}
