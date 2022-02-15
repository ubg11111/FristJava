package ch07;

class Product2{
	int price; // 제품의 가격
	int bonusPoint; // 제품 가격의 10%보너스 저장
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class TV2 extends Product2{

	TV2(int price) {
		super(100); // 조상인 Product2 멤버변수 price에 값을 전달
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer2 extends Product2{

	Computer2(int price) {
		super(300);
	}
	
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2{

	Audio2(int price) {
		super(50);
	}
	
	
	public String toString() {
		return "Audio";
	}
}


class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	
	Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
	
	int i=0; // 카트에 담아서 배열에 사용될 카운터
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p; // 제품을 Product[] cart에 저장한다.
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품의 리스트
		
		// 반복문을 이용하여 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) 
				break; // cart[i] 저장된 값이 없는경우 null인경우 break문을 통해서 반복문을 탈출한다.
		
			sum += cart[i].price; // 카트안 배열의 담긴 제품의 가격을 더해준다
			itemList += cart[i] + ", ";  // 카트안에 담긴 제품명을 문자열로 출력해준다.
		}
		System.out.println("구입하신 물품의 총 가격은 : " + sum + " 만원 입니다.");
		System.out.println("구입하신 제품은 : " + itemList + "입니다.");
	}
}


public class Ex7_9_Array {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new TV2(0));
		b.buy(new Computer2(0));
		b.buy(new Audio2(0));
		b.summary();
	}
}
