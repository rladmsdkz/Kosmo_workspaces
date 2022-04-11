package exercies;
/*
시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
	프로그램을 작성하시오. 90점이상은 A학점...
	60점 미만은 F학점을 출력하면 된다. 
	=> if ~else if
 */

public class E01If03 {


	public static void main(String[] args) {
		
		int kor = 60;
		int eng = 80;
		int math = 90;
		
		int avg = (kor+eng+math) / 3;
		System.out.println("당신의 평균 점수는:"+avg);
		
		if (avg>=90) {
			System.out.println("당신의 학점은: A학점");
		}
		else if (avg>=80) {
			System.out.println("당신의 학점은: B학점");
		}
		else if (avg>=70) {
			System.out.println("당신의 학점은: C학점");
		}
		else if (avg>=60) {
			System.out.println("당신의 학점은: D학점");
		}
		else {
			System.out.println("당신의 학점은: F학점");
		}
		
		
		
		
		
		
		
	}

}
