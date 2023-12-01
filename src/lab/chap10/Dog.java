package lab.chap10;

public class Dog extends Animal  {	  //Animal 의 자식

	// 부모의 모든 필드와 메소드가 상속
	
	
	String dogName ;
	int dogLeg ;
	
	

	void dogInfo () {
		System.out.println("강아지의 이름은 " + "dogName" + "이고, 다리갯수는 " + dogLeg +"개 입니다.");
	}
	
	
	
	static void cry () {							
		System.out.println("개는 멍멍하고 짖습니다.");
	
	
}
	
	
}