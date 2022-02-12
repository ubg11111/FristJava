package Exam;

public class SalaryMan {
	
	int salary = 1000000;
	int bonus = 50;
	
	public SalaryMan() {}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		
		int yearmoney = (salary * bonus);
		
		return yearmoney;
	}
	
	
	public static void main(String[] args) {
		
		SalaryMan salaryMan = new SalaryMan();
		
		System.out.printf("1번째 샐러리맨의 급여는 %,d입니다.%n",salaryMan.getAnnualGross());
		
		SalaryMan salaryMan2 = new SalaryMan(2_000_000);
		
		System.out.printf("2번째 샐러리맨의 급여는 %,d입니다.%n",salaryMan2.getAnnualGross());
		
	}
}
