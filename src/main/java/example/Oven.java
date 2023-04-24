package example;

import java.util.Scanner;

public class Oven {
	
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("H의 값 : ");
        System.out.println("M의 값 : ");
        System.out.println("C의 값 : ");
        int H=sc.nextInt();
        int M=sc.nextInt();
        int C=sc.nextInt();
        // 11시 40분이야 근데 요리가 30분짜리야 그러면 12시 10분 그럼  M+C>=60이라면 H+1 해주고 
        if(M+C >= 60){
            H=H+1;
            M=(M+C)-60;
            
            if(H>23){
                H=0;
            }
            System.out.println(H+" "+ M);
        }else {
            System.out.println(H+" "+ M+C);
        }
    }
}
