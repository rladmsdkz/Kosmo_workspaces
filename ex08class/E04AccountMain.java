package ex08class;
/*
시나리오] 은행계좌를 추상화 해보자
	멤버변수: 예금주, 계좌번호, 잔고
	멤버메서드: 입금 (deposit()), 출금(withdraw()), 잔고출력(showAccount())
	조건1: 입금은 무제한으로 가능하다. 
	조건2: 잔고가 부족할 경우에는 출금 불능으로 처리한다. 
	초기화메서드: 멤버변수를 초기화 할 수 있는 메서드 정의 
 */

class Account {
	
	//멤버변수
	String name;
	//계좌번호의 경우 숫자로 구성되지만 연산의 대상이 아니므로 String으로 선언한다. 
	String accountNumber;
	//잔고의 경우 입출금을 위한 연산이 필요하므로int로 선언한다. 
	int balance;
	
	//멤버메소드
	//입금처리: 매개변수로 전달된 금액만큼 잔고에 더해준다. 
	void deposit (int money) {
		balance += money;
		System.out.println(money + "원이 입금된");
	}
	
	//촐금처리
	void withdraw (int money) {
		//촐금을 위해 잔고와 출금액을 비교하여 처리한다. 
		if (balance >= money) {
			//잔고가 충분한 경우에만 출금액을 차감한다. 
			balance -= money;
			System.out.println("계좌에서"+ money + "원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	
	void showAccount () {
		System.out.println("계좌주:"+ name);
		System.out.println("계좌번호:"+ accountNumber);
		System.out.println("잔고:"+ balance);
	}
	
	//초기화메서드: 멤버변수를 초기화하는 용도로 사용된다. 
	void init (String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain {

	public static void main(String[] args) {
		
		//첫번째 통장 개설
		Account account = new Account();
		account.init("장동건","111-21-8888" , 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount(); //잔고: 5000
		
		// 두번째 통장 개설
		Account account2 = new Account();
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
	}

}
