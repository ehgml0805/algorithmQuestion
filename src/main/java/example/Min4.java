package example;

public class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min=a;
		
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(0,5,3,8): "+ min4(0,5,3,8));
	}
}
