package chap10.ex03;

public class Animal {			// 부모 클래스

	// 필드
	
    String name;			// 인스턴스 필드 ( 객체화해야지만 사용가능)
	int leg;				// 인스턴스 필드
	int age;				// 인스턴스 필드
	static String color;    // 정적필드 (객체화해도되고 안해도 된다. 안하면 클래스명으로 호출 됨)
	
	//  같은 패키지 안에 객체화를 안할거면 필드, 메소드 앞에 모두 public을 입력
	
	
	// 메소드
	
	// 메소드 [인스턴스 메소드] : static 없는 메소드 , -> 반드시 객체화 (인스턴스화)해야지만 호출됨, 오버라이딩 가능
	
	 void cry () {							
		System.out.println("모든 동물은 웁니다.");
	}
	// 메소드 [정적메소드] :  static있는 메소드 , 객체화해서 호출해도 되고, 객체화하지 않고 클래스명으로 호출
	static void aniColor (){								
		System.out.println("의 색깔은 " + color + "입니다.");	
	}
	
	static void eat () {
    	System.out.println("모든 동물은 밥을 먹습니다.");
	}
    	
	void aniLeg () {
		System.out.println(name + "의 다리개수는 " + leg + "개 입니다.");
	}
	
}
