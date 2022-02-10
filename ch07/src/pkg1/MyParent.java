package pkg1;

public class MyParent{ // 접근제어자가 default -> public 으로 바꿈
	//public > protected > default > private 접근제어자 scope
	// public -  접근제한이 없음 모든 패키지나 클래스가 접근이 가능하다.
	// protected - 같은패키지 같은 클래스 다른패키지의 자손클래스까지 접근이 가능하다.
	// default(접근제어자 선언이 없는경우) - 같은 패키지내에서만 접근이 가능하다.
	// private - 동일한 클래스내에서만 접근이 가능 외부에서 접근이 불가능하다
	
	private int prv; // 같은 클래스
			int dft; // 같은 패키지
	protected int prt; // 다른패키지 자손클래스까지
	public int pub; // 모든 접속이 허용
	

	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}


class MyParentTest { // default 접근제어자
	public static void main(String[] args) {
		MyParent p = new MyParent();
		
//		System.out.println(p.prv); // 같은 클래스내에서만 접근가능한 private는 오류가 뜬다
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
	}
}
