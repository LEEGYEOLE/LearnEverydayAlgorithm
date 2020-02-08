package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * baekjoon_8958_ox
 * @date 2020. 02. 13
 */
public class _8958_ox {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(bf.readLine());
			for (int i = 0; i < n; i++) {
				String st = bf.readLine();
				int score = 0;
				int sum = 0;
				for (int j = 0; j < st.length(); j++) {
					if(st.charAt(j)=='O') {
						sum += ++score;
					}else {
						score = 0;
					}
				}
				String s = String.valueOf(sum);
				bw.write(s+"\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
		}
	}
}	
