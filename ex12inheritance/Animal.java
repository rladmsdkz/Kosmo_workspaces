package ex12inheritance;
/*
연습문제] Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.
 */
public class Animal {
	private String species;
	int age;
	String  gender;
	
	
	public Animal (String _species, int _age, String _gender) { //대부분 이름을 똑같이하고 this 를 사용함. 
		species = _species;
		age = _age;
		gender = _gender;
		
	}
	
	public void showAnimal() {
		
		System.out.println("동물의 종류는:" + species  + " 입니다.");
		System.out.println("동물의 나이는:"+ age+ " 입니다.");
		System.out.println("동물의 성별은:"+ gender+ " 입니다.");
		
	} 
	
	public String getSpecies () {
		return species;
	}

}
