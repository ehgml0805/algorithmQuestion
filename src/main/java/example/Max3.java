package example;

import java.util.*;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=1;
		int b=3;
		int c=2;
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값: "+a);
		System.out.println("b의 값: "+b);
		System.out.println("c의 값: "+c);
		
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		System.out.println("최댓값은"+max+"입니다. ");
	}

}
