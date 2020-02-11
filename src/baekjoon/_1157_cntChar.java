package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * baekjoon_1157_cntChar
 * @date 2020. 02. 13
 */
//A 65 a 97 32
public class _1157_cntChar {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String st = bf.readLine();
			int[] arr = new int[32];
			for (int i = 0; i < st.length(); i++) {
				if(st.charAt(i)>='A'&&st.charAt(i)<='Z')
					arr[st.charAt(i)-65]++;
				else
					arr[st.charAt(i)-97]++;
			}
			int max=0;
			for (int i = 0; i < 32; i++) {
				if(max<arr[i])
					max = arr[i];
			}
			int index=-1;
			for (int i = 0; i < 32; i++) {
				if(max==arr[i])
					if(index!=-1) {
						bw.write("?");
						bw.flush();
						return;
					}
					else
						index=i;
			}
			String s = String.valueOf((char) (index+65));
			bw.write(s+"\n");	
			bw.flush();
			bw.close();
		} catch (IOException e) {
		}
	}
}	
