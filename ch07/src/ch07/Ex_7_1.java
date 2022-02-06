package ch07;

class Tv{ // 부모는 5개의 멤버
	boolean power; // 전원상태 
	int channel; // 채널
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}


class SmartTv extends Tv{ // SmartTv의 자손은 Tv 부모의 멤버를 상속 받음. (부모 + 자식 = 7개의 멤버)
	boolean caption; // 캡션상태(on/off) 
	
	void displayCaption(String text) {
		if(caption) { // 캡션이 on인경우
			System.out.println(text);
		}
	}
}


public class Ex_7_1 {

	public static void main(String[] args) {
		
		// 자손이 부모클래스로부터 상속받는경우 부모클래스의 객체생성은 불가능함.
		SmartTv stv = new SmartTv();
		
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, world");
		stv.caption = true; // 캡션(자막) On
		stv.displayCaption("Hello, world");
	}
}
