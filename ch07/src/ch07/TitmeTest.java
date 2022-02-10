package ch07;

import java.util.Scanner;

class Time{
	private int hour; // 0 ~ 23 사이의 절대적인 값을 가져야함.
	private int minute;
	private int second;
	
	
	public void setHour(int hour) { // set메서드
		if(isNotValidHour(hour)) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		
		this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) { // 굳이 내부클래스에서만 사용을 하는 메서드라면 private로 하는것이 데이터 보호에 좋다.
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {return hour;} // get 메서드
}


public class TitmeTest {

	public static void main(String[] args) {
		Time t = new Time(); // 조상타입의 참조변수 t = 0x100 객체화(인스턴스화)
//		Time t2 =  new Time(); // 조상타입의 참조변수 t2 = 0x200 객체화(인스턴스화)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요 >>> ");
		t.setHour(sc.nextInt());
		
		System.out.println("현재 시간은 : " + t.getHour() + " 시 입니다.");
		
		sc.close();
	}
}
