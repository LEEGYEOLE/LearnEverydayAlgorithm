package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * 입출력 버퍼
 * @date 2020. 04. 17
 */
public class InOut {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			String a = st.nextToken();
			String b = st.nextToken();

			String array[] = s.split(" ");

			String ss = "abcdefg";
			bw.write(ss + "\n");
			bw.write(Arrays.toString(array) + "\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
