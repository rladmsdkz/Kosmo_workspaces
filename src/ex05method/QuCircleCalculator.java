package ex05method;

import java.util.Scanner;
// E05MethodType04_2참고
/*
 문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름 (circleArea)
-둘레공식 : 2 * 3.14 * 반지름 (circleRound)

 */

public class QuCircleCalculator {

	public static void main(String[] args) {
		
		
		System.out.println("원의 넓이(5.5):"+ circleArea(5.5));
		System.out.println("원의 둘레 (5.5):"+ circleRound(5.5));

	}
	
	public static double circleArea(double radius) {
		
		final double PI = 3.14;
		double circleArea = PI * radius * radius;
		return circleArea;
		
	}
	
	public static double circleRound (double radius) {
		
		final double PI = 3.14;
		double circleRound = 2 * PI * radius;
		return circleRound;
		
	}

}
