package exercies; 

/*
시나리오] 해당 문자열이 이메일 형식인지 검사하는
프로그램을 작성하시오
hong@ikosmo.co.kr = 이메일형식임
not@naver => 이메일형식이아님
 */

public class E02StringMethod {

	public static void main(String[] args) {
		
		String email = "hong@ikosmo.co.kr";
		
		if (email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식임");
		}
		else {
			System.out.println("이메일 형식이 아님");
		}
	}

}
