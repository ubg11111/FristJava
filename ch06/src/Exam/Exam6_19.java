package Exam;

class MyTv{
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	public MyTv() {} // 기본생성자
	
	void trunOnOff() {
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		
		isPowerOn = !isPowerOn;
		
	}
	
	void volumeUp() {
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
		
		
		if(volume < MAX_VOLUME) {
			volume++;
		}
	}
	
	void volumeDown() {
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
		
		if(volume > MIN_VOLUME) {
			volume--;
		}
	}
	
	void channelUp() {
		// (4) channel의 값을 1증가시킨다.
		// 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
		
		if(channel == MAX_CHANNEL) { // ch 99 == 100  false
			channel = MIN_VOLUME;
		} else {
			channel++;
		}
		
	}
	
	void channelDown() {
		// (5) channel의 값을 1감소 시킨다.
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNLE로 바꾼다.
		
		if(channel == MIN_CHANNEL) { // channel 100 == MIN_CHANNEL 0  false
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
		
	}
} // class MyTv end문

public class Exam6_19 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume); // ch 100 , vol 0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume); // ch99 , vol 0
		
		t.volume = 100; 
		t.channelUp(); // ch 99 => 100;
		t.volumeUp();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume); // ch 100 , vol 100
	}
}
