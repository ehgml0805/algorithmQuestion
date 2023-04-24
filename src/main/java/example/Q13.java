package example;

import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		/*
		이렇게 작성하면 마이너스 값이 입력되니까 그것을 방지해야함 
		System.out.println("a의 값은? :");
		int a=sc.nextInt();
		*/
		int a;
		do {
			System.out.print("a의 길이는? :");
			a=sc.nextInt();
		}while(a<=0);
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		
	}

}
