package goorm.cos_pro_java;

public class _839400_체스나이트 {
	static class Main {
	    public int solution(String pos) {
	    	
				String[] str = pos.split("");
				int x = 0;
				int y = Integer.parseInt(str[1]) -1;
				switch(str[0]){
						case "A" : x = 0; break;
						case "B" : x = 1; break;
						case "C" : x = 2; break;
						case "D" : x = 3; break;
						case "E" : x = 4; break;
						case "F" : x = 5; break;
						case "G" : x = 6; break;
						case "H" : x = 7; break;
					default: break;
				}
	      int answer = 0;
				if(x-2 >= 0 && y-1 >=0) answer++;
				if(x-2 >= 0 && y+1 < 8) answer++;
				if(x+2 < 8 && y-1 >=0) answer++;	
				if(x+2 < 8 && y+1 < 8) answer++;
		
				if(x-1 >= 0 && y-2 >=0) answer++;
				if(x+1 < 8 && y-2 >=0) answer++;	
				if(x-1 >= 0 && y+2 < 8) answer++;
				if(x+1 < 8 && y+2 < 8) answer++;
				
	        return answer;
	    }
	    public static void main(String[] args) {
	        Main sol = new Main();
	        String pos = "A7";
	        int ret = sol.solution(pos);
	    	
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
	}
}
