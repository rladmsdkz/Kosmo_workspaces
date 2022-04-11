package bokang;

public class R02while {

	public static void main(String[] args) {
		
		
		/*
		while문: 반복의 횟수가 명확하지 않을때 주로 사용하는 반복문.
			ex) 중복되지 않는 난수 10개를 생성하세요. 
				사용자가 종료할때까지 실행하세요.
			형식]
				반복을 위한 변수;
				while(반복을 위한 조건){
					실행문;
					탈출을 위한 증감식;
				}
				※반복을 위한 조건이 true일때 반복실행한다. 
					거짓이 되면 반복문을 탈출한다.
		 */
		//시나리오] 1~10까지의 합을 구하는 while문을 작성하세요.
		int a = 1;
		int sum=0;
		while (a<=10) {
			//a가 지속적으로 증가하여 11이되는 순간 while문을 탈출한다.
			sum += a;
			a++;
		} 
		System.out.println("수열의합은:"+ sum);
		System.out.println("============================");
		
		/*
		연습문제] 구구단을 이중 while문으로 구현하시오. 
			행: 2~9단까지 반복
			열: 1~9까지 반족
		 */
		int dan = 2; //2단부터 시작
		while (dan<=9) { //9단까지 반복
			int su = 1; //수는 1부터 시작 
			while (su<=9) {//9까지 반복
				System.out.printf("%d*%d=%d", dan, su, (dan*su));
				System.out.print(" ");
				su++;
			}
			//하나의 단을 출력한 후 줄바꿈 처리
			System.out.println(" ");
			dan++;
		}
		
		System.out.println("===============================");
		System.out.println("##### 세로방향으로 출력 #####");
		
		int su1 = 1;
		while (su1<=9) {
			int dan1 = 2;
			while (dan1<=9) {
				System.out.printf("%d*%d=%d", su1, dan1, (dan1*su1));
				System.out.print(" ");
				dan1++;
			}
			System.out.println(" ");
			su1++;
		}
		
		
		System.out.println("==============================");
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
			모두 출력하는 프로그램을 while문으로 잓겅하시오. 
			실행결과]
				1+5=6
				2+4=6
				...
				5+1=6
		 */
		
		int num1 = 1;//주사위 1번의 1~6까지 숫자 표현
		while (num1<=6) {
			int num2 = 1;//주사위 2번의 반복
			while (num2<=6) {
				//주사위1,2의 숫자를 더해서 6이 나올때만 출력한다. 
				if(num1+num2==6) {
					System.out.printf("%d+%d=%d%n", num1, num2, (num1+num2));
				} 
				num2++;
			}num1++;
		}
		
		System.out.println("=====================================");
		/*
		연습문제] 방정식 2x+4y = 12 를 만족하는 x,y 값을 구하시오
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해 구현하시오. 
		실행결과]
			x=0, y=3
			x=2, y=2
			.....
		 */
		int x = 0;
		while (x<=10) {
			
			int y = 0;
			while (y<=10) {
				
					if(((2*x)+(4*y))==12) {
				
					System.out.printf("x=%d, y=%d\n", x, y);
					}
					
					y++;
			}
			x++;
		}
		
	}
}