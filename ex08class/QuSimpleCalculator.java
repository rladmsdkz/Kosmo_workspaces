package ex08class;
 
import java.util.Scanner;

/*
 기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

 */
//반환타입 있을지 없을지 어떻게 확인? => 프린트 함수 안에 있거나 우측에 있음. 

class CalculatorEx {
	
	
	//사칙연산의 횟수를 카운트할 변수 및 초기화
	int addCnt, minCnt, mulCnt, divCnt;
	 
	public void init() {
		addCnt = 0;
		minCnt = 0;
		mulCnt = 0;
		divCnt = 0;
	}
	
	// 연산 후 변수에 저장. 
	// 정수보다는 실수가 큰 자료형이므로 double로 선언하였다. 이 경우 정수, 실수 두가지의 인수를 모두 받을 수 있다. 
	double add (double num1, double num2) {
		addCnt ++; // 덧셈 연산시 카운트 증가
		double result = num1 + num2; //연산을 수행
		return result; //결과를 반환
	
	 }
	 // 연산의 결과를 즉시 반환
	 double min (double num1, double num2) {
		minCnt++;
		return num1 + num2;
	 }
	 
	 double div (double num1, double num2) {
		divCnt ++;
		return  num1/num2;
	 }
	 
	 double mul (double num1, double num2) {
		mulCnt++;
		return num1*num2;
	 }
	 
	 
	 //연산의 횟수 출력
	 void showOpCount () {
		 
		 System.out.println("덧셈횟수:" + addCnt); 
		 System.out.println("뺄셈횟수:" + minCnt);
		 System.out.println("곱셈횟수:" + mulCnt);
		 System.out.println("나눗셈횟수" + divCnt);
		 
	 } 
	 
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}

}
