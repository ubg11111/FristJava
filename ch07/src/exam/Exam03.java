package exam;

/*
 * MyTv클래스의 멤버변수 isPowerOn,channel,volume을 클래스 외부에서 접근 할 수 없도록
 * 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가해주세요.
 */

// 보통은 접근제어자 앞에 아무것도 부여하지않는 경우 dafault 접근제어자로 지정된다.
// private 특징은 해당 클래스내에서만 접근이 가능하다. 외부 접근이 완전 차단 대신에 getter와 setter를 통해서 저장 및 불러오기가 가능



class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; // 이전 채널을 저장할 멤버변수
	
	final int MAX_VOLUME = 100; // static이 숨겨져 있음 생략되었음.
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
// private 접근제어자의 getter와 setter 메서드를 만들어 준다.
	public boolean getisPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume < MIN_VOLUME || volume > MAX_CHANNEL)
		this.volume = volume;
	}
	
	void goroPrevChannel() {
		setChannel(prevChannel); // 현재 채널을 이전 채널로 변경
	
	}
}


public class Exam03 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("Tv의 채널은 " + t.getChannel());
		t.setVolume(20);
		System.out.println("Tv의 볼륨은 " + t.getVolume());
	}
}
