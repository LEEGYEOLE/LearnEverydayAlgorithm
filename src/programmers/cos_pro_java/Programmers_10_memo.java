package programmers.cos_pro_java;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class Programmers_10_memo {
	// 다음과 같이 import를 사용할 수 있습니다.
	/*
	line =0 
	if ㄷㅏㄴㅇㅓㄱㅏ (line =0 ㅇㅣㅁㅕㄴ line+ㄷㅏㄴㅇㅓ )else line+1+ㄷㅏㄴㅇㅓ K ㅂㅗㄷㅏ ㅈㅏㄱㄱㅓㄴㅏ ㄱㅏㅌㅇㅡㅁㅕㄴ line = ((line =0 ㅇㅣㅁㅕㄴ line+ㄷㅏㄴㅇㅓ )else line+1+ㄷㅏㄴㅇㅓ);
	else 
	answer++;
	line =0;
	*/
	    public int solution(int K, String[] words) {
	        // 여기에 코드를 작성해주세요.
	        int answer = 1;
	        int line =0;       
	        for(int i=0; i<words.length; ){
	            int len = words[i].length();
	            if( (line == 0?line+len:line+1+len) <= K ){
	              line = (line == 0?line+len:line+1+len);
	                i++;
	            } else {
	                answer++;
	                line = 0;
	            }
	        }
	        
	        return answer;
	    }

	    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	    public static void main(String[] args) {
	    	Programmers_10_memo sol = new Programmers_10_memo();
	        int K = 10;
	        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
	        int ret = sol.solution(K, words);

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
	    }
	}