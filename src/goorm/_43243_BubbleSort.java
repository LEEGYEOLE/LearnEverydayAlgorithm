package goorm;

import java.util.Scanner;
/**
 * goorm_43243_BubbleSort
 * @date 2019. 10. 23.
 */
public class _43243_BubbleSort {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<=arr[j-1]) {
					 swap(arr, j-1, j);
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
	
	/** 두 수의 자리를 바꿔주는 함수 */
	private static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
	}
}
