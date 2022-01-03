import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		// 중첩 for문
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
		
		// 별(*)을 10개 추가해보자.
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
