package ex08class;

import java.util.Scanner;

/*
 기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

 */


class CalculatorEx {
	
	// 멤버변수
	double add, min, mul, div;
	 

	double add (double a, double b) {
		
		add = add + 1; 
		return add = a + b;
	 }
	 
	 double min (double a, double b) {
		min = min + 1;
		return min = a - b; 
	 }
	 
	 double div (double a, double b) {
		div = div + 1;
		return  div = a / b;
	 }
	 
	 double mul (double a, double b) {
		mul = mul + 1;
		return mul = a * b;
	 }
	 
	 //초기화 메서드 (계산의 결과를 카운트하는 멤버변수를 0으로 초기화)
	 void init () {
		 
		 add = 0;
		 min = 0;
		 mul = 0;
		 div = 0;
	 }
	 
	 
	 //몇번 수행했는지 출력하는 메서드
	 void showOpCount () {
		 
		 System.out.println("덧셈횟수:" + add); 
		 System.out.println("뺄셈횟수:" + min);
		 System.out.println("곱셈횟수:" + mul);
		 System.out.println("나눗셈횟수" + div);
		 
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
