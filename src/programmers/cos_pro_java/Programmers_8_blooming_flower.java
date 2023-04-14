package programmers.cos_pro_java;

//다음과 같이 import를 사용할 수 있습니다.
//https://school.programmers.co.kr/learn/courses/11132/lessons/71155
import java.util.*;

class Solution1 {
	class Point {

		int a, b;

		public Point(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	public int solution(int[][] garden) {
		// 여기에 코드를 작성해주세요.
		// date = 0
		// 1stack ㄲㅗㅊㅇㅣ ㅍㅣㄴ ㅈㅗㅏㅍㅛ ㄷㅏㅁㄱㅣ
		// ㅇㅏㅈㅣㄱ ㅍㅣㅈㅣㅇㅏㄴㅎㅇㅡㄴ ㄲㅗㅊ ㄱㅐㅅㅜ ㅈㅓㅈㅏㅇ
		// date ++
		// ifㅁㅜㄴ 4ㄱㅐㄹㅗ ㅇㅜㅣ,ㅇㅏㄹㅐ,ㅇㅑㅇㅇㅕㅍㅇㅣ ㅂㅓㅁㅇㅜㅣ ㄴㅐㅁㅕㄴ 0ㅇㅣㄴㅈㅣ ㅊㅔㅋㅡㅎㅏㄱㅗ 0ㅇㅣㅁㅕㄴ 1ㄹㅗ ㅇㅗㄹㄹㅣㄱㅗ
		// ㅈㅗㅏㅍㅛㄷㅏㅁㄱㅣ, ㅍㅣㅈㅣㅇㅏㄴㅎㅇㅡㄴ ㄲㅗㅊ -1ㅆㅣㄱ ㅍㅣㅈㅣㅇㅏㄴㅎㅇㅡㄴ ㄲㅗㅊㅇㅣ 0 ㅇㅣㄷㅗㅣㅁㅕㄴ return date

		int days = 0;
		int seeds = garden.length * garden.length;
		Queue<Point> flower = new LinkedList<Point>();
		Queue<Point> next = new LinkedList<Point>();

		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden.length; j++) {
				if (garden[i][j] == 1) {
					next.add(new Point(i, j));
					seeds--;
					if (seeds == 0)
						return days;
				}
			}
		}
		do {
			flower = next;
			next = new LinkedList<Point>();
			days++;

			while (flower.size() > 0) {
				Point p = flower.poll();

				if (p.a - 1 >= 0 && garden[p.a - 1][p.b] != 1) {
					next.add(new Point(p.a - 1, p.b));
					garden[p.a - 1][p.b] = 1;
					seeds--;
				}
				if (p.b - 1 >= 0 && garden[p.a][p.b - 1] != 1) {
					next.add(new Point(p.a, p.b - 1));
					garden[p.a][p.b - 1] = 1;
					seeds--;
				}
				if (p.a + 1 < garden.length && garden[p.a + 1][p.b] != 1) {
					next.add(new Point(p.a + 1, p.b));
					garden[p.a + 1][p.b] = 1;
					seeds--;
				}
				if (p.b + 1 < garden.length && garden[p.a][p.b + 1] != 1) {
					next.add(new Point(p.a, p.b + 1));
					garden[p.a][p.b + 1] = 1;
					seeds--;
				}
				if (seeds <= 0)
					return days;

			}

		} while (seeds > 0);

		// System.out.println(i+","+j);
		// System.out.println(seeds);

		return days;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[][] garden1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int ret1 = sol.solution(garden1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[][] garden2 = { { 1, 1 }, { 1, 1 } };
		int ret2 = sol.solution(garden2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}
}