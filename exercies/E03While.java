package exercies;
/*
 while문
 	: 반복의 횟수가 정해져 있지 않을 때 주로 사용하는 반복문이다. 
 	반복의 횟수가 명확 하다면 for문을 사용하는것이 편리하다. 
 	형식]
 		반복을 위한 변수의 초깃값;
 		while(조건) {
 			실행문장;
 			증가식; <= 반복문 탈출을 위한 문장
 		}
 	반복의 조건이 false일때 while문을 탈출한다. 
 	또한 반복문의 처음으로 돌아가면 조건을 다시 검사한다.
 */

public class E03While {

	public static void main(String[] args) {
		
		/*
		 시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로 
		 	작성하시오.
		 */
		
		int i = 1;
		int total =0;
		while (i<10) {
			total += i;
			i++;
		}
		System.out.println("1~10까지의 합: "+total);
		
		/*
		시나리오] 1~100까지의 정수중 3의 배수이거나 4의 배수인
		정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		 */
		
		int j =1;
		int sum = 0;
		while (j<100) {
			if(j%3==0 || j%4==0) {
				sum += j;
			}
			j++;
		}
		System.out.println("1~100까지의 정수 중 3 OR 4의 배수인 정수의 합: "+ sum);
		
		
		
		/*
		시나리오] 구구단을 출력하는 프로그램을 
		while문으로 작성하시오. => 단*수, 2단~9단
		 */
		
		int dan = 2;
		while (dan<=9) {
			
			int su = 1;
			while (su<=9) {
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				su++;
			}System.out.println();
			
			dan++;
		}System.out.println();
		
		
		
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오. 
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		
		
		int x = 1;
		while (x<=4) {
			
			int y = 1;
			while (y<=4) {
				if (x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}System.out.println();
			
			x++;
		}
		
		
	}

}