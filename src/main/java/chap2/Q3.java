package chap2;

import java.util.*;

public class Q3 {
	
	static int sumOf(int[] a) {
		int sum=0;
		
		for(int i=0; i<a.length; i++ ) {
			sum=a[i]+sum;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("요솟수를 입력하세요: ");
		int num=sc.nextInt();
		int[] x=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
		}
		
		System.out.println("배열의 총 합은: "+ sumOf(x));
		
		
	}
	
}
