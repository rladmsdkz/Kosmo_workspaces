package exercies;
/*
문제2] 파일명 : Qu02Average.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.

실행결과]
평균점수(실수형)=91.66666666666667
평균점수(정수형)=91
 */
public class Qu02Average {

	public static void main(String[] args) {
		
		int kor = 99;
		int eng = 80;
		int math = 96;
		double avgdouble = (kor+eng+math) / 3;
		int avgint  = (kor+eng+math) / 3;
		
		System.out.println("평균점수(실수형)="+ avgdouble);
		System.out.println("평균점수(정수형)="+avgint);

	}

}
