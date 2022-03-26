package ex02variable;
/*
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14
 */

public class Qu03CircleArea {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		int radian = 10;
		int area_int;
		double area_double;
		
		area_double = radian * radian * PI;
		area_int = (int) (radian * radian * PI);
		
		
		System.out.println("int형 넓이:"+area_int);
		System.out.println("double형 넓이:"+area_double);

	}

}
