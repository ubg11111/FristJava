import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		// break 문 예제
		
		int sum = 0;
		int i = 0;
		
		while(true) { // 항상 참인 무한 반복문 while은 true를 생략하면 안됨
			if(sum > 100)
				break; // 조건만족후 반복문 탈출
			++i;
			sum += i; // sum = sum + i;
		} // break 문으로 end of while 
		 
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}
