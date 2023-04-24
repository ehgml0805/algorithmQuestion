package example;
import java.util.*;


public class Defference {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("a의 값: ");
		int a=sc.nextInt();
		
		int b;
		while(true) {
			System.out.println("b의 값: ");
			b=sc.nextInt();
			if(b>a) break;
			
			if(b<a) {
				System.out.print("b의 값을 다시 입력하세요!");
			}
		}
		System.out.println("b-a는 "+(b-a)+"입니다.");
	
	}
}
