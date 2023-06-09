package chap2;

import java.util.*;

public class Q2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		//t에다 idx1 값을 넣고 
		int t=a[idx1];
		//a[idx1]에 a[idx2] 값을 넣고 
		a[idx1]=a[idx2];
		//a[idx2]에 복사해둔 idx1 값을 넣는다.
		a[idx2]=t;
		
	}
	//역순 정렬 
	static void reverse(int[] a) { //int[] a =x;
		//맨처음 입력한 배열을 보여줘 
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length/2; i++) { //인덱스는 0부터 시작 
			System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]을 교환합니다.");
			swap(a,i,a.length-i-1);
			System.out.println(Arrays.toString(a));
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		
		//배열 x 를 만들고 거기에 사용자가 길이 지정 
		int[] x= new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: ");
			x[i]= sc.nextInt();
		}
		//int[] a = x
		reverse(x);
		
		System.out.println("x= "+ Arrays.toString(x));
		System.out.println("역순 정렬을 마칩니다.");
	}

}
