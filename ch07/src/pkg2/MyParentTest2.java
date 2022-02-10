package pkg2;

import pkg1.MyParent; // 다른 패키지를 import 함

class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv); // 에러 - 같은 클래스에서만 써야되서 오류
//		System.out.println(dft); // 에러 - 같은패키지에서만 써야되서 오류
		System.out.println(prt); // OK - 다른패키지의 자손까지 접근가능 현재 Myparent 부모의 자손은 MyChild이기에 접근이 가능함
		System.out.println(pub); // OK - 접근제한 없음
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		
		//System.out.println(p.prv); // 에러 - 같은 클래스에서만 써야되서 오류
		//System.out.println(p.dft); // 에러 - 같은패키지에서만 써야되서 오류
		//System.out.println(p.prt); // 에러 - 다른패키지의 자손까지만 접근가능해서 오류 지금 접근하려는 클래스는 부모클래스
		System.out.println(p.pub); // OK
	}
}
