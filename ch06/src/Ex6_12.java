class Car{
	String color; // 색상
	String gearType; // 기어 종류 (auto)자동 , (manual)수동
	int door; // 문
	
	Car(){} // 기본생성자 생성
	
	Car(String c , String g, int d){
		color = c; // white
		gearType = g; // auto
		door = d; // 4
	}
}


class Ex6_12 {
	public static void main(String[] args) {
		Car c1 = new Car(); // 객체 생성 (0x100 주소에 color , gearType , door) 
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4; 
	
	
		Car c2 = new Car("white", "auto", 4); // 매개변수가 있는 생성자 
		
		// c1의 객채생성 변수초기화 == c2의 매개변수가 생성자로 초 기화는 동일하다
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door); // 기본생성자 있는 c1의 출력물
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door); // 매개변수가 있는 생성자 c2의 출력물
	
	}
}
