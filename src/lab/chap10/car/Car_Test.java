package lab.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {

	public static void main(String[] args) {

		//
		
		
		// 자식객체를 생성하면서 부모타입으로 지정 후 부모의 메소드 호출시 overriding 된 자식의 메소드가 작동
		// 부모의 car.run()이 다양한 형태로 작동 -> 다형성
		// 
	
		Car c1 = new H_Car ();
		Car c2 = new K_Car ();
		Car c3 = new S_Car ();
		
		
		// 부모의 run()를 호출시 자식의 Overriding 된 메소드 작동됨
		c1.run();
		c2.run();
		c3.run();
		
		// ArrayList<Car> -> 배열에 한 번에 집어넣을 수 있다.
		// 선언
		List<Car> aList = new ArrayList<>();
		
		// 3개 넣음 
		aList.add(c1);
		aList.add(c2);
		aList.add(c3);
		
		System.out.println("=========================");
		// for문을 사용해서 끄집어 내서 출력
		for (int i = 0 ; i < aList.size() ; i++) {
			
			aList.get(i).run();			//  car 객체를 끄집어냄 -> get 안의 i , run메소드자체에 println이 이미 들어있음 호출
										// aList.get(i)까지가 car 객체
			//                            0번방에 c1 1번방에 c2 2번방에 c3
		}
		
		
	}

}
