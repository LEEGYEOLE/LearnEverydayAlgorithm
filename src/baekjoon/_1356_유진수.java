package baekjoon;

import java.util.Scanner;
public class _1356_유진수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		long lnum = Integer.parseInt(num);
		long front = 1, back = 1;
		int index = 0, i = 0, indexNum = 0;

		if (lnum >= 1 && lnum < 10) {
			System.out.println("NO");
			return;
		}

		for (i = 0; i <= index; i++) {
			front *= Long.parseLong(String.valueOf(num.charAt(i)));
			if (front == 0)
				break;
		}
		for (i = index + 1; i < num.length(); i++) {
			back *= Long.parseLong(String.valueOf(num.charAt(i)));
			if (back == 0)
				break;
		}
		if (front == back) {
			System.out.println("YES");
			return;
		} else {
			index++;
		}

		while (index < num.length() - 1) {
			if (front != 0) {
				indexNum = Integer.parseInt(String.valueOf(num.charAt(index)));
				front *= indexNum;
			}

			if (indexNum == 0) {
				for (i = index + 1; i < num.length(); i++) {
					back = 1;
					back *= Long.parseLong(String.valueOf(num.charAt(i)));
					if (back == 0)
						break;
				}
			} else {
				back /= indexNum;
			}
			if (front == back) {
				System.out.println("YES");
				return;
			} else {
				index++;
			}
		}
		System.out.println("NO");
	}
}
