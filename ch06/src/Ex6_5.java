
class Data{ int x; }

class Ex6_5 {
	public static void main(String[] args) {
		Data d = new Data(); // Data라는 객체를 생성한거!
		
		d.x = 10; // Data int x의 값을 10을 d로 초기화
		
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) { // 기본형 매게변수  static 클래스변수(공통변수)
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}