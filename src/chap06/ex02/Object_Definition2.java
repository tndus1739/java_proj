package chap06.ex02;

// 외부 클래스 : public class는 하나만 올 수 있다.

class Student {			// 클래스는 설계도 (껍데기)일 뿐 객체화(인스턴스화) 해서 사용해야 한다.  객체 : RAM 

	// class 안에 올 수 있는 것 : 필드, 메소드, 생성자, 이너클래스 ( 클래스내부의 클래스)
	
	// 객체 : 보이는 모든 사물
	// 1. 필드 : 객체가 가지는 속성값
	
	String name;	// 이름  ( 값은 DB에서 가져옴)
	int num;		// 학번
	int kor;		// 국어성적	
	int eng;		// 영어성적
	int math;		// 수학성적
	
	// 2.  기본 생성자 : 다른 생성자가 없을 때 생략가능
	
//	student (){}			// 기본 생성자
	
	// 3. 메소드 : 필드의 값을 조작해서 출력, 인풋, 출력  ( 메소드는 호출시 작동)
	
	void printAll () {									// printAll () :필드에 등록된 모든 내용을 츌력
														// 리턴타입이 없으면 메소드가 아니라 생성자가 되어버림 (리턴타입 입력!)		
														// void일때는 리턴구문이 없음
														
	System.out.println("이름 : "+ name);
	System.out.println("학번 : "+ num);
	System.out.println("국어점수 : "+ kor);
	System.out.println("영어점수 : "+ eng);
	System.out.println("수학점수 : "+ math);
	
	}
	
	double avg() {
		double avgAll = 0.0 ;
		
		// 필드의 모든 값을 더해서 평균을 계산해서 리턴
		avgAll = (kor + eng + math) / 3.0 ;
		return avgAll ;									// return 타입은 double (리턴타입은 여러가지 있다.)
	}													// 저장된 값을 return으로 돌려줌

	int plus (int a, int b) {							// plus : 반드시 2개의 이름값 입력
		int hap = a + b ;
		
		return hap ;									// void말고는 return 구문이 마지막에 와야함
		
	}
	
	String abc ( String name , String name2 ) {
		
		return name + " + " + name2;
		
	}
	
}

class Car  {			//클래스는 여러개 올 수 있다. 클래스안에 클래스 올 수 있다.
	
	// 1. 필드 선언
	
	String carName ;
	String carColor ;
	double carSpeed ;
	int carDoor ;
	
	// 2. 생성자 ( 생성자도 리턴타입이 없는 메소드 , 반드시 클래스 이름과 동일 , 필드의 값을 초기화)
	
	  Car (){}							// 다른 생성자를 넣을 때 기본 생성자를 넣어줘야 오류 방지
	  
	// 생성자 : 인풋값이 있는 생성자
	Car (String carName , String carColor , double carSpeed , int carDoor){
		this.carName = carName;
		this.carColor = carColor;
		this.carSpeed = carSpeed;
		this.carDoor = carDoor;
}
	// 메소드 : 프로그램의 기능, 호출시 작동
	void printAll() {
		System.out.println("자동차이름 : "+ carName);
		System.out.println("자동차색깔 : "+ carColor);
		System.out.println("자동차속도 : "+ carSpeed);
		System.out.println("자동차문 : "+ carDoor);
	}
}



public class Object_Definition2 {

	public static void main(String[] args) {

		// 1. 객체 생성 테스트는 반드시 메인 메소드에서 해야함
		
		Student s1 = new Student(); 						// 생성자 호출
		
		//2. 객체의 모든 필드 출력 : s1.printnAll();
		
		// 메소드 호출
		s1.printAll();
		
		System.out.println(s1.plus(20, 50));		// 리턴 : 호출한 곳으로 값을 돌려줌
		
		System.out.println(s1.abc("홍길동", "이순신"));
		System.out.println("===========================");
		
		// 3. s1 객체의 필드의 값을 주입 : 필드에 직접 입력, 생성자를 통해서 입력, setter를 통해서 값을 입력
		
		//필드에 직접 입력
		
		s1.name = "이길동";
		s1.num = 1111;
		s1.kor = 77;
		s1.eng = 88;
		s1.math = 99;
		
		s1.printAll();
		System.out.println("===========================");

		System.out.println("평균점수 : " + s1.avg());				// 출력구문을 안만들어놨기 때문에
		System.out.println("합계 : " + s1.plus(30, 70));
		System.out.println("===========================");
		
		Student s2 = new Student(); 
		s2.name = "이소라";
		s2.num = 2222;
		s2.kor = 100;
		s2.eng = 75;
		s2.math = 55;
	
		System.out.println("평균출력 : " + s2.avg());
		s2.printAll();
		
		System.out.println("===========================");
	
		// Car 객체 생성
		
		  Car  car1  = 	new Car();		// 인풋값이 있는 생성자가 있는데 기본 생성자를 호출하면 오류발생
//    클래스이름  객체명						// 다른 생성자를 넣을 때 기본 생성자를 넣어준다.
		
		
		car1.printAll();
		
		System.out.println("==========================");
		
		Car car2 = new Car("투스카니", "빨간색", 250.0, 4) 	;		// 인풋값이 있는 생성자
		car2.printAll();
		
		
		System.out.println("==========================");
		Car car3 = new Car("그랜저", "검은색", 300.0, 4) 	;	
		car3.printAll();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
