package ex12inheritance;
/*
문제1) 파일명 :  QuConstructorAndSuper.java
상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자. 그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
실행결과]
남은가솔린:10
남은전기량:20
남은워터량:30
 */
class Car {
    int gasoline;
    
    public Car (int gasoline) { //생성자는 퍼블릭 
    	this.gasoline = gasoline;
    }
    
}

class HybridCar extends Car {
    int electric;
    
    public HybridCar (int gasoline, int electric) {//생성자는 퍼블랙 
    	//부모클래스로 gasoline 전달
    	super(gasoline);
    	//해당클래스의 멤버변수 초기화 
    	this.electric = electric;
    }
    
}


class HybridWaterCar extends HybridCar {
    int water;
    //객체 생성문장을 통해 3개의 매개변수를 가진 생성자 메서드 정의 
    public HybridWaterCar (int gasoline, int electric, int water) { //생성자는 대부분 public 사용
    	//2개의 매개변수는 부모생성자로 전달한다. 
    	super(gasoline, electric);
    	//water(물)은 해당 클래스의 멤버변수를 초기화한다. 
    	this.water = water;
    }
 
    public void showNowGauge() {
        System.out.println("남은가솔린:"+gasoline);
        System.out.println("남은전기량:"+electric);
        System.out.println("남은워터량:"+water);
    }
}
/*
클래스가 상속구조를 가지고 있더라도, 클래스 개별적으로 객체를
생성하고 멤버변수를 초기화 할수 있는 구조로 생성해야 한다. 
 */

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}

}
