package exercies;

public class E05TwoDimArray02 {

	public static void main(String[] args) {
		/*
		시나리오] 다음 절차에 따라 프로그램을 작성하시오. 
		1. 2차원 배열을 선언한다. 세로2, 가로 4
		2. 난수를 이용하여 배열을 초기화한다. (0~100사이)
		3. 배열전체요소를 매개변수로 전달된 정수만큼 증가시킨다.
		4. 증가되기 전, 후 배열을 출력한다. 
		5. 다음 메소드명으로 구현한다. twoDimPlus()
		 */
	
		//2행 4열인 2차원 배열을 생성
		int [][] twoArray = new int [2][4];
		
		for (int i=0 ; i<twoArray.length ; i++) {
			for (int j=0 ; j<twoArray[i].length ; j++) {
				
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		System.out.println("==========초기화후==========");
		showArray(twoArray);
		System.out.println("==========메소드 호출후==========");
		twoDimPlus(twoArray, 10);
		showArray(twoArray);
		
	}
	
	
	static void showArray(int [][] arr) {
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				
				System.out.printf("%d ", arr[i][j]);
				
			}
			System.out.println();
		}
			
	}
	
	
	
	static void twoDimPlus (int[][] arr, int plusNum) {
		
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				
				arr [i][j] += plusNum;
			}
		}
			
	}
}

