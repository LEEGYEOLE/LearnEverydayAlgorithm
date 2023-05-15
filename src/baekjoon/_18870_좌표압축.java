package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _18870_좌표압축 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] arr1 = arr.clone();
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i]==arr[j]) {
					if(j==0) System.out.print("0 ");
					else 
						if(i==(arr.length-1))
							System.out.print((j));
						else 
							System.out.print((j) + " ");
					break;
				}
			}
		}
		
	}

}
