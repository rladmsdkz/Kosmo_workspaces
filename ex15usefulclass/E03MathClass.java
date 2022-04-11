package ex15usefulclass;
/*
Java의 규칙: java.lang 패키지는 자동으로 import 된다. 그래서 써도 안써도 OK
			모든 클래스 Object클래스를 직/간접적으로 상속한다. 
 */
import java.lang.*; 

/*
Math 클래스
	-java.lang 패키지에 정의된 클래스
	-수학과 관련된 일련의 작업들을 처리하는 메서드가 정의됨
	-메서드는 static으로 선언되어 있어 객체생성없이 클래스명으로 즉시 사용 가능. 
 */

public class E03MathClass extends Object {

	public static void main(String[] args) {
		
		System.out.println("원주율:"+ Math.PI);
		
		float f = -3.14f;
		double d = -100.9;
		int num = -10;
		
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs:"+ Math.abs(f));
		System.out.println("Math.abs:"+ Math.abs(d));
		System.out.println("Math.abs:"+ Math.abs(num));
		
		System.out.println("### 올림 ###");
		System.out.println("Math.ceil:"+ Math.ceil(3.4));//4
		System.out.println("Math.ceil:"+ Math.ceil(-3.4)); //-3
		System.out.println("Math.ceil:"+ Math.ceil(3.9));//4
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor:"+ Math.floor(3.4));//3
		System.out.println("Math.floor:"+ Math.floor(-3.4));//-4
		System.out.println("Math.floor:"+ Math.floor(3.9));//3
		
		System.out.println("### 반올림 ####");
		//round의 경우 소수첫번째 자리수로 올림/버림을 결정함 
		System.out.println("Math.round:"+ Math.round(3.49999));//버림처리: 3
		System.out.println("Math.round:"+ Math.round(3.54444));//올림처리: 4
		System.out.println("Math.round:"+ Math.round(-1.4));
		System.out.println("Math.round:"+ Math.round(-1.5));
		System.out.println("Math.round:"+ Math.round(-3.5));
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max:"+ Math.max(100, 99));//100
		System.out.println("Math.min:"+ Math.min(100, 99));//99
		
		System.out.println("### 난수 ###");
		/*
		0-1사이의 실수값을 반환. 
		 */
		System.out.println ((int)((Math.random()*45)+1));
		
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은? "+ Math.pow(2, 10));
	}

}
