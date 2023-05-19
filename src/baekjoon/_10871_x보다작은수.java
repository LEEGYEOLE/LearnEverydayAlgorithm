package baekjoon;

import java.util.Scanner;

public class _10871_x보다작은수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), x=sc.nextInt(),i,cnt=0, input;
		int result[]=new int[n];
		for (i = 0; i < result.length; i++) {
			input=sc.nextInt();
			if(input<x) result[cnt++]=input;
		}
		for (int j=0; j<cnt; j++) {
			System.out.print(result[j]+" ");
		}
	}
}
