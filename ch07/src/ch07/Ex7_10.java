package ch07;

public class Ex7_10 extends Object{

	public static void main(String[] args) {
		
		// 참조 변수를 묶어놓은것을 객체배열이라고 한다. 
		 Unit[] group = {new Marine(), new Tank() , new DropShip()}; 
//		 Unit[] group = new Unit[3];
//		 group[0] = new Marine();
//		 group[1] = new Tank();
//		 group[2] = new DropShip();
		
		 
		 
		// group[i] = [0],[1],[2] 호출  group.length;
		for(int i=0; i<group.length; i++) {
			group[i].move(10, 20); 
			group[i].attack();
		}
	}
}



abstract class Unit{
	int x,y;
	
	abstract void move(int x, int y);
	
	void stop() {};
	
	abstract void attack();
}

class Marine extends Unit{
	
	// 유닛의 멤버를 상속받음
	// int x,y;
	// void stop(){};
	
	// abscract 추상메서드는 오버라이딩(재정의) 해줘야 함.
	@Override
	void move(int x, int y) {
		System.out.println("Marine = [x= " + x + ", y= " + y + "]");
	
	}
	
	void strimpack() {}


	@Override
	void attack() {
		System.out.println("마린이 공격합니다.");
	};
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Tank = [x= " + x + ", y=" + y + "]");
	}
	
	void ChangeMode() {}

	@Override
	void attack() {
		System.out.println("탱크가 공격합니다.");
	};
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("DropShip = [x=" + x + ", y=" + y + "]");
	}
	
	void load() {}; // 태우기
	void unload() {} // 내리기

	@Override
	void attack() {
		System.out.println("공격이 없습니다.");
	}; 
}