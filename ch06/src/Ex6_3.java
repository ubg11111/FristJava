
public class Ex6_3 {

	public static void main(String[] args) {
	System.out.println("Card widht = " + Card.width);	// cv 클래스변수 객체생성없이 사용가능 아래 class Card 설계도에서 메모리를 사용
	System.out.println("Card height = " + Card.height);	
		
	Card c1 = new Card(); // c1 = 0x100 이라는 객체를 생성
	c1.kind = "Heart"; // 인스턴스변수
	c1.number = 7;
	
	Card c2 = new Card(); // c2 = 0x200 이라는 객체를 생성
	c2.kind = "Spade"; // 인스턴스변수
	c2.number = 4;
	
	System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" +  c1.width + ","+ c1.height + ")");
	System.out.println("c2은" + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ","+ c2.height +")");
	
	System.out.println("c1의 width와 height를 각각 50, 80으로 변경됩니다.");
	
	Card.width = 50; // 클래스변수 초기화 어떤 주소를 초기화하든 공통속성이기에 c1,c2 같은 클래스변수에서 초기화되어 적용
	Card.height = 80; // 해당 클래스변수 초기화는 c1,c2와 같이 객체형식으로 초기화하면 가독성이 떨어지기에 아래 클래스 Card를 넣어 초기화 해주는것이 바람직한 작성법임 (cv 클래스변수표시)
	
	System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (폭은)" +  c1.width + "," + "(높이)" + c1.height + "");
	System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (폭은)" + c2.width + "," + "(높이)" + c2.height + "");
	}
}

class Card{
	// 인스턴스 변수 (개별속성) 해당 인스턴스변수를 기준으로 모든 개별주소가 생성됨 
	String kind; 
	int number;
	
	// 클래스 변수 (공통속성) 해당 클래스기준으로 모든 값은 공통으로 적용됨
	static int width = 100;
	static int height = 250;
}

