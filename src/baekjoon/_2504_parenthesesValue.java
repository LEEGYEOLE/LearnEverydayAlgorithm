package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * baekjoon_2504_parenthesesValue
 * @date 2020. 02. 06
 */
public class _2504_parenthesesValue {
	
	public static int check(String s[]) {
		Stack<String> stack = new Stack<>();
		int result = 0;
		for(int i=0; i<s.length; i++) {
			if(result == -1) {
				return 0;
			}
			if (s[i].equals("(")||s[i].equals("[")) {
				stack.push(s[i]);
			}else {
				if(stack.empty()) {
					return 0;
				}else if (s[i].equals(")")) {
					if(stack.peek().equals("(")){
						stack.pop();
						stack.push("2");
					}else {
						result = cal(stack, "(", "[", 2);
					}
				}else if (s[i].equals("]")) {
					if(stack.peek().equals("[")){
						stack.pop();
						stack.push("3");
					}else {
						result = cal(stack, "[", "(", 3);
					}
				}else {
					return 0;
				}
			}
		}
		
		int sum = 0;
		while (!stack.isEmpty()) {
			if (stack.peek().equals("(") || stack.peek().equals(")") || stack.peek().equals("[")
					|| stack.peek().equals("]")) {
				return 0;
			}
			sum += Integer.parseInt(stack.pop());
		}
		return sum;		
	}
	
	// 괄호 사이의 x값을 구하는 함수
	// 괄호 사이의 정수를 더해준다.
	private static int cal(Stack<String> stack, String s1, String s2, int n) {
		int result =0;
		while (! stack.isEmpty()) {
			String top = stack.peek();
			if(top.equals(s2)) {
				return -1;
			} else if(top.equals(s1)) {
				stack.pop();
				result*=n;
				stack.push(String.valueOf(result));
				return result;
			}else {
				result += Integer.parseInt(stack.pop());
			}
		} 
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println(check(sc.nextLine().split("")));
		} finally {
			sc.close();
		}
	}
}	
