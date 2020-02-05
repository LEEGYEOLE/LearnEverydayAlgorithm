package goorm;

import java.util.Arrays;
import java.util.Scanner;
/**
 * goorm_43122_MergeSort
 * @date 2019. 10. 28.
 */
public class _43122_MergeSort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 받으려는 숫자의 개수
		int arr[] = new int[n]; // 정렬하려는 숫자의 집합인 배열
		for (int i = 0; i < arr.length; i++) { // 배열에 숫자를 저장
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0, arr.length - 1); // 병합 정렬을 시작 0~n-1 = n개

		// 원하는 인덱스까지 정리된 배열 출력
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	// 배열의 전체를 가지고 자기 자신을 호출하며 중간을 기점으로 2분할하면서
	// 각 배열의 크기가 1이 될 때까지
	public static void mergeSort(int arr[], int l, int r) {
		if (l < r) { // 배열의 시작이 끝보다 작은 동안에 분할과 합병을 반복
			int mid = (l + r) / 2;
			mergeSort(arr, l, mid); // 오른쪽을 계속해서 쪼갠 뒤에, 오른쪽 분할이 끝나면
			mergeSort(arr, mid + 1, r); // 왼쪽을 쪼갠다.
			merge(arr, l, mid, r); // 쪼개기가 끝나면 크기가 1*2^n (n=0부터)인 배열들끼리
									// 정렬을 수행
		}
	}

	// 앞쪽 배열과 뒤쪽 배열을 구분하기 위해 start mid end 범위와 정렬하려는 배열을 보내준다.
	public static void merge(int arr[], int l, int mid, int r) {
		int i = l;
		int j = mid + 1;
		int k = l;
		int temp[] = new int[arr.length];
		while (i <= mid && j <= r) { // 두 배열의 각 크기가 넘지 않는 동안에
			if (arr[i] < arr[j]) { // 정렬을 수행
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while (i <= mid) // 각 배열(앞, 뒤)에 남아있는 갚을 정렬된 배열에 넣어준다.
			temp[k++] = arr[i++];
		while (j <= r)
			temp[k++] = arr[j++];

		// 정렬된 임시 배열을 담아준다
		for (int index = l; index < k; index++)
			arr[index] = temp[index];
		System.out.println(Arrays.toString(arr));
	}

}
