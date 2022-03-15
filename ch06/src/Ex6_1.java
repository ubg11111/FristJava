

public class Ex6_1 {
	// 객체의 생성과 사용
	public static void main(String[] args) {
//		Tv t1; // TV 인스턴스를 참조하기 위한 변수 t를 선언 ===> 1번
//		t1 = new Tv(); // Tv인스턴스를 생성한다. ===> 2번
		
		Tv t1 = new Tv(); // 1번과 2번을 합쳐서 클래스 호출을 하는것.
		Tv t2 = new Tv(); // 0x200 다른 주소의 객체를 생성함
		
		
		// 참조변수를 이용하여 객체를 사용한다.
		t1.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7로 변경한다.
		t1.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
		
		
		t2 = t1; // t2의 주소에 t1의 주소를 넣어준다
		// t1 = 주소 0x100
		// t2 = 주소 0x200 
		// 요부분을 t1이 => t2로 선언되면서 t1과 t2가 0x100주소를 같이 가르키게 된다. 기존에 있던 0x200주소는 GC에 의해서 메모리가 정리된다.
		
		System.out.println("현재 채널은 " + t1.channel + "입니다.");
		System.out.println("현재 채널은 " + t2.channel + "입니다.");
	}
}

class Tv{ // Tv라는 하드웨어 제품에 아래와같은 속성과 기능을 넣은것.. 이것이 클래스의 정의
	// Tv의 속성 (멤버 변수) (설계도)
	String color; // 색상.. 참조변수String 기본값은 null.
	boolean power; // 전원상태(on/off) ..boolean 기본값은 false.
	int channel; // 채널설정  ... int 기본값은 0..
	
	// Tv의 기능 (메서드)
	void power() {power = !power;} // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel;} // Tv의 채널을 높이는 기능.
	void channelDown() { --channel;} // Tv의 채널을 낮추는 기능.
}
