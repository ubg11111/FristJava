package ch07;

/*
 * 기존의 클래스로 새로운 클래스를 작성하는것(코드의 재사용)
 * 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
 * 
 * 상속
 * - 자손은 조상의 모든 멤버를 상속받는다.(생성자,초기화블럭은 제외) 멤버변수 또는 멤버메서드
 * - 자손의 멤버개수는 조상보다 많거나 같다. (조상보다 적을 수 없다.);
 */


public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		ChildCopy c2 = new ChildCopy();
		Circel2 c3 = new Circel2();
		
		c.x = 30;
		p.x = 30;
		
		c.method();
		System.out.println("참조변수 p.x = " + p.x);
		
		c2.method();
		
		
		System.out.println("Circel2의 p참조변수의 x 값은 = " + c3.p.x);
	}
}


class Parent{
	int x = 10; // super.x 
}

class Child extends Parent{
	int x = 20 ; // 상속의 멤버변수 초기화 // this.x
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x); // 자기멤버(Child) 멤버변수 x에 접근
		System.out.println("super x = " + super.x); // 조상멤버(Parent) 멤버변수 x에 접근
	}
}

class ChildCopy extends Child{
	int x = 50;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super = " + super.x);
	}
}


/*
 * 포함(composite)이란? 
 * - 클래스의 멤버로 참조변수를 선언하는것.
 * 
 * 
 */

//일반 클래스 선언
class Circle1{
	// Circle1 c = new Circle1() == 0x100번지에 x값 = 0 y값 = 0 r값 = 0;
	int x;
	int y;
	int r;
}

// 포함관계 선언
class Circel2{
	// 멤버가 3개 참조변수 p , int x , int y
	// c라는 참조변수 0x100값에  p,x,y 값이 있고 p에는 기본null값에서 객체를 생성해줌으로써 0x200번지의 객체가 생성되며 0x200번지에 멤버가 저장됨.
	Parent p = new Parent(); // 부모객체의 멤버를 포함시킨다. ==> int x;
	int y;
	int r;
}