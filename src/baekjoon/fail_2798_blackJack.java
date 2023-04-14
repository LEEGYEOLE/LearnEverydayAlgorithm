package baekjoon;

import java.util.Arrays;
import java.util.Collections;

/**
 * test code
 *  N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)
 *  100000
 **/
/**1:45
 *5 21
 *5 6 7 8 9
 *21
 *1.내림차순 정렬
 *2.if(arr[i]<M)
 */

public class fail_2798_blackJack {
//	public static int func_cal(int[] arr, int i, int sum, int cnt, int m) {
////		if(arr.length==index)
//		if(cnt > 3 || arr.length == i || arr[i]+sum > m ) return -1;
//		if(cnt < 3 && arr[i]+sum == m) return -1;
//		if(cnt == 3 && arr[i]+sum == m) return m;
//		
//		return func_cal(arr, i+1, arr[i]+sum, cnt+1, m);
//	}
//	
//	public static int solution(int[] arr, int m) {
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int n = func_cal(arr, i, 0, 1, m);
//			max = max<n?n:max;
////			System.out.println("i="+i+","+n);
//		}
//		return max;
//	}
	
	public static int func_cal1(Integer[] arr, int i, int sum, int cnt, int m) {
		// 탈출조건
		if(arr.length==i)
			if(cnt <= 3) return -1;
			else if(sum <= m) return sum;
			else return -1;
		
		//아직 arr끝이 아닐 때 
		int arrNum = (int)arr[i];

		System.out.println("***"+i+","+arrNum+","+(arrNum+sum)+","+cnt);
		
		if((sum+arrNum)<=m) return func_cal1(arr, i+1, arrNum+sum, cnt+1, m);
		else return func_cal1(arr, i+1, sum, cnt, m);
		
	}
	
	public static int solution1(Integer[] arr, int m) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i="+i);
			int n = func_cal1(arr, i, 0, 1, m);
			System.out.println("n="+n);
			max = max<n?n:max;
		}
		return max;
	}
	
	public static void main(String[] args) {
//		int[] arr= {5, 6, 7, 8, 9};
//		int m = 21;
//		int[] arr= {93,181,245, 214, 315, 36, 185, 138, 216, 295};
		Integer[] arr= {93,181,245, 214, 315, 36, 185, 138, 216, 295};
		int m = 500;
//		int max = 0;
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		System.out.println(solution1(arr, m));
	}
}
