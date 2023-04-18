package goorm.cos_pro_java;

public class _839398_timeMachine {
	static class Main {
	    public long solution(long num) {
	        String strNum = String.valueOf(num+1);
				//System.out.print(strNum);
				strNum=strNum.replaceAll( "0","1");
	        long answer = Long.parseLong(strNum);
	        return answer;
	    }
	    public static void main(String[] args) {
	        Main sol = new Main();
	        long num = 9949999;
	        long ret = sol.solution(num);

	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
	}
}
