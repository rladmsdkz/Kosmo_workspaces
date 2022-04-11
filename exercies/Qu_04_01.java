package exercies;

import java.io.IOException;
import java.util.Scanner;

/*
 문제1. 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.
 System.in.read()를 사용하세요.
 
 // 삼항연산자로 구현 
형식] 자료형 변수 = (조건식) ? 참일때의값 : 거짓일때의 값;
=> 조건식에 따라 선택된 값이 좌측항의 변수에 할당되는 형태
*/
 

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("하나의 문자를 입력하세요.");
		int ascii = System.in.read();
		System.out.println("입력한 문자는:"+ ascii);
		
//		if(ascii >= '0' && ascii <'9') {
//			System.out.println("입력한 문자는 숫자입니다.");
//		}
//		else {
//			System.out.println("입력한 문자는 숫자가 아닙니다.");
//		}
		
		String result = (ascii >='0' && ascii <='9') ? "숫자입니다" : "숫자가 아닙니다.";
		System.out.println(ascii +"은(는)"+ result);
		
		
		
	}

}
