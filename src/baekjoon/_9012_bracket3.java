package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * baekjoon_9012_bracket2
 * @date 2020. 02. 06
 * Stack
 */
public class _9012_bracket3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String result;
		try {
			int n = sc.nextInt();
			String input = sc.nextLine();
			do {
				result = "YES";
				input = sc.nextLine();
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i)=='(') {
						stack.push('(');
					} else {
						if(stack.isEmpty() || stack.peek().equals(')')) {
							result = "NO";
							break;
						}else {
							stack.pop();
						}
					}
				}
				if (!stack.isEmpty()) {
					result = "NO";
				}
				System.out.println(result);
				stack.clear();
			}while(--n > 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}	
