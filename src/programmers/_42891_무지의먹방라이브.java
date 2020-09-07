package programmers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2020. 9. 7.
 * @filename _42891_�����ǸԹ���̺�.java
 * ������ �Թ� ���̺�
 * https://www.welcomekakao.com/learn/courses/30/lessons/42891
 * K�� �����ϴ� ������ ������ ���ϴ°� ����
 * ���� �� �ʿ� �ð��� ������������ ���� 
 * -> ������ �Դµ� �ҿ�Ǵ� �ð��� �ѹ��� ����� ����
 * 
 */
public class _42891_�����ǸԹ���̺� {
	public static void main(String[] args) {
		
	}
}
class Solution2 {
	//���� �Դ� �ð�, ���� ����
	class Food {
		int time;
		int idx;
		Food(int t, int i){
			time = t;
			idx = i;
		}
	};
	
	//�Դ� �ð������� ����
	Comparator<Food> CompTime = new Comparator<Food>() {
		public int compare(Food a, Food b) {
			return a.time-b.time;
		}
	};
	
	//�Դ� ���������� ����
	Comparator<Food> CompIdx = new Comparator<Food>() {
		public int compare(Food a, Food b) {
			return a.idx-b.idx;
		}
	};
	
    public int solution(int[] food_times, long k) {
        List<Food> foods = new LinkedList<>();
        //���� �� ����
        int n = food_times.length;
        //�ð� �� ���� ����, �Դ� ���� 1���ͷ� ǥ�� �ϱ� ���� i+1
        for (int i = 0; i < n; i++) {
			foods.add(new Food(food_times[i],i+1));
		}
        //�ð� ������ ����
        foods.sort(CompTime);
        
        //deep ���ϱ� ���� ���� �ð� �ʱ�ȭ
        int pretime=0;
        //�� ��° ó�� ���� �˱� ���� �ε��� i���
        int i=0;
        
        for (Food f : foods) {
        	long diff = f.time-pretime;
        	//���� ���̿� ���� �� ��� == 0 => pass
        	if(diff != 0) {
        		//�� �� �ִ� �ð� == diff�� �����ִ� ���� ��
        		long spend = diff * n;
        		//�� �� �ִ� �ð��� k���϶��
        		if(spend <= k) {
        			k -= spend;
        			//���� �ð����� ���� �� 
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