package baekjoon;

import java.util.Scanner;

public class _1759_암호만들기 {
	static int l, c;	//출력해야할 알파벳 개수, 입력받을 알파벳 개수
	static char[] pw;	//알파벳을 한자씩 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		l=sc.nextInt();
		c=sc.nextInt();	
		pw= new char[c+1];
		char temp;
		
		//입력받은 알파벳 배열에 저장
		for(int i=1; i<=c; i++)		
			pw[i]=sc.next().charAt(0);
		
		//배열을 오름차순으로 정렬
		for(int i=1; i<=c; i++) {
			for(int j=i+1; j<=c; j++)
				if(pw[i]>pw[j]) {
					temp=pw[i];
					pw[i]=pw[j];
					pw[j]=temp;
				}
			
		}
		set(1, 1, "");
		
	}//메인끝

	public static int set(int k, int h, String st) {
		String s = st;
		if(s.length()>=l) {
			check(s);
			return 1;
		}
		for(int i=h; i<=c-l+k; i++) {
			if(set(k+1, i+1, s + pw[i])==1) {
				continue;
			}
		}
		return 0;
	}//문자입력함수끝
	
	//모음 자음 조건 검사함수
	public static void check(String s) {
		int vowel=0, consonant=0; 
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||
					s.charAt(i) == 'o'|| s.charAt(i) == 'u') vowel++;
			else consonant++;
		}
		
		//자음2개이상 모음 1개이상시 출력
		if(vowel>=1 && consonant>=2){
			System.out.println(s);
		}
	}//자음모음검사함수 끝
}
