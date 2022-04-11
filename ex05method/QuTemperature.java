package ex05method;

import java.util.Scanner;

/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 함수명은 본인이 결정하면 된다. 
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

 */

public class QuTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("섭씨를 입력해주세요.");
		double a = scanner.nextDouble();
		System.out.println("화씨를 입력해주세요.");
		double b = scanner.nextDouble();
	
		System.out.printf("섭씨를 화씨로 변환: %.2f%n", CelToFah(a));
		System.out.printf("화씨를 섭씨로 변환: %.2f%n", FahToCel(b));
	}
	
	public static double CelToFah (double tempCel) {
		
		
		double CelToFah = (1.8 * tempCel) + 32;
		return CelToFah;
	}
	
	public static double FahToCel (double tempFah) {
		
		double FahToCel = (tempFah -32) / 1.8;
		return FahToCel;		
	}

}
