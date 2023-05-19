package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class _10952_a더하기b빼기5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		ArrayList<String> list = new ArrayList<String>();
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			list.add(String.valueOf(a + b));
		} while (!(a == 0 && b == 0));
		list.remove(list.size() - 1);
		for (String i : list)
			System.out.println(i);
		sc.close();
	}
}
