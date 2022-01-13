

public class Ex6_1 {
	// 객체의 생성과 사용
	public static void main(String[] args) {
		Tv t1; // TV 인스턴스를 참조하기 위한 변수 t를 선언
		t1 = new Tv(); // Tv인스턴스를 생성한다.
		t1.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7로 변경한다.
		t1.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t1.channel + "입니다.");
		System.out.println("현재 채널은 " + t1.channel + "입니다.");
	}
}

class Tv{
	// Tv의 속성 (멤버 변수)
	String color; // 색상.. 참조변수String 기본값은 null.
	boolean power; // 전원상태(on/off) ..boolean 기본값은 false.
	int channel; // 채널설정  ... int 기본값은 0..
	
	// Tv의 기능 (메서드)
	void power() {power = !power;} // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel;} // Tv의 채널을 높이는 기능.
	void channelDown() { --channel;} // Tv의 채널을 낮추는 기능.
}
