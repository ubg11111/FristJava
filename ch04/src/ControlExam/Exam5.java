package ControlExam;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 갯수  > ");
		sc.nextInt();
		
		
		for(int i=0; i<6; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
