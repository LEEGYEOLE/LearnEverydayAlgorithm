package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/**
 * baekjoon_2750_sort1
 * @date 2020. 04. 17
 */
public class _2750_sort1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);
			for (int i = 0; i < n; i++) {
				bw.write(arr[i] + "\n");
			}
			bw.flush();

			br.close();
			bw.close();
		} catch (Exception e) {
		} finally {

		}

	}
}
