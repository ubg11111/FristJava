package exam;

class Car2{
	int price;
	int bonusPoint;
	
	
	
	Car2(int price){
		this.price = price;
		this.bonusPoint = (int)(price / 10.0); // 보너스 포인트 축적
	}
}


class Avante2 extends Car2{
	Avante2(){
		super(2500); // Car 매개변수에 값을 전달
	}
	
	public String toString() {
		return "Avante N7";
	}
	
}


class Genesis2 extends Car2{
	Genesis2(){
		super(5000);
	}
	
	public String toString() {
		return "Genesis G70";
	}
}

class Poter extends Car2{
	
	Poter(){
		super(3000);
	}
	
	public String toString() {
		return "Poter S2";
	}
	
}


class Buyer2{
	int money = 20000;
	int bonusPoint = 0;
	
	Car2[] cart = new Car2[10]; // 자동차의 구매내역을 10개로만듬
	
	int i=0; // 자동차 구매내역을 카운터 하기 위하여 설정
	
	
	void buy(Car2 c) {
		if(money < c.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		money -= c.price;
		bonusPoint += c.bonusPoint;
		cart[i++] = c;
		System.out.println(c.toString() + "을/를 구매하셨습니다.");
	}
	
	void summary() {
		int sum = 0; // 자동차 구매 합계
		String itemList = ""; // 자동차 구매 리스트
		
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) {
				break; // 반복문을 돌리는데 cart[i]즉 cart배열에 구매리스트가 없으면 반복문을 탈출한다.
			}
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("구입하신 자동차금액의 합계는" + sum + "입니다.");
		System.out.println("구입하신 자동차의 리스트는 " + itemList + "입니다.");
	}
}

public class Exam08 {
	public static void main(String[] args) {
		Buyer2 buy2 = new Buyer2();
		
		
		buy2.buy(new Avante2());
		buy2.buy(new Genesis2());
		buy2.buy(new Poter());
		buy2.summary();
	}
}
