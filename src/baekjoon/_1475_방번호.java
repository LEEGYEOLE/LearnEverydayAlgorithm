package baekjoon;

import java.util.Scanner;

public class _1475_방번호 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String xstring = sc.next();
		int xint = Integer.parseInt(xstring);
		
		int num[] = new int[1000001];
		int nn[]= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int set=0;

		for (int i = xstring.length(); i >= 1; i--) {
			num[i] = xint % 10;
			xint /= 10;
		}
		for (int i = 1; i <= xstring.length(); i++) {
				
				if(num[i]==9){
					if(nn[6]!=0) nn[6]--;
					else {
						set++;
						for(int p=0; p<9; p++) {
							if(p==6) nn[6]++;
							nn[p]++;
						}
						nn[6]--;
					}
				}
				else {
					if(nn[num[i]]!=0) nn[num[i]]--;
					else {
						set++;
						for(int p=0; p<9; p++) {
							if(p==6) nn[p]++;
							nn[p]++;
						}
						nn[num[i]]--;
					}
				}
			
		}	
			System.out.print(set);
	}

}
