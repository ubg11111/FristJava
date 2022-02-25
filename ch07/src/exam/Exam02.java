package exam;

/*
 * 하기와 같이 컴파일 에러가 발생한다 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
 * 
 * Product의 기본생성자가 default값이 있지만. 보통 상속받는 조상의 기본생성자가 생성되어있지 않다면
 * 자손클래스에서 기본생성자를 생성할 수 없다. (조상클래스의 기본생성자를 상속받아야하기 때문에)
 * 
 * 그래서 조상클래스에서 기본생성자를 만들어주면 컴파일문제가 해결이 된다.
 */

// 멤버가 3개인 조상 Product
class Product{ 
	
	Product(){}; // 기본생성자
	
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	} // 매개변수 생성자
}

// 멤버가 1개인 자식 Tv + Product의 멤버3개 = 총 4개의 멤버를 가지고 있다.
class Tv extends Product{
	
	// int price;
	// int bonusPoint;
	
	
	Tv() {} // 기본생성자
	
//	Product(int price){
//		this.price = price;
//		bonusPoint = (int)(price / 10.0);
//	} // 매개변수 생성자
	
	public String toString() {
		return "Tv";
	}
}
	

public class Exam02 {

	public static void main(String[] args) {
		Tv tv = new Tv(); // 객체 생성
	}
}
