package example;
import java.util.*;


public class Q11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*System.out.println("i 값? :");
		int i=sc.nextInt();
		System.out.println("j 값? :");
		int j=sc.nextInt();
		*/
		System.out.print("   |");
		for(int j=1; j<10; j++) {
			
			System.out.printf("%3d",j);
		}
		System.out.println("\n---+---------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%2d | ", i);
			for(int j=1; j<10; j++) {
				System.out.printf("%3d ",i*j);
			}
			System.out.println();
		}
	}
}
