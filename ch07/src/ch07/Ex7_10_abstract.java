package ch07;

abstract class Player{ // 추상 클래스 (미완성 설계도)
	abstract void play(int pos); // 추상메서드 (미완성 기능)
	abstract void stop(); // 추상메서드 (미완성 기능)
	
	// 추상메서드는 {몸통} 구현부가 없는 메서드를 말한다

}

// 추상클래스는 상속을 통해 완성해야 객체 생성가능

class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println(pos + "위치부터 play합니다.");
	}

	@Override
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	
}



public class Ex7_10_abstract {

	public static void main(String[] args) {
//		Player player = new Player(); // 추상클래스의 객체 생성은 불가능하다. 상속을 통해 자손으로 생성가능
		
//		AudioPlayer audio = new AudioPlayer(); // 자손을 통해서 객체생성이 가능
		Player audio = new AudioPlayer(); // 부모가 자식을 참조하여 객체생성 다형성!! 실제 객체는 AudioPlayer의 주소를 가리킨다.
		
		audio.play(100);
		audio.stop();
	}
}
