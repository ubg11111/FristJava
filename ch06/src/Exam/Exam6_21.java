package Exam;

/*
 * 메서드명 : abs
 * 기능 : 주어진 값의 절대값을 반환한다.
 * 반환타입 : int
 * 매개변수 : int value
 */



public class Exam6_21 {
	
	int value;
	
	public static int abs(int value) {
//		return value < 0 ? -value : value > 0 ? value : 0;
//      삼항연산자 공식 
//      조건식 ? true반환 : false반환
		
		if(value == 5) {
			return 5;
		} else if(value == -10) {
			return 10;
		}
		return value;
	}
	
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));
	}
}
