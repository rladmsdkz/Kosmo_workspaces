package ex06array;
/*
문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

 */


/* 은아가 이해하기 위해 은아가 쓴거 
 	counter 배열은 일단 바로 초기화를 안하고 주소만 넣었기에 counter [0]의 현재값은 0임 그래서 0+1 
	for (int i=0; i < answer.length; i++) {
			if(answer[i]==1) {
			counter[0]=counter[0]+1; 
			} 
			0+1
			1+1
			2+1
			
	for (int i=0; i < answer.length; i++) {
			if(answer[i]==2) {
			counter[1]=counter[1]+1; 
			}  
			0+1
			1+1
 */
public class QuNumberCounter {

	public static void main(String[] args) {
		//원소값으로 크기가 자동으로 결정됨.
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		//배열선언시 크기가 지정되었으므로 전체 원소가 0으로 초기화된다. 
		int[] counter = new int[4]; //크기가 지정되서 값이 0으로 지정됨. 
		
		/*
		특정 인덱스의 원소를 단순히 1증가시키는 연산이므로 
		아래 3가지 방법 모두 가능하다. 
		 */
		for (int i=0; i < answer.length; i++) {
			if(answer[i]==1) counter[0]++; //증가연산자 사용. 첫원소에 0 이 들어가있어서
			// 								++ 하면 다음으로 넘어감. null값이 들어가있으면 증가연산자 못씀. 
			if(answer[i]==2) counter[1]+=1; // 복합대입연산자 사용. = counter[1]+=1;
			if(answer[i]==3) counter[2]=counter[2]+1; //산술연산자 사용. counter[2]+1;
			if(answer[i]==4) counter[3]++;
		}
		
		//counter배열을 출력한다. 
		for(int i=0 ; i<counter.length ; i++) {
			/*
			printf를 통해 출력문을 생성할대는 항상 완성된 출력문을 먼저 작성한 후 
			서식문자와 변수를 이용해서 하나씩 수정해 나가서 완성한다. 
			 */
			//System.out.printf("counter[0] 1의갯수 => 3");
			System.out.printf("counter[%d] %d의갯수 => %d%n", i, i+1,counter[i]);
			
		}
	}
        
}
