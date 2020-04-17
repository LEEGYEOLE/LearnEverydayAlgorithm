package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/**
 * baekjoon_2163_chocolateDivide
 * @date 2020. 04. 17
 */
public class _2163_chocolateDivide {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//dp로 풀어보기.. dp연습을 해야지ㅜ
			bw.write((a*b-1) + "\n");
			bw.flush();
			bw.close();
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
