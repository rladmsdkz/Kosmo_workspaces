package exercies;

import java.util.Scanner;

/*
메서드 형태3] 매개변수는 있으나 반환값이 없는 경우 => yesParamNoReturn (s,e)
	: 값을 전달받은 후 연산하고 해당 결과를 반환하지 않고 
	즉시 출력하는 경우에 주로 사용 
*/
/*
시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는 => startNum , endNum
수를 모두 더하여 출력하는 프로그램을 작성하시오. 
	출력결과]
		시작값: 5
		종료값: 9 
		결과: 5+6+7+8+9 = ???
*/


public class E04MethodType03_1 {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("시작값을 입력하세요:");
		int s = scanner.nextInt();
		System.out.println("종료값을 입력하세요:");
		int e = scanner.nextInt();
		
		yesParamNoReturn(s, e);
		
	}
	
	static void yesParamNoReturn (int startNum, int endNum) {
		
		int sum = 0;
		for (int i = startNum; i<= endNum ; i++ ) {
			sum += i;
			
		}
		System.out.println("결과:"+ sum);
		
	}
	
	

}
