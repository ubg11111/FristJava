package Exam;


public class Computer {
	
	public String[] osType = {"윈도우7", "애플 OS X", "안드로이드"};
	private int OS; // 배열의 인덱스 i역할
	int Memory;
	
	Computer(int OS, int Memory){
		
		this.OS = OS;
		this.Memory = Memory;
		
	} // 매개변수 생성자
	
	void print() {
		System.out.printf("운영체제 : %s, 메인메모리 : %d %n", osType[OS], Memory);
	}
	
	
	
	public static void main(String[] args) {
		Computer pc = new Computer(0,16);
		Computer apple = new Computer(1,32);
		Computer galaxy = new Computer(2,16);
	
		pc.print();
		apple.print();
		galaxy.print();
	}
}
