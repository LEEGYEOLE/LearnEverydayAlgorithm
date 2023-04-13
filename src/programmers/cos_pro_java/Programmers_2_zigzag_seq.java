package programmers.cos_pro_java;

import java.util.ArrayList;

public class Programmers_2_zigzag_seq {
    final int INC = 0;
    final int DEC = 1;
    

	/** 1에서 만든 배열로 지그재그 수열 중 가장 긴 길이를 구하는 메소드 */
    int[] func_a(int[] arr) {
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = 1;
        for(int i = 1; i < length; i++) {
            if(arr[i] != arr[i-1])
                ret[i] = ret[i-1] + 1;
            else
                ret[i] = 2;
        }
        return ret;
    }

    /** 배열 초기 값 세팅 메소드 */
    int[] func_b(int[] arr) {
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = -1;
        for(int i = 1; i < length; i++) {
            if(arr[i] > arr[i-1])
                ret[i] = INC;
            else if(arr[i] < arr[i-1])
                ret[i] = DEC;
        }
        return ret;
    }

    /** 지그재그 배열 최대 값이 2인 경우에 대한 케이스 처리 및 최대값 return */
    int func_c(int[] arr) {
        int length = arr.length;
        int ret = 0;
        for(int i = 0; i < length; i++)
            if(ret < arr[i])
                ret = arr[i];
        if(ret == 2)
            return 0;
        return ret;
    }
    
    /** 문제의 기능을 수행 method */
    public int solution(int[] S) {
        int[] check = func_b(S);
        int[] dp = func_a(check);
        int answer = func_c(dp);
        return answer;
    }

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Programmers_2_zigzag_seq sol = new Programmers_2_zigzag_seq();
        int[] S1 = {2, 5, 7, 3, 4, 6, 1, 8, 9};
        int ret1 = sol.solution(S1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] S2 = {4, 3, 2, 1, 10, 6, 9, 7, 8};
        int ret2 = sol.solution(S2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] S3 = {1, 2, 3, 4, 5};
        int ret3 = sol.solution(S3);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");
    }

}
