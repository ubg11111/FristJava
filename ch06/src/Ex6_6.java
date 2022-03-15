
/*
 * 참조형매개변수는 쓰기와 읽기가 가능하다.
 */

class Data2 {int x;}

class Ex6_6 {
	public static void main(String[] args) {
	// 참조형 매게변수 예제.
	Data2 d = new Data2();
	d.x = 10;
	
	System.out.println("main() : x = " + d.x);
		
	change(d); // change(d)메서드 d참조변수를 사용 출력값 1000을 출력
	System.out.println("After change(d)");
	System.out.println("main() : x = " + d.x); // 기본형 매개변수와같이 main값이 아닌 참조매개변수로인하여 초기화된 x값을 출력
}
	
	
	// Data2 d = new Data2(); 객체에 접근하는것 비슷 참조형 매개변수
	static void change(Data2 d) { // 참조형 매개변수
		d.x = 1000; // 참조변수 d의 멤버인 x에 접근하여 1000값으로 초기화
		
		System.out.println("change() : x = " + d.x);
	}
}