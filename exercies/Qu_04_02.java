package exercies;

import java.io.IOException;
import java.util.Scanner;

/*
 다음 예제는 두개의 if문을 사용하고 있다. 이를 하나의 if문으로 변경해보자. 
 */

/*2개의 if문으로 구현
if (num > 0) {
		if ((num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		}
	 }
*/

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		
	Scanner scanner = new Scanner (System.in);
	System.out.println("숫자를 입력하세요");
	int num = System.in.read();
	
	if (num>0 && num%2 == 0) {
		System.out.println("양수이면서 짝수");
	}
	
	
	}
}
