package exercies;

/*
 for문: while문과 같은 반복문으로 초깃값, 조건식, 증감식이 한줄에 있어
 	반복의 횟수를 명시적으로 알 수 있는 반복문이다. 
 	형식]
 		for(초깃값 ; 조건식 ; 증감식) {
 			실행문;
 		}
 	실행순서]
 		초깃값 -> 조건확인 > 참일때 실행 > 증감식
 			-> 조건확인 > 반복실행
 			-> 조건이 거짓일때 for문 탈출
 */

public class E05For {

	public static void main(String[] args) {
		
		/*
		시나리오] 1~100까지의 합을 구하는 프로그램을 for문을
			이용하여 작성하시오.
		 */
		
		int sum=0;
		for (int i=1 ; i<=100 ; i++) {
			
			sum += i;
		}
		System.out.println("1~100까지의 합:"+sum);
		System.out.println("======================");
		
		
		/*
		시나리오] for문을 이용하여 1~10까지의 정수 중 2의배수의 합을 
			구하는 프로그램을 작성하시오.
		 */
		
		int total=0;
		for (int j=1 ; j<=10 ; j++) {
			if (j%2==0) {
				total += j;
			}
		}System.out.println("1~10까지의 정수중 2의 배수의합:"+total);
		
		
		//방법2: if문 없이 2씩 증가하면서 누적합
		
		total=0;
		for (int j=0 ; j<=10 ; j+=2) {
				total += j;
		}System.out.println("1~10까지의 정수중 2의 배수의합(방법1):"+total);
		System.out.println("======================");
		
		
		/*
		 연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오. 
		 */
		
		for (int dan=2 ; dan<=9 ; dan++) {
			for (int su =1 ; su <= 9 ; su++) {
				System.out.printf("%-2d*%-2d=%-2d ", dan, su, (dan*su));
			}System.out.println();
		}
		System.out.println("====================");
		
		/*
		 연습문제1-2] 위 문제는 2단부터 9단까지 행으로 출력하는 형태이다. 
		 	이번에는 열로 출력하는 형태로 변경해보세요. 
		 */
		
		for (int su =1 ; su <= 9 ; su++) {
			for (int dan =2 ; dan <= 9 ; dan++) {
				System.out.printf("%-2d*%-2d=%-2d ", dan, su, (dan*su));
			}System.out.println();
		}
		
		/*
		연습문제2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0 
			1 0 0 0  
		해법: x와 y를 더해서 5가 될때 1을 출력한다. 
		 */
		
		
		for (int x=1 ; x<=4 ; x++) {
			for (int y=1 ; y<=4 ; y++) {
				if (x+y==5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}

}
