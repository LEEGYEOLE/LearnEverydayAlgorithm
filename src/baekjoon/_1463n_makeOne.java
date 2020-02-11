package baekjoon;

import java.util.Scanner;

/**
 * baekjoon_1463_makeOne
 * @date 2020. 02. 10
 */
public class _1463n_makeOne {
	
	public static int check(int x) {
		int count = 0;
		
		while(true) {
			while(x%3==0 && x>3) {
				count++;
				x/=3;
			}
			
			while(x%2==0 && x>2) {
				count++;
				x/=2;
			}
			
			if(x==1) return count;
			
			x--;
			count++;
		}
	}
	
	public static int reverseCheck(int x) {
		int count = 0;
		
		while(true) {
			if(x==1) return count;
			x--;
			count++;
			if(x==1) return count;
			
			while(x%3==0 && x>3) {
				count++;
				x/=3;
			}
			
			while(x%2==0 && x>2) {
				count++;
				x/=2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int n = sc.nextInt();
			int a = check(n);
			int b = reverseCheck(n);
			System.out.println(a);
			System.out.println(b);
			System.out.println(a<=b?a:b);
		
		} finally {
			sc.close();
		}
	}
}	
