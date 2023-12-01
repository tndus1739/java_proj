package lab.chap10.car;

public class Car {			//부모 클래스

	// 필드
	
	String name;
	int speed; 
	
	// 메소드 [인스턴스 메소드] : 인스턴스 메소드만 Overriding 됨
	
	void run () {   // 자식에서 overridng 
	System.out.println("모든 자동차는 달립니다.");
	
	}
	
}
