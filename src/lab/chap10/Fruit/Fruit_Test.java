package lab.chap10.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) {

		/*
		     1. 자식객체를 생성 하면서 Fruit 타입으로 정의
			    Apple ("사과" , 30 , 5000) 
		     	Banana ("바나나 " , 44 , 6000)
		     	StrawBerry ( "딸기 , 55 , 7000 )
		     2. ArrayList에 객체 3개를 저장
		     3. For문으로 ArrayList의 객체를 끄집어내서 totalPrice() 호출시
		     4. 출력 : 000의 전체 가격은 000 입니다.
		     
		     자식 객체를 생성하면서 부모 타입으로 지정하면 , 배열이나 클래스에 동일한 타입으로 저장
		      
		*/
		
		// 1. 자식 객체를 생성하면서 부노 타입으로 지정함 -> 배열, 컬렉션 동일한 타입으로 저장
		
		/*
		 Fruit a = new Apple("사과, 30, 5000);       -> a : fruit, apple 타입이 들어있음
		 Fruit b = new Banana("바나나, 44, 6000);	    -> b : fruit,Banana 타입이 들어있음
		 Fruit s = new Strawberry("딸기, 55,75000);  -> c : fruit, Strawberry 타입이 들어있음
		
		 */
		
		Fruit f1 = new Apple ();
		
		f1.name = "사과";
		f1.cnt = 30;
		f1.price = 5000;
		
		Fruit f2 = new Banana ();
		
		f2.name = "바나나";
		f2.cnt = 44;
		f2.price = 6000;
		
		Fruit f3 = new Strawberry ();
		f3.name = "딸기" ;
		f3.cnt = 55;
		f3.price = 7000 ;
		
		f1.totalPrice();	
		f2.totalPrice();	
		f3.totalPrice();	
		
		Apple a1 = new Apple();  // -> apple타입이지만 자동으로 업캐스팅되어서 들어간다.
		
		
		//2. ArrayList<Fruit>
		
		List<Fruit> aList = new ArrayList<>();
		aList.add(f1);
		aList.add(f2);
		aList.add(f3);
		aList.add(a1);		//원래는 fruit타입만 들어갈 수 있지만  apple타입이 자동으로 fruit타입으로 업캐스팅되어서 들어감
		
		System.out.println("==================");
		
		// 3. aList의 각 방의 저장된 객체를 끄집어 내서 출력
		
		for ( int i = 0 ; i < aList.size() ; i++) {
			aList.get(i).totalPrice();
		}
		
		// ★★★★★ 상속을 통한 다형성
		// 다형성 : 상속, 부모의 메소드를 출력시 자식의 오버라이딩된 메소드를 출력
	
		// 자료형에서 자동으로 업캐스팅
		 
//		int aaa = 3.5 ;    //오류
		int aaa = (int) 3.5;  // 다운 캐스팅은 명시를 해줘야함
		double bbb = 30 ;	  // 오른족의 작은 자료형이 왼쪽의 큰자료형으로 자동으로 업캐스팅 되어서 오류가 발행안함 (먕시안해도 됨)
//		int ccc = 3 + 5.5;	->	= (대입연산자)는 우선순위가 가장 낮아서 3이 자동으로 업캐스팅되어서 3+5.5가 전체 double이 되어버려서 오류 발생
		int ccc = (int)(3 + 5.5); // int를 명시해서 다운캐스팅 해줘야한다.
		
		// 클래스이름 첫자는 반드시 대문자
		
		
		
	}

}
