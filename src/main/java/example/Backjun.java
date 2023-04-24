package example;

import java.util.*;

public class Backjun {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("n의 값을 입력하세요. ");
        int n=sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        String str="long ";
        for (int i = 0; i < n/4; i++) {
            sb.append(str);
        }
        System.out.println(sb+"int");
    }


}
