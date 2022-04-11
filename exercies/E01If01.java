package exercies;

import java.io.IOException;

/*
시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 //ascii >='0' <='9' , ascii>=48 <=57

	if문을 이용해서 작성하시오. //(if~else)
	
	참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를
		정수형으로 반환하는 메서드. 두글자 이상 입력하더라도 첫번째
		문자만 입력된다. 
 */


public class E01If01 {

	public static void main(String[] args) throws IOException {
		
	System.out.println("하나의 문자를 입력해주세요:");	
	int ascii = System.in.read();
	System.out.print("입력한 문자는:"+ ascii);
	
	
	if (ascii >= '0' && ascii <='9') {
		System.out.println("입력한 문자는 숫자입니다.");
	}
	else {
		System.out.println("");
	}
	
		
	}

}
