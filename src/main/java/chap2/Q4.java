package chap2;

import java.util.*;

public class Q4 {

	
	static void copy(int[] a, int[] b) {
		int num= a.length <= b.length ? a.length : b.length;
		for(int i=0; i<num; i++ ) {
			a[i]=b[i];
		}
		System.out.println(Arrays.toString(a)+" <= a");
		System.out.println(Arrays.toString(b)+" <= b");
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("a요솟수를 입력해주세요: ");
		int numA=sc.nextInt();
		
		int[] a= new int[numA];
		for(int i=0; i<numA; i++) {
			System.out.print("a[" + i + "] : ");
			a[i]=sc.nextInt();
		}
		System.out.print("b요솟수를 입력해주세요: ");
		int numB= sc.nextInt();
		
		int[] b= new int[numB];
		for(int i=0; i<numB; i++) {
			System.out.print("b[" + i + "] : ");
			b[i]=sc.nextInt();
		}
		copy(a, b);
	}
}
