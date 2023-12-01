package lab.chap10.Fruit;

public class Fruit {		//부모클래스

	String name;		// 과일이름
	int cnt	;			// 과일 갯수
	int price;			// 과일의 가격
	
	// 메소드
	void totalPrice () {
		System.out.println("모든 과일의 합계는 :" + (cnt * price));
	}
	
}