package goorm;

import java.util.Scanner;
/**
 * goorm_43265_SelectionSort
 * @date 2019. 10. 22.
 */
public class _43265_SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int index=sc.nextInt();
		int[] arr = new int[n];
		int min = 0, tmp=0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < index; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<=arr[min]) {
					min=j;
				}
			}
			tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
