package Exam;


class Student1{
	
	// private으로 설정하여 get , set 설정
	// private은 클래스내에서만 접근이 가능하다.
	private String major;
	private int hakbun;
	
	public Student1() {} // 기본 생성자 생성
	
	
	public void setMajor(String major) {
		this.major = major;
	}


	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}


	public String getMajor() {
		return major;
	}


	public int getHakbun() {
		return hakbun;
	}
}



public class Exam6_7 {

	public static void main(String[] args) {
		
		
		Student1 st = new Student1();
		
		st.setHakbun(12);
		st.setMajor("관광과");
		
		System.out.println("저의 학번은 " + st.getHakbun() + " 번 입니다.");
		System.out.println("저의 전공은 " + st.getMajor() + " 입니다.");
		
	}
}
