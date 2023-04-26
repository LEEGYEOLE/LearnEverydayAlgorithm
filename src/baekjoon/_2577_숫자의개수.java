package baekjoon;

import java.util.Scanner;
public class _2577_숫자의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), n3=sc.nextInt();
		int arr[]=new int[10];
		int result = n1*n2*n3;
		while(result>0) {
			arr[result%10]++;
			result/=10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}