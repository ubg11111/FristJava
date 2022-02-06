package ControlExam;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 별의 갯수를 입력하세요 : ");
		int[] star = new int[sc.nextInt()];
		
		
		for(int i=0; i<star.length; i++) {
			System.out.print("*");
		}
		
		sc.close();
	}
}
