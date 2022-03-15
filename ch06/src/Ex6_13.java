// 생성자에서 다른 생성자 호출하기 this()

/*
 * this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음. 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재 (this 선언안해도 사용가능하다)
 * 
 * this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다. (중복코드 제거에 사용한다). 
 * 
 * 즉, this(),this(매개변수) !== this = true (서로다르다)
 * 
 * 
 * this는 static 메서드에서는 사용이 불가능 (객체생성이 필요없는 static메서드는 인스턴스변수를 사용하지않고 지역변수를 사용하기에)
 * this는 생성자 및 인스턴스메서드에서만 사용이가능하다. (전역변수[iv]를 사용할 수 있기에)
 * 
 */

class MyMaht2{
	long a,b; // this.a , this.b <== 이게 진짜 인스턴스 변수(iv)의 이름이다.  this 생략가능
	
	MyMaht2(long a, long b){ // lv(지역변수) iv(인스턴스변수)를 구분하기 위해 this.a , this.b 를 사용함
		this.a = a; // this.a(인스턴스변수) , a(지역변수)
		this.b = b;
	}
	
	long add() { // this는 인스턴스메서드와 생성자에서 사용가능
		return a+b; // return this.a + this.b; 
	}
	
	static long add(long a, long b) { // 클래스 메서드 (static메서드)
		return a+b; // 클래스 메서드는 인스턴스 변수(iv), 인스턴스메서드() , this 사용 불가 왜? this는 인스턴스메서드에서만 사용가능하기에
	}
}



class Car2{ 
	String color;
	String gearType;
	int door;
	

	Car2(){ // 코드 중복을 제거하도록 생성자들끼리 서로 호출하는 this문 사용
		this("white","auto",4); // 다른 생성자 호출시 첫 줄에서만 사용가능 두번째 줄에서 this문 사용시 에러남

	}
	
	Car2(String color){ // 매개변수에 값을 준 클래스변수 
		this(color,"auto",4); // 다른 생성자를 호출시 >> this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다. (중복코드 제거에 사용한다).
	}
	
	Car2(String color, String gearType){ // 2개의 인자를 가진 매개변수
		this.color = color; // this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음. 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재 (this 선언안해도 사용가능하다)
		this.gearType = gearType;
	
	}
	
	Car2(String color, String gearType, int door){ // 3개의 인자를 가진 매개변수 
		this.color = color; // this 인스턴스 자신을 가리키는 참조 변수
		this.gearType = gearType;
		this.door = door;
	}
}




public class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue"); // 1개의 클래스인자를 호출
		Car2 c3 = new Car2("red","none"); // 2개의 클래스인자를 호출
		Car2 c4 = new Car2("orange", "auto", 3); // 인자가 3개가 있는 매개변수 생성자에 인자를 전달한다.
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		System.out.println("c3의 color = " + c3.color + ", gearType = " + c3.gearType + ", door = " + c2.door);
		System.out.println("c4의 color = " + c4.color + ", gearType = " + c4.gearType + ", door = " + c4.door);
	}
}
