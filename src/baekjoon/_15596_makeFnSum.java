package baekjoon;

/**
 * baekjoon_15596_makeFnSum
 * @date 2020. 02. 13
 */
public class _15596_makeFnSum {
	public long sum(int[] a) {
		long result = 0;
		for (int n : a) {
			result += n;
		}
		return result;
	}
}	
