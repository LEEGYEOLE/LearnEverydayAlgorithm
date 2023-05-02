package baekjoon;

//2839번: 설탕 배달 알고리즘 (3<=n<=5000)
import java.util.Scanner;
public class _2839_설탕배달 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a;	//5kg 설탕개수
		int b=0;	//3kg 설탕개수
		int t;	//5kg 설탕개수를 뺀 남은 kg
		for(a=n/5; a>=0; a--) {
			t=n-5*a;
			if(t%3!=0)continue;
			else {
				b=t/3;
				break;
			}
		}
		if(a<0) System.out.println(-1);
		else System.out.println(a+b);
	}

}
