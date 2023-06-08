package section11;

import section11.access1.Car;
import section11.access1.Bus;

/*
 * 다형성(Polymorphism)
 * 	같은 인터페이스 또는 부모를 공유하는 객체가 여러 유형의 타입을 가질 수 있는것
 * 
 */
public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive();
		bus.bell();
		
		Car car = new Bus();
		car.drive();
//		car.bell();
		
		Bus bus2 = (Bus) car;
		bus2.drive();
		bus2.bell();
		
		
	}

}





