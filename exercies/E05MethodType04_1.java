package exercies;

import java.util.Scanner;
/*
 메서드형식4] 매개변수도 있고 반환값도 있는 형식으로 
 	4가지 형식중 가장 많이 사용되는 형태의 메서드이다. 
 	
시나리오] 인원수를 매개변수로 전달받아 인원수 만큼 나이를
입력받아 그 나이의 합을 반환하는 메소드를 작성하시오. 
=> 메서드명: getTotalAge (int personCnt)
=> sumOfAge
=> personCnt
=> age
 */


public class E05MethodType04_1 {
	
	public static void main(String[] args) {
		
		System.out.println("총 인원수의 나이의 합은 " + getTotalAge(3)+ " 입니다");
		
	}
	
	static int getTotalAge (int personCnt) {
		
		Scanner scanner = new Scanner (System.in);
		int sumAge = 0;
		for (int i=1; i<= personCnt ; i++) {
			
			System.out.println(i + "번째 사람의 나이:");
			int age = scanner.nextInt();
			
			sumAge += age;
			
		}
		
		return sumAge;
		
		
	}

}
