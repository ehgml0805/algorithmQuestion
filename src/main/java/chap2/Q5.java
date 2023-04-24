package chap2;

import java.util.*;

public class Q5 {

	
	static void rcopy(int[] a, int[] b) {
		int num= a.length <= b.length ? a.length : b.length;
		for(int i=0; i< num; i++) {
			//첨에 생각한 방법 a[num-i-1]=b[i];
			a[i]=b[b.length-i-1];
		}
		System.out.println(Arrays.toString(b)+" <= b");
		System.out.println(Arrays.toString(a)+" <= a");
	}
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("a의 요솟수는  : ");
		int numA= sc.nextInt();
		
		int[] a = new int[numA];			// 요솟수가 numa인 배열 
		for (int i = 0; i < numA; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("b의 요솟수는  : ");
		int numB= sc.nextInt();
		
		int[] b = new int[numB];			// 요솟수가 numa인 배열 
		for (int i = 0; i < numB; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		rcopy(a, b);
	
	}
}
