package exercies;

import java.util.Scanner;

public class E03MethodType02_2 {
	/*
	 시나리오] 사용자로부터 국,영,수 점수를 입력받아 평균을
	 구한 후 학점을 반환하는 메소드를 정의하시오. getHakjum
	 */
	
	static String getHakjum() {
		
		String hakjum = " "; 
		
		int kor = 85, eng = 93, math =75;
		int avg = (kor + eng + math) / 3;
		int avg_result = (int) avg / 10;
		System.out.println(avg);
		
		switch (avg_result) {
		
		case 10: case 9:
			hakjum = "A학점";  break;
		case 8:
			hakjum = "B학점"; break;
		case 7:
			hakjum = "C학점"; break;
		case 6:
			hakjum = "D학점"; break;
		default:
			hakjum = "F학점"; break;
		
		}
		
		return hakjum;
		
		
		
	}
	
	public static void main(String[] args) {
		
		String setHakjum = getHakjum();
		System.out.println("너의학점은:"+ getHakjum() +"이야");
		System.out.println("당신의 학점은:"+ setHakjum);
		
	}

}
