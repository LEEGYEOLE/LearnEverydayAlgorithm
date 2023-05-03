package baekjoon;

import java.util.Scanner;
public class _3052_나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt=0;
		int[] arr = new int[1000];

		for (int i = 0; i < 10; i++) {
			n = sc.nextInt();
			arr[n%42]++;
			if(arr[n%42]==1) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
