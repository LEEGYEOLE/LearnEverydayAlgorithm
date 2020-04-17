import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/**
 * 여기다 풀기
 * 
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());

			bw.write("\n");
			bw.flush();
			bw.close();
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
