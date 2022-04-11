package exercies;

import java.util.Scanner;
/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타(인수)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 
이를 호출하는 main 메소드를 정의하라.

메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름 circleArea
-둘레공식 : 2 * 3.14 * 반지름 circleRound
=> 반지름: rad 
 */

public class QuCircleCalculator_answer {
	
	
	static double circleArea(double r) {
		final double PI = 3.14;
		return (PI * r * r);
	}
	
	static double circleRound(double r) {
		final double PI = 3.14;
		return (2 * PI * r);
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("반지름을 입력해주세요:");
		double r = scanner.nextDouble();
		
		System.out.println("원의 넓이는:"+ circleArea(r));
		System.out.println("원의 둘레는:"+ circleRound(r));
	
	}

}
