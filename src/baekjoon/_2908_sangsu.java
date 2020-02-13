package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * baekjoon_2908_sangsu
 * @date 2020. 02. 13
 */
public class _2908_sangsu {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String str = bf.readLine();
			StringTokenizer token = new StringTokenizer(str);
			String a = token.nextToken();
			String b = token.nextToken();
			String big ="";
			for (int i = 2; i >= 0; i--) {
				if(a.charAt(i)>b.charAt(i)){
					big=reverse(a);
					break;
				}else if(b.charAt(i)>a.charAt(i)){
					big=reverse(b);
					break;
				}
			}
			bw.write(big);	
			bw.flush();
			bw.close();
		} catch (IOException e) {
		}
	}
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i >=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}	
