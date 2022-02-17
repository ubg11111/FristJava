package ch07;

public class Human {

	public static void main(String[] args) {
		Human1[] human = {new People(), new People2()};
		
	
		for(int i=0; i<human.length; i++) {
			human[i].age();
			human[i].Gander();
		}
		
	}
}


abstract class Human1{
	
	String name;
	int age;
	String gander;
	String hobby;
	
	
	abstract void Gander();
	abstract void age();

}

class People extends Human1{
	
	String name;
	String hobby;
	
	
	
	@Override
	void Gander() {
		System.out.println("성별은 남자입니다.");
	}
	@Override
	void age() {
		System.out.println("나이는 23살입니다.");
	}
}

class People2 extends Human1{
	
	String name;
	String hobby;
	
	
	@Override
	void Gander() {
		System.out.println("성별은 남자입니다.");
	}
	@Override
	void age() {
		System.out.println("나이는 23살입니다.");
	}
}