package ex05method;

import java.util.Scanner;
// 예제] E01MethodBasic 활용함.  
/*
 문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타(인자)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
메소드명 : arithmetic()
 */

public class QuSimpleOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요.");
		int a = scanner.nextInt();
		System.out.println("두번째 정수를 입력해주세요.");
		int b = scanner.nextInt();

		arithmetic(a,b);
		
	}

	public static void arithmetic(int num1, int num2) {
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int multiply = (num1*num2);
		int div = (num1/num2);
		int remain = (num1%num2);
		
		System.out.println("덧셈결과 ->"+ sum);
		System.out.println("뺄셈결과 ->"+ minus);
		System.out.println("곱셈결과 ->"+ multiply);
		System.out.println("나눗셈 몫 ->"+ div);
		System.out.println("나눗셈 나머지 ->"+ remain);
		
	}
	
}
