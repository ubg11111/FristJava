package ch07;

/*
 * 매개변수의 다형성.
 * - 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
 * 
 * 장점 1. 다형적 매개변수
 * 장점 2. 하나의 배열로 여러종류 객체다루기
 * 
 * 참조변수의 형변환을 하는 이유? 
 * - 사용가능한 멤버갯수를 조절하기 위함.
 * - 단 자식객체 참조하여 조상객체를 생성하는건 안됨. 멤버가 5개를 써야하는데 4개를 쓰라는경우.
 */

class Product{
	int price; // 제품의 가격
	int bonusPoint;  // 제품구매시 보너스포인트 적립
	
	Product(int price){ // 매개변수 생성자
		this.price = price;
		this.bonusPoint = (int)(price/10.0); // 보너스포인트는 제품구매의 10%가 적립됨.
	}
}


class TV1 extends Product{

	TV1() { // TV의 가격을 정해줌
		// 조상 클래스의 생성자 Product(int price)를 호출
		super(100); // Tv제품의 가격은 100원이다. ==> 조상의 생성자 Pruduct(int price)에 접근 멤버 price에 금액을 넣음
	}
	
	//Object클래스의 toString()을 오버라이딩한다. 
	
	public String toString() {
		return "Tv";
	}
	
}


class Computer1 extends Product{


	Computer1() {super(200);} // 컴퓨터의 가격을 200원으로 설정

	
	public String toString() {
		return "Computer";
	}
}

class Buyer { // 고객님 물건을 사시는 분
	int money = 1000; // 소유금액
	int bonus = 0; // 보너스금액
	
	void buy(Product p) {// Product 조상엔 new Tv1하고 new Computer로 접근이 가능하다.
		if(money < p.price) { // 제품의 가격이 가진 금액보다 많은 경우
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price; // 제품의 가격만큼 머니가 감소
		bonus += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(p.toString() + "을/를 구입하셨습니다."); // 참조변수와 문자열을 결합할 때는 toString()을 사용해야된다 하지만 생략가능하다.
	}
}

public class Ex7_8_polymorphism {
	public static void main(String[] args) {
		Buyer buy = new Buyer();
		
		// Product p = new TV1(); 기본생성자 생성
		// p.buy(p); p의 메서드 buy(p)의 접근
		buy.buy(new TV1()); // 상기 두줄코드를 한줄로 작성한것과 같다.
		
		// Product p = new Computer1();
		// p.buy(p); p의 메서드 buy(p)의 접근
		// 하기와같이 한줄로 작성하는경우의 단점은 참조변수가 없다... p 라든가.. 따라서 다른 멤버에 접근이 불가능.
		buy.buy(new Computer1()); // 상기 두줄코드를 한줄로 작성한것
		
		System.out.println("현재 남은 돈은  " +  buy.money + " 입니다.");
		System.out.println("현재 보너스 점수는 " + buy.bonus + " 입니다.");
	}
}
