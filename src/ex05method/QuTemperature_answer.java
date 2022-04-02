package ex05method;
/*
 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 함수명은 본인이 결정하면 된다. 

 */
public class QuTemperature_answer {
	
	//섭씨->화씨
	//메서드명은 소문자로 시작. 
	static double celsiusToFahrenheit (double cel) {
		double fah = 1.8 * cel + 32;
		return fah;
	}
	
	//화씨->섭씨
	static double FahrenheitToCelsius(double fah) {
		return (fah - 32) / 1.8;
		
	}
	public static void main(String[] args) {
		//23 정수이지만 double cel로 들어갈때 자동으로 형 변환되어서 it's okay
		System.out.println("섭씨23도=>화씨:"+celsiusToFahrenheit(23));
		System.out.println("화씨98도=>섭씨:"+FahrenheitToCelsius(98.0));


	}

}
