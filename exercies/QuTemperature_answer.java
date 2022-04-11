package exercies;

import java.util.Scanner;

/*
 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 
섭씨로 변환하여 리턴하는 함수를 만들어라. 함수명은 본인이 결정하면 된다. 
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
 */
public class QuTemperature_answer {
	
	//섭씨를 화씨로 
	static double celToFah (double cel) {
		
		return (cel -32) / 1.8;
		
	}
	
	//화씨를 섭씨로 
	static double fahToCel (double fah) {
		
		return (1.8 * fah) + 32;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("섭씨를 입력하세요:");
		double cel = scanner.nextDouble();
		System.out.println("섭씨 => 화씨:"+ celToFah(cel));
		
		System.out.print("화씨를 입력하세요:");
		double fah = scanner.nextDouble();
		System.out.println("화씨 => 섭씨:" + fahToCel(fah));
		
		


	}

}
