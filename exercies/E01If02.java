package exercies;

import java.util.Scanner;

/*
시나리오] 숫자를 홀/짝인지 먼저 판단한 후 100이상인지를 
판단하는 프로그램을 if~else문으로 작성하시오.
=> 홀짝을 판단하고 각 홀짝이 100이상인지 아닌지 판단 => if~else 문 안에 if~else문
*/

public class E01If02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("숫자를 입력해주세요:");
		int num = scanner.nextInt();
		
		if(num%2==0) {
			if(num>=100) {
				System.out.println("입력한 숫자는 짝수이고 100이상 입니다.");
			}
			else {
				System.out.println("입력한 숫자는 짝수이고 100이하 입니다.");
			}
			
		}
		else {
			if(num>=100) {
				System.out.println("입력한 숫자는 홀수이고 100이상 입니다.");
			}
			else {
				System.out.println("입력한 숫자는 홀수이고 100이하 입니다.");
			}
			
		}
	
	}
}
