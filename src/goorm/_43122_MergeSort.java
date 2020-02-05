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
		int n = sc.nextInt(); // �������� ������ ����
		int arr[] = new int[n]; // �����Ϸ��� ������ ������ �迭
		for (int i = 0; i < arr.length; i++) { // �迭�� ���ڸ� ����
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0, arr.length - 1); // ���� ������ ���� 0~n-1 = n��

		// ���ϴ� �ε������� ������ �迭 ���
		for (int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	// �迭�� ��ü�� ������ �ڱ� �ڽ��� ȣ���ϸ� �߰��� �������� 2�����ϸ鼭
	// �� �迭�� ũ�Ⱑ 1�� �� ������
	public static void mergeSort(int arr[], int l, int r) {
		if (l < r) { // �迭�� ������ ������ ���� ���ȿ� ���Ұ� �պ��� �ݺ�
			int mid = (l + r) / 2;
			mergeSort(arr, l, mid); // �������� ����ؼ� �ɰ� �ڿ�, ������ ������ ������
			mergeSort(arr, mid + 1, r); // ������ �ɰ���.
			merge(arr, l, mid, r); // �ɰ��Ⱑ ������ ũ�Ⱑ 1*2^n (n=0����)�� �迭�鳢��
									// ������ ����
		}
	}

	// ���� �迭�� ���� �迭�� �����ϱ� ���� start mid end ������ �����Ϸ��� �迭�� �����ش�.
	public static void merge(int arr[], int l, int mid, int r) {
		int i = l;
		int j = mid + 1;
		int k = l;
		int temp[] = new int[arr.length];
		while (i <= mid && j <= r) { // �� �迭�� �� ũ�Ⱑ ���� �ʴ� ���ȿ�
			if (arr[i] < arr[j]) { // ������ ����
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while (i <= mid) // �� �迭(��, ��)�� �����ִ� ���� ���ĵ� �迭�� �־��ش�.
			temp[k++] = arr[i++];
		while (j <= r)
			temp[k++] = arr[j++];

		// ���ĵ� �ӽ� �迭�� ����ش�
		for (int index = l; index < k; index++)
			arr[index] = temp[index];
		System.out.println(Arrays.toString(arr));
	}

}
