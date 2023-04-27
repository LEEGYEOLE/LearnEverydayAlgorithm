package baekjoon;

import java.util.Scanner;
public class _1924_2007 {
public static void div(int x){
    int c=x%7;
    String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	System.out.println(day[c]);    
    
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
            int x= sc.nextInt();
            int y= sc.nextInt();
            
            switch (x){
            case 1 :
                div(y);
                break;
            case 2 :
        div(y+3);
            break;
    case 3 :
        div(y+3);
            break;
    case 4 :
        div(y+6);
            break;
    case 5 :
        div(y+1);
            break;
    case 6 :
        div(y+4);
            break;            
    case 7 :
        div(y+6);
            break;
    case 8 :
        div(y+2);
            break;    
    case 9 :
        div(y+5);
            break;    
    case 10 :
        div(y);
            break;    
    case 11 :
        div(y+3);
            break;    
    case 12 :
        div(y+5);
            break;    
    }
}
}