package baekjoon;

import java.util.Scanner;

/**
 * baekjoon_9012_bracket3
 * @date 2020. 02. 06
 */
public class _9012_bracket2 {
	public static void yes_or_no(String s) {
		int lps=0, rps=0;	//¿ŞÂÊ °ıÈ£, ¿À¸¥ÂÊ °ıÈ£ °¹¼ö
		
		for(int j=0; j<s.length(); j++) {
			if(s.charAt(j)=='(')	
				lps++;
			else	
				rps++;
				
			if(lps<rps) {
				System.out.println("NO");
				return;
			}
		}
		
		if(lps==rps)	System.out.println("YES");
		else	{
			System.out.println("NO");
		}return;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ps[]=new String[n];
		for(int i=0; i<n; i++) {
			ps[i]=sc.next();
		}
		
		for(int i=0; i<n; i++) {
			yes_or_no(ps[i]);
		}
	}
}	
