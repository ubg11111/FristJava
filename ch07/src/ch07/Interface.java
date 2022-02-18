package ch07;

/*
 * 인터페이스(Interface)? 
 * - 완전환 추상화 완성된 추상화를 말한다.
 * 즉 완전 깡통으로 이야기를 한다.
 * 
 * 이전에 배운 추상클래스는 일반클래스 + 추상클래스가 반반있는 개념으로
 * 인스턴스변수도 일방적으로 선언하고 추상메서드도 오버라이딩하여 상속이 가능했엇다.
 * 
 * 인터페이스의 경우 추상메서드의 집합이다. 그외 아무것도 들어올 수 없다. 모든멤버가 public으로 구성되어있고, 설계도가 없는 껍데기를 말한다.
 * 
 * 정리하자면 추상클래스(abstract class)와 인터페이스(interface)의 차이는 인스턴스 변수와 추상메서드가 있냐? 모든것이 추상메서드로 구성되어있냐의 기준으로 보면 된다.
 * 
 * 인터페이스의 선언 방법
 * 
 * 형식) interface 인터페이스이름{
 * 		public static final 타입 상수이름 = 값; // 상수
 * 		public abstract 메서드이름(매개변수목록); // 추상메서드
 * };
 * 
 * 모든 인터페이스는 public으로 구성되어 있다. 추상메서드는 구현부가 없는것도 인터페이스와 같다.
 * 
 * 
 *  ★정리★
 *  인터페이스란? => 추상 메서드의 집합이다.(중요)
 *  인터페이스의 구현이란? => 인터페이스의 추상메서드 몸통{}만들기 ( 미완성 설계도 완성하기 )
 *  추상클래스와 인터페이스의 공통점은? => 추상메서드를 가지고 있다.(미완성 설계도)
 *  추상클래스와 인터페이스의 차이점은?
 *  => 추상클래스는 단일상속만 가능하고 멤버변수와 추상메서드를 가지고 있다.
 *  => 인터페이스는 다중상속이 가능하고 추상메서드의 집합이다. 인스턴스변수(iv)를 가질 수 없다.
 */


// 멤버변수의 경우 인터페이스의 경우 항상 public static final을 가지고 있다고 생각하면 된다. 다만 생략이 가능할 뿐
// 멤버메서드의 경우도 public abstract가 생략되어 있다고 생각하면 된다. 요 또한 생략이 가능하다.
interface PlayingCard{
	public static final int SPADE = 4;
	final int DIAMOND = 3; // public static final int 생략됨
	static int HEART = 2; // public static final int 생략됨
	int CLOVER = 1;  // public static final int 생략됨
	
	public abstract String getCardNumber();
	String getCardKind(); // public abstract가 생략되어도 상관없음.
}

interface Fightable extends Movable, attackable{ /* 멤버2개를 상속받음 */}

// 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상이 아니다).
// 인터페이스는 다중 상속이 가능(추상메서드는 충돌해도 문제가 없다.)
// => 선언부가 다르면 둘다 상속받으면 상관없다. 다만 기존의 추상클래스는 선언부는 같지만 내용{}이 다르기에 
// 어느쪽을 상속받을지 결정 할 수 없어서 다중상속이 안되고 단일상속만 되는것이다.
// 반대로 인터페이스는 추상메서드의 집합 선언부는 다르지만 모든 구현부또한 없다는것이다. 그래서 선언부만 다중상속을 받고 구현은 자식이 해주면 그만인것이다.
interface Movable{
	// 지정된 위치 (x,y)로 이동하는 메서드
	void move(int x, int y);
}

interface attackable{
	// 지정된 대상(u)을 공격하는 기능의 메서드
	void attack(String u);
}


// 인터페이스의 구현 implements = 구현이라고 한다.
// 구현이라하면 추상메서드를 작성해주는것으로 보면된다.
public class Interface implements Fightable{

	public static void main(String[] args) {
		
		Interface fe = new Interface();
		
		fe.move(32, 22);
		fe.attack("마린");
	
	}

	@Override
	public void move(int x, int y) {
		System.out.println(x +"만큼 x로 이동합니다." + y + "만큼 y로 이동합니다.");
	}

	@Override
	public void attack(String u) {
		System.out.println(u + "를 공격합니다.");
	}
}
