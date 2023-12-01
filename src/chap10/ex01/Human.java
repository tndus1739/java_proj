package chap10.ex01;

public class Human {			// 사람 : 부모 ( super class)
	
	// 기본 생성자가 생략됨
	
	Human (){
		super();		//  Object클래스가 호출되었다. (모든 자바의 class는 Java.lang.Object를 상속받는다.) super가 생략되어있다.
	}
	
	Human ( String name , int age){
//		super();										// super();	 생략
		this.name = name ; 								// "김똘똘"이 여기로 들어옴
		this.age = age;
	}
	
	// 필드 2개
	
	String name ;
	int age ;

	// 메소드
	
	void eat () {
		System.out.println("모든 사람은 먹는다.");
	}
	
	void sleep () {
		System.out.println("모든 사람은 잠을 잔다.");
	}
}
