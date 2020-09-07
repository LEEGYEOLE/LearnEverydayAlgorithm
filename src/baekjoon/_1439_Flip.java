package baekjoon;

import java.util.Scanner;
/**
 * 
 * @date 2020. 9. 7.
 * @filename _1439_Flip.java
 * ������ https://www.acmicpc.net/problem/1439
 * ���ӵ� 0,1����(1�� ~ n��)�� ������ ���ؼ� �� ���� ���� �������ָ� ��.
 * ��, 1->0 �� �Ǵ� ����, 0->1�� �Ǵ� ������ ���� ���ؼ� �� �� �ּҰ�
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
