package exam;

/*
 * 섯다 카드 20장을 포함하는 섯다카드 한벌(SutdaDeck클래스)을 정의한 것이다. 
 * 섯다카드 20장을 담는 StudaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가
 * 한쌍씩 있고, 숫자가1,3,8일 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다. 즉, StudaCard의 인스턴스 변수 isKwang의 값이 true여야 한다.
 */

class StudaDeck{
	final int CARD_NUM =20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 카드가 20장이 들어간거다
	// cards = {0,0,0,0,0,0,0,0,0,0,0......0} 총 20개의 0값
	
	StudaDeck() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i == 0 || i==2 || i==7) {
				cards[i] = new SutdaCard(i+1, true);
			}else {
				cards[i] = new SutdaCard((i%10)+1, false);
			}
		}
	}
	
	void shuffle() {
		for(int i=0; i<100; i++) {
			int k = (int)(Math.random() * cards.length);
			int j = (int)(Math.random() * cards.length);
			
			SutdaCard tmp = cards[k];
			cards[k] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index <0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random() * cards.length)];
	}
}


class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K" : "" );
	}
}

public class Exam01 {
	public static void main(String[] args) {
		StudaDeck deck = new StudaDeck(); // 객체생성
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
