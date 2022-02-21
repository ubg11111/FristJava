package ch07;


abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다");
	}
}


//인터페이스의 모든 메서드는 public abstract. 예외없다.
interface Fightable{
	void move(int x, int y); // public abstract 생략됨
	void attack(String f); // public abstract 생략됨
}

class Fighter extends Unit2 implements Fightable{
	
	
	// 오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안된다.
	// 즉 public을 붙여줘야한다
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동" );
	}
	public void attack(String f) {
		System.out.println(f + "를 공격합니다");
	}
	
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightabel() {
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return f;
		
	}
}



public class FighterTest {

	public static void main(String[] args) {
		Fighter f2 = new Fighter();
		Fightable f3 = f2.getFightabel();
		
		// Unit2에는 attack()이 없어서 호출불가하다.
		Unit2 u = new Fighter();
		u.move(20, 30);
		u.stop();
		
		System.out.println();
		
		Fighter f = new Fighter();
		f.move(40, 50);
		f.attack("마린");
		f.getFightabel();
		
		
	}
}
