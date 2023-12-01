package chap10.ex01;

import java.util.concurrent.ForkJoinWorkerThread;

public class Inheritance01 {

	public static void main(String[] args) {
		/*
			상속 (Inheritance) : OOP의 특징
				- 자바는 하나의 부모클래스와 상속할 수 있다. 다중 상속을 지원하지 않는다.
				- 중복을 방지할 수 있다.
				- OOP의 꽃 
				- 부모 클래스의 필드, 메소드, 이너클래스가 그대로 자식클래스에게 상속된다. -> 생성자는 상속되지 않는다.
				- 자식클래스를 생성하면 자식 클래스 생성자 내부에 super()가 생략되어있다.
			      super() -> 부모클래스에 생성자를 호출
			    - 자식 클래스를 생성하면 부모클래스가 먼저 만들어지고 자식 클래스가 생성
			    - 자식클래스명 extends 부모클래스명 -> 상속관계 설정하는 법

				*/
	
		// 1. Student 객체 생성
		Student    s1   = new Student();
//      타입(껍데기)		
		
		
		// 부모클래스에서 정의한 필드와 메소드
		
		s1.name = "홍길동";
		s1.age  = 30;
		s1.eat();			// 모든 사람은 먹는다.
		s1.sleep();			// 모든 사람은 잠을 잔다.
		
		// Student 클래스와 필드와 메소드
		
		s1.studentID = 1111;
		s1.goToSchool();		// 모든 학생을 학교를 갑니다.
		s1.StuInfo();
		
		// 2. Professor
		
		Professor p1 = new Professor();
		
		// 부모의 필드와 메솓,
		p1.name = "김교수님";
		p1.age = 50;
		
		p1.eat();
		p1.sleep();
		
		// 자식의 필드와 메소드
		
		p1.professorId = 2222;
		p1.teach();
		
		
		// 3. Worker
	
	    Worker w1 = new  Worker();
	    // 부모
	    w1.name = "홍길순";
	    w1.age = 22;
	    
	    w1.eat();
	    w1.sleep();
	    
	    //자식
	    w1.workerId = 2546;
	    w1.goToWork();
	
	    System.out.println("=======super vs super()=============");
	
	    // this 키워드     : 자기 자신의 객체, this.필드  this.메소드
	    // this () 메소드  : 셍성자 실행 블락에서 사용됨. 반드시 첫 라인에 와야함
	    				 // 다른 생성자를 호출
	
	    // super 키워드 :  부모의 필드 메소드 호출, super.필드명  super.메소드명
	    // super() 메소드 : 생성자 실행 블락에서만 사용됨 . 반드시 첫라인에 와야함
	    				// 부모 클래스의 생성자를 호출할 때 사용
	    				// 자식클래스 생성자 내부에는 실행블락 첫라인에 super ()가 생략되어 있다.
	    				// 자식클래스를 생성하면 super()에 의해서 부모클래스가 먼저 만들어진다.
	
	
	
	    Student s2 = new Student();			// student에 기본생성자 호출
	    
	    // Student 클래스의 input이 1개인 생성자 호출
	    
	    System.out.println("===============================");
	    Student s3 = new Student(9999);  // 9999 -> studentId
	    
	    // 1. Student(9999) 생성자 호출   
	    // 2. Human의 super("김똘똘, 20); 호출함 ( 호출만 함)
	    // 3. Object가 생성 -> Human 생성 -> Student 생성	
	    
	    System.out.println(s3.name);
	    System.out.println(s3.age);
	    System.out.println(s3.stuName);
	    
	    System.out.println("===============================");

	    // Type Casting :
		/*
			UpCasting : 자동 적용될 수 있다. 자식 타입 -> 부모타입
				부모의 필드와 메소드만 사용가능
				
			DownCsting : 부모 -> 자식  , 명시가 필요
				부모, 자식의 필드와 메소드를 모두 사용가능
		
		
		*/
	    
	    // 자식 객체를 생성해서 부모 타입으로 지정함. : 부모의 필드와 메소드만 사용가능
	    // 호출 : 1. Child 생성자 호출 -> 2. professor 호출 -> Human 호출 -> 4. object 호출
	    // 생성 : 5. Human 객체생성 -> 6. professor 객체생성 -> Child 객체생성
	    // Type : Human -> Human의 필드와 메소드만 사용가능함
	    
	    
	    
	    Human ch01 = new Child();		// ch01 객체는 Human, professor, child를 내포
	    
	    // Human의 필드와 메소드만 사용가능
	    ch01.name = "홍길동";
	    ch01.eat(); 
	    
	    // 다운 캐스팅
	    Professor pp1 = (Professor) ch01;  // 다운캐스팅하면 professor, human의 필드와 메소드를 사용가능
	    
	    //Human의 메소드
	    pp1.age = 10;
	    
	    //professor
	    pp1.professorId = 30;
	    
	    // 다운캐스팅 :Child : Human, Professor , Child의 필드와 메소드 사용가능
	    Child ch05 = ( Child) pp1 ;
	    
	    //Human
	    ch05.name = "이순신";
	    //professor
	    ch05.professorId = 333;
	    //Child
	    ch05.chirdName = "아기";
	    
	    // 업캐스팅  : 명시를하지 않더라도 자동으로 작동됨
	    // h01 -> Human, professor, child를 모두 내포하고 있는데 Human 타입
	    
	    Human h01 = ch05;
	 
	    // Human 클래스를 객체화해서 Human 타입 : uman 클래스를 객체화해서 Human 타입으로 뒀기 때문에 human의 내용만 가짐 
	    // hh01 : Human
	    
	    Human hh01 = new Human();
	    
	    //Human
	    hh01.age = 40 ;
	    
//	    Professor  pp02 = (Professor)  hh01 ;    //  실행시 오류 (ClassCastException 오류)
//      타입이 없는데 캐스팅하면 오류
	    
	    // Professor 를 객체화해서 Human 타입으로 지정
	    // ppp01 : Human, professor은 내포하고 있지만 child는 내포하고 있지 않음
	    Human ppp01 = new Professor();
	    
	    //Human
	    ppp01.name = "김길동";
	    
	    // 다운캐스팅 : Human -> Professor
	    Professor ppp02 = (Professor) ppp01;
	    
	    //Human
	    ppp02.name = "김";
	    //Human
	    ppp02.professorId =11;
	
//	    Child ch33 = (Child) ppp02; // 해당타입이 없어서 실행할 대 오류 발생
	
	    Child ch44 = (ppp02 instanceof Child) ? (Child) ppp02 : null ;
	    
	    //(ppp02 instanceof Child)가 true (ppp02의 Child타입이 존자하면) 라면 ppp02 실행하고false 라면 null을 넣어라
	    
	    // 객체 instanceof 타입 : 객체에 타입이 존재하면 true
	    
	    System.out.println(ch44);
	    
	    // Child를 객체화해서 Child 타입으로 지정  : 자신과 부모의 모든 필드와 메소드를 사용할 수 있다
	    // Human , Professor , Child 모두 사용 가능
	    
	    Child cc01 = new Child();
	    cc01.name = "김";        // human
	    cc01.professorId = 222; // professor
	    cc01.chirdName = "손자";	// Child
	    
	    Professor p100 = cc01;   // 업캐스팅 : 자식타입에서 부모타입으로 (명시안해도 됨) child -> professor
	    Human hh100 = p100;      //업캐스팅 : professor -> Human
//	    Child cc100 = hh100 ;    // 부모에서 자식을 다운 캐스팅할 때는 명시해야함 
	    Child cc100 = (Child) hh100;  // 다운캐스팅 : human -> child
	    
	    cc100.age = 90;
	    System.out.println(cc100.age);
	
	
	}

}
