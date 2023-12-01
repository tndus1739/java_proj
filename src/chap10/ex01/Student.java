package chap10.ex01;

public class Student extends Human{	// 자식 클래스
	
	// Human 클래스의 필드와 메소드가 Student 클래스로 상속
	
	// 기본 생성자 생략됨
	
	Student() {
		super();		// super(); -> 부모클래스의 인풋값없는 생성자를 호출
	}
		
	Student ( int studentID){
		super("김똘똘", 20);						// 부모 클래스의 인풋이 2개인 생성자 호출
		this.studentID = studentID	;				//// 자식클래스 생성자 내에는 항상 super(); 이  생략되어있다.( 항상 첫라인에 생략됨)
		this.stuName = super.name;				// 부모 클래스 만들어지고 그다음에 this.studentID = studentID   his.stuName = super.name;  작동
		super.eat();
	}
	
	
	
	// 필드 : 
	String stuName ;
	int studentID ;
	 
	 //메소드
	 void goToSchool () {
		 System.out.println("모든 학생은 학교를 갑니다.");
	 }
	
	
	 void StuInfo () {
		 System.out.println("학생이름은 " + name + "이고 , 나이는 " + age + "입니다.");		// name과 age필드는 부모클래스에 있다.
	 }
	
	
	
	
	
	

}
