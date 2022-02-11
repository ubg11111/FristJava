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


/*
 * 다형성은 조상객체가 자식객체를 참조할 수 있지만.
 * 반대로 자식 객체가 조상을 참조하는것은 불가능하다.
 * 예시를 간단하게 들자면.
 * 
 * 조상클래스에 만들어진 멤버가5개의 기능을 담고있다고 가정해보자.
 * 자식클래스의 경우 멤버가7개의 기능을 담고있다.
 * 
 * 조상클래스가 자식클래스를 참조해서 사용한다는건 조상의 5개의기능이 있지만 자식의 7개의 기능중 5개를 쓰겟다는 이야기다. 
 * 
 * 즉 사용하는데 문제는없다 대신 자식의 유용한 기능 2개를 못쓰는것 뿐.
 * 
 * 반대로 자식클래스가 조상클래스를 참조하는건 불가능하다. ex) Smart tv = new Tv();
 * 
 *  7개의 기능이 있는 자손인 Smart Tv가 5개의 기능만을 가지고 있는 조상Tv의 객체를 생성한다?
 *  
 *  5개만 사용할 수 있지만 7개중에 5개는 사용가능해도...
 *  
 *  7개의 기능이 있는데 5개만 사용해라는 말이 안되기 때문이다. 
 */

class SmartTv extends Tv{ // SmartTv의 자손은 Tv 부모의 멤버를 상속 받음. (부모 5개+ 자식 = 7개의 멤버)
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
