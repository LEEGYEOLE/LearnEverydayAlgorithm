package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * baekjoon_10828_stack
 * @date 2020. 02. 05
 */
public class _10828_stack {
	private static ArrayList<Integer> stack = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			String input = sc.nextLine();
			do {
				input = sc.nextLine();
				
				if(input.indexOf("push")!=-1) {
					push(Integer.parseInt(input.substring(5)));
				}else if(input.indexOf("pop")!=-1) {
					System.out.println(pop());
				}else if(input.indexOf("size")!=-1) {
					System.out.println(size());
				}else if(input.indexOf("empty")!=-1) {
					System.out.println(empty());
				}else {
					System.out.println(top());
				}
			}while(--n > 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void push(int x) {
		stack.add(x);
	}
	public static int pop() {
		if (stack.isEmpty()) {
			return -1;
		}
		int n = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return n;
	}
	public static int size() {
		return stack.size();
	}
	public static int empty() {
		return stack.isEmpty()?1:0;
	}
	public static int top() {
		return stack.isEmpty()?-1:stack.get(stack.size()-1);
	}	
	
}	
