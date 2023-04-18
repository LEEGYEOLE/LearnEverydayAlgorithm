package goorm.cos_pro_java;

public class _839396_HammingDistance {

	static class Main {
	    public String func_a(String str, int len){
	        String padZero = "";
	        int padSize =2;
	        for(int i = 0; i < padSize; i++)
	            padZero += "0";
	        return padZero + str;
	    }
	    
	    public int solution(String binaryA, String binaryB) {
	        int maxLength = Math.max(binaryA.length(), binaryB.length());
	        if(maxLength > binaryA.length())
	            binaryA = func_a(binaryA, maxLength);
	        if(maxLength > binaryB.length())
	            binaryB = func_a(binaryB, maxLength);
	        
	        int hammingDistance = 0;
	        for(int i = 0; i < maxLength; i++)
	            if(binaryA.charAt(i)!=binaryB.charAt(i))
	                hammingDistance += 1;
	        return hammingDistance;
	    }
	    
	    public static void main(String[] args) {
	        Main sol = new Main();
	        String binaryA = "10010";
	        String binaryB = "110";
	        int ret = sol.solution(binaryA, binaryB);
	        
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
	}
}
