package example;

public class SumGauss {
	static int sumof(int a, int b) {
		int min;
		int max;
		
		if(a<b) {
			min=a;
			max=b;
		}else { //a가 더 큰 경우 
			min=b;
			max=a;
		}
		int sum=0; 
		
		for(int i = min; i <=max; i++) {
			sum=i+sum;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sumof (1, 5)"+ sumof(1,5));
		System.out.println("sumof (1, 10)"+ sumof(1,10));
		System.out.println("sumof (8, 12)"+ sumof(8,12));
	}


}
