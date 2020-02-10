package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * baekjoon_11720_sumString
 * @date 2020. 02. 13
 */
public class _11720_sumString {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(bf.readLine());
			String st = bf.readLine();
			int sum = 0;
			for (int j = 0; j < st.length(); j++) {
					sum += Integer.parseInt(String.valueOf(st.charAt(j)));
			}
			String s = String.valueOf(sum);
			bw.write(s+"\n");	
			bw.flush();
			bw.close();
		} catch (IOException e) {
		}
	}
}	
