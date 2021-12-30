
public class Ex5 {

	public static void main(String[] args) {
		int i; // scope 범위는 좁을수록 좋고 넓을수록 안좋다. 범위가 넓으면 선언변수값의 문제를 찾기힘듬. -선언위치부터 선언된 블럭의 끝까지 유효함
		
		// for 반복문 예제
		// for은 무엇을 만족하는동안 조건이 true인경우 만족하고 false인경우 반복문 탈출함
		// for 반복문은 조건식을 생략하면 , true로 간주하기때문에 무한반복문이 되버림. 특수한 상황이아닌 경우 조건식을 넣는것이 중요
		for (i=1; i<=10; i++) { // 괄호안에 문장을 5번 출력함  
			// 증감연산자 i++ = i=i+1 다른 사칙연산도 가능함 i=i*2 
			System.out.println("i=" + i);
		}
		System.out.println(i); 
	}
}
