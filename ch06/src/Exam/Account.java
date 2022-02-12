package Exam;

import java.util.Scanner;

public class Account {
	
	private String owner;
	private long balance;
	
	public Account() {} // 기본 생성자
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long dposit(long amount) {
		// 인자인 금액을 저축하는 기능
		
		System.out.println(amount + "만큼 입금 합니다.");
		return this.balance += amount; // 저장
	}
	
	public long withdraw(long amount) {
		// 입력한 금액만큼 인출하는 기능
		
		Scanner sc = new Scanner(System.in);
		
		long money = amount; // 새로운 머니 변수 선언
		
		System.out.println("현재 고객님은" + this.balance + "원 까지 인출 할 수 있습니다.");
		
		if(this.balance < amount) { // 현재 값이 입력값보다 적다면
			System.out.println("잔액이 부족하여 인출 할 수 없습니다.");
			System.out.println("가진 금액을 모두 출금 하시겠습니까?");
			String se[] = {"y","n"};
			String sel = sc.next();
			
			if(sel.equalsIgnoreCase(se[0])) {
				money = this.balance; // 현재 돈을 money값에 대입 
			}
		}
		System.out.println(money + "만큼 인출합니다.");
		return this.balance -= money; //money 값
	}
	void show() {
		System.out.println(this.owner + "님은 현재 " + this.balance + "원을 가지고 있습니다.");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.println("사용자 섬항을 입력하세요.");
		String owner = sc.next();
		account.setOwner(owner);
		
		System.out.println("사용자의 잔액이 얼마나 있는지 적으세요.");
		int balance = sc.nextInt(); 
		account.setBalance(balance);
		account.show();
		
		System.out.println("얼마를 인출 하시겠습니까?");
		int amo = sc.nextInt();
		account.withdraw(amo);
		account.show();
		
	}
}
