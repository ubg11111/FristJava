package ch06;

// 하나의 소스 파일에는 하나의 클래스만 작성하는 것이 바람직

public class Hello3 {} // 소스파일의 이름은 public class 이름과 일치
class Hello4{} // 하나의 소스파일에는 하나의 public class만 허용 
class Hello5{}
class hello3{
	public static void main(String[] args) {
		System.out.println("hellow");
	}
} // 소문자로 클래스를 작성하는 경우 메인메소드 작동이 불일치할 수 있음.