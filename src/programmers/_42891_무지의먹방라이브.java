package programmers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2020. 9. 7.
 * @filename _42891_무지의먹방라이브.java
 * 무지의 먹방 라이브
 * https://www.welcomekakao.com/learn/courses/30/lessons/42891
 * K에 도달하는 시점을 빠르게 구하는게 관건
 * 음식 별 필요 시간을 오름차순으로 정렬 
 * -> 음식을 먹는데 소요되는 시간을 한번에 지우기 위해
 * 
 */
public class _42891_무지의먹방라이브 {
	public static void main(String[] args) {
		
	}
}
class Solution2 {
	//음식 먹는 시간, 순서 저장
	class Food {
		int time;
		int idx;
		Food(int t, int i){
			time = t;
			idx = i;
		}
	};
	
	//먹는 시간순으로 정렬
	Comparator<Food> CompTime = new Comparator<Food>() {
		public int compare(Food a, Food b) {
			return a.time-b.time;
		}
	};
	
	//먹는 순서순으로 정렬
	Comparator<Food> CompIdx = new Comparator<Food>() {
		public int compare(Food a, Food b) {
			return a.idx-b.idx;
		}
	};
	
    public int solution(int[] food_times, long k) {
        List<Food> foods = new LinkedList<>();
        //음식 총 개수
        int n = food_times.length;
        //시간 및 순서 저장, 먹는 순서 1부터로 표기 하기 위해 i+1
        for (int i = 0; i < n; i++) {
			foods.add(new Food(food_times[i],i+1));
		}
        //시간 순으로 저장
        foods.sort(CompTime);
        
        //deep 구하기 위해 이전 시간 초기화
        int pretime=0;
        //몇 번째 처리 인지 알기 위해 인덱스 i사용
        int i=0;
        
        for (Food f : foods) {
        	long diff = f.time-pretime;
        	//앞의 깊이와 동일 한 경우 == 0 => pass
        	if(diff != 0) {
        		//쓸 수 있는 시간 == diff에 남아있는 음식 수
        		long spend = diff * n;
        		//쓸 수 있는 시간이 k이하라면
        		if(spend <= k) {
        			k -= spend;
        			//현재 시간으로 업뎃 후 
        			pretime = f.time;
        		} else {
        			k %= n;
        			foods.subList(i, food_times.length).sort(CompIdx);
        			return foods.get(i+(int)k).idx;
        		}
        	}
        	++i;
        	--n;
		}
        return -1;
    }
}