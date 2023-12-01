package lab.chap10.Fruit;

public class Apple extends Fruit {

	// 부모의 필드가 상속됨
	Apple(){}  // -> 기본생성자를 명시해줘야 오류가 안남
	Apple ( String name, int cnt, int price){
//  super(); 가 생략 (자식의 기본생성자는 부모의 기본 생성자를 호출)		
	
	super.name = name;	//부모에 있는 네임 필드
	super.cnt = cnt;
	super.price = price;
	}
	
	@Override
	void totalPrice() {			// 코드작성 : cnt + price
		// 출력 : " 000의 전체 가격은 : 000 입니다.
     System.out.println( name + "의 전체 가격은 " + (cnt * price)+ "입니다.");

	}
	
	
	
	
}
