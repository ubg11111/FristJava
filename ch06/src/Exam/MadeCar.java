package Exam;

public class MadeCar {

	public static void main(String[] args) {
		Car3 c1 = new Car3(); // 0x100 객체 생성
		Car3 c2 = new Car3(); // 0x200 객체 생성
		
		
		c1.door = 4;
		c1.gear = "auto";
		c1.kind = "아반떼";
		
		c2.door = 2;
		c2.gear = "auto";
		c2.kind = "람보르기니 스포츠";
		
		System.out.println("모든 차량의 바퀴는 4개로 설정합니다.");
		Car3.tire = 4;
		System.out.println();
		
		System.out.println("해당차량의 종류는" + c1.kind + "이고," + "기어는" + c1.gear + "이고," + "문의 갯수는" + c1.door + "개 입니다." + 
		"바퀴는 갯수는" + Car3.tire + "개 입니다.");
		
		System.out.println("해당차량의 종류는" + c2.kind + "이고," + "기어는" + c2.gear + "이고," + "문의 갯수는" + c2.door + "개 입니다." + 
				"바퀴는 갯수는" + Car3.tire + "개 입니다.");
		
	}
}


class Car3{
	// 객체를 생성해서 사용해야함. (인스턴스변수)
	int door;
	String gear;
	String kind;
	
	// 객체 생성없이 아무때나 사용가능함 (클래스변수) 대신 공통으로 적용해야한다.
	
	static int tire;
	
}