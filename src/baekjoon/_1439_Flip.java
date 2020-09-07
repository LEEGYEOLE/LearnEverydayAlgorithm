package baekjoon;

import java.util.Scanner;
/**
 * 
 * @date 2020. 9. 7.
 * @filename _1439_Flip.java
 * 뒤집기 https://www.acmicpc.net/problem/1439
 * 연속된 0,1들의(1개 ~ n개)의 개수를 구해서 더 적은 쪽을 뒤집어주면 됨.
 * 즉, 1->0 이 되는 순간, 0->1이 되는 순간을 각각 더해서 둘 중 최소값
 */
public class _1439_Flip {
	public static void main(String[] args) {
		int one=0, zero=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.charAt(0)=='0')	zero++;
		else	one++;
		
		for (int i = 1; i < s.length(); ++i) {
			if(s.charAt(i)== '0' && s.charAt(i-1) == '1')
				zero++;
			else if(s.charAt(i) == '1' && s.charAt(i-1) == '0')
				one++;
		}
		System.out.println(Math.min(one, zero));
	}
}
