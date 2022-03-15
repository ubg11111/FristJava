package Exam2;

public class Ex01 {
	public static void main(String[] args) {
		   String a = "write once, run anywhere";
		   
		   // contains의 기능은 a라는 변수 문자열에 해당하는 값이 있는지를 찾는 기능이다.
		   if (a.contains("wife")) { // wife가 없음
	            System.out.println("wife");
	        } else if (a.contains("once") && !a.contains("run")) { // &&논리연사의경우 둘값이 true인경우 조건트루에 해당됨.
	            System.out.println("once");
	        } else if (!a.contains("everywhere")) {
	            System.out.println("everywhere");
	        } else if (a.contains("anywhere")) {
	        	System.out.println("anywhere");
	        } else {
	            System.out.println("none");
	        }
	}
}

// 문제 해석 조건문 ==> 조건문은 위에서부터 아래로 하나씩 조건을 비교하며 읽어낸다.
// if첫번째문장은 false -> else if 두번째문장도 false -> else if 세번째문장은 true이다 따라서 true값을 반환하고 반복문을 탈출한것이다.
// 반복문을 탈출하여 아래있는 조건문은 조건과 관계없이 종료되어 값을 출력하지 않는다.

