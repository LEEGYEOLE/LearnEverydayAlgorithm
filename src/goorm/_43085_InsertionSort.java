package goorm;

import java.util.Scanner;
/**
 * goorm_43085_InsertionSort
 * @date 2019. 10. 24.
 */
public class _43085_InsertionSort {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int index = sc.nextInt();

		for (int i = 1; i <= index; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	private static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
