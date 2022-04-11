package exercies;

//시나리오] 로또 번호 생성하기 

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {
		
		System.out.println("크기가 6인 배열에 난수 입력");
		int [] lottoNum = new int [6];
		
		for(int i=0 ; i<lottoNum.length ; i++) {
			
			lottoNum[i] = (int)((Math.random()*100) % 45) + 1;
			
			System.out.printf("%d ", lottoNum[i]);
		}
		
	}
}
