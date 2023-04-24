package chap2;
import java.util.*;


public class Q1 {
	static int maxOf(int[] a){
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) max=a[i];
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Random r= new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		int num=1+ r.nextInt(10); //배열의 요숫수(길이)
		int[] height=new int[num];
		
		System.out.println("사람 수는 " + num + "명입니다.");
		System.out.println("키는 다음과 같습니다.");
		for(int i=0; i< num; i++) {
			height[i]=100+r.nextInt(99);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		System.out.print("키가 제일 큰 값은?"+maxOf(height));
	}

}
