package exam;



class Car{
	int price;
	int bonusPoint;
	
	
	
	Car(int price){
		this.price = price;
		this.bonusPoint = (int)(price / 10.0); // 보너스 포인트 축적
	}
}


class Avante extends Car{
	Avante(){
		super(2500); // Car 매개변수에 값을 전달
	}
	
	public String toString() {
		return "Avante N7";
	}
	
}


class Genesis extends Car{
	Genesis(){
		super(5000);
	}
	
	public String toString() {
		return "Genesis G70";
	}
}


class Buyer{
	int money = 20000;
	int bonusPoint = 0;
	
	void buy(Car c) {
		if(money < c.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}
		money -= c.price;
		bonusPoint += c.bonusPoint;
		
		System.out.println(c.toString() + "을/를 구매하셨습니다.");
	}
}

public class Exam07_polymorphsim {

	public static void main(String[] args) {
		Buyer buy = new Buyer();
		
		// Car c참조변수를 통해 자손 객체를 생성 (다형성) 
		buy.buy(new Avante());
		buy.buy(new Genesis());
		
		
		System.out.println("현재 남은 돈은" + buy.money + "원 입니다.");
		System.out.println("현재 남은 보너스포인트는" + buy.bonusPoint + "원 입니다.");
	}
}
