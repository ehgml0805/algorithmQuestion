package example;

public class Min3 {

	static int min3(int a, int b, int c) {
		int min=a;
		
		if(b<min) min=b;
		if(c<min) min=c;
		
		return min;
	}
	public static void main (String[] args) {
		System.out.println("min(6,2,7): "+ min3(6,2,7));
	}
	
}
