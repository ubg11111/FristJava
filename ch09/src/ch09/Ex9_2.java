package ch09;

class Person{
	long id;
	
	// 주소비교 오버라이딩
	public boolean equals(Object obj) {
		
		Person p = (Person)obj; // obj를 Person 클래스로 형변환
		
		if(obj instanceof Person)
			return id == p.id; // 주민번호 비교하게끔 메서드를 재정의
		else
			return false;
	}
	
	Person(long id){
		this.id = id;
	}
}


public class Ex9_2 {
	
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같습니다."); // 서로 다른 두 객체를 비교
		else
			System.out.println("p1과 p2는 같지않습니다.");
	}
}
