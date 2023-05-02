package baekjoon;

import java.util.Scanner;
public class _2920_음계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[]= new int[8];
		int count, i;
		
		for(i=0; i<a.length; i++)
			a[i]= sc.nextInt();
		
		if(a[0]==1) {
			count=1;
			for(i=1; i<a.length;i++) {
				if(a[i-1]<a[i])
					count++;
				else {
					count=2;
					break;
				}
			}
		}
		else if(a[7]==1) {
			count=8;
			for(i=1; i<a.length;i++) {
				if(a[i-1]>a[i])
					count--;
				else {
					count=2;
					break;
				}
			}
		}
		else count=2;
		
		switch(count) {
		case 8:
			System.out.println("ascending");
			break;
		case 1:
			System.out.println("descending");
			break;
		default:
			System.out.println("mixed");
			break;
		}
		System.out.println();
	}			

}
