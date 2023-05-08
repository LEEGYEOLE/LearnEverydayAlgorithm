package baekjoon;

import java.util.Scanner;

public class _9506_약수들의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n[] = new int[100000];	//입력받는 수를 저장할 배열
		int xi = 0, xc, sum = 0;
		int div[]=new int[1000000];	//입력받은 수의 약수를 저장할 배열
		
		while(true) {
			n[xi] = sc.nextInt();
			if(n[xi]==-1)
				break;
			xi++;
			
		}
		for(int i=0; i<xi; i++) {
			xc=0;
			sum=0;
			for(int j=1; j<=n[i]/2; j++) {
				if(n[i]%j==0) {
					div[xc]=j;
					xc++;
					sum+=j;
					
				}
			}
			if(sum==n[i]) {
				System.out.print(n[i] + " = ");
				for(int p=0; p<xc; p++) {
					System.out.print(div[p]);
					if(p!=xc-1)
						System.out.print(" + ");
				}
				System.out.println();
			}
			else {
				System.out.print(n[i] + " is NOT perfect.");
				System.out.println();
			}	
		}
		
	}
}
