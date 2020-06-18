package programmers;

public class JadenCase {
	public static void main(String[] args) {
		System.out.println(Solution.solution("3people unFollowed me     "));
		System.out.println(Solution.solution("for the last  week"));
	}
}

/**
 * 
 */
class Solution {
	public static String solution(String s) {
		String answer ="";
		StringBuilder sb = new StringBuilder();

		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (word.equals("")) {
				sb.append(" ");
				continue;
			}
			String first = String.valueOf(word.charAt(0)).toUpperCase();
			sb.append(first.concat(word.substring(1).toLowerCase()+" "));
		}
		answer = sb.toString();
		 if(s.charAt(s.length()-1) != ' ')
			 answer = answer.trim();
		return answer;
	}
}
