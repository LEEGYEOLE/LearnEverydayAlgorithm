package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * baekjoon_9012_bracket
 * @date 2020. 02. 06
 * ArrayList
 */
public class _9012_bracket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> stack = new ArrayList<>();
		String result;
		try {
			int n = sc.nextInt();
			String input = sc.nextLine();
			do {
				result = "YES";
				input = sc.nextLine();
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i)=='(') {
						stack.add("(");
					} else {
						if(stack.isEmpty() || stack.get(stack.size()-1).equals(")")) {
							result = "NO";
							break;
						}else {
							stack.remove(stack.size()-1);
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
