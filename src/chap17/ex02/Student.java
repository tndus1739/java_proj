package chap17.ex02;

public class Student {
		// 클래스 : student 라는 객체를 만들기위한 틀 , 객체 (인스턴스) : 클래스를 기반으로 메모리에 로드된 것
 
		// 1. 필드 : 속성
	
		String name ;
		String addr ;
		int num ;
		
		int kor ;  int eng ; int math ;
	
		// 2. 생성자 : 클래스 기반으로 객체 생성시 생성자 호출 (클래스이름과 생성자가 동일해야 한다.) -> 생성자도 메소드
		
		// 2 - 1 : 기본 생성자 (다른 생성자가 없을 때는 생략되어서 외부에서 호출 , 생략가능) but 다른 생성자가 있을 때는 기본 생성자가 없으면 호출이 안됨
		
		Student() {}
		 
		// 2 - 2 : input 값이 1개인 생성자
		
		Student(String name) { this.name = name ;}
		
		Student (int num) {this.num = num;}
	
		// 2 - 3 : input 값이 2개인 생성자
		
		Student(String name , String addr) { this.name = name ; this.addr = addr ;}
		
		// 2 - 4 : input 값이 3개인 생성자
		Student(String name , String addr , int num) {
			this.name = name ;   this.addr = addr ;   this.num = num ;
		}

		// 생성자 오버로딩 ( 생성자도 메소드)
		// 메소드 오버로딩 (Overloading) : 메소드 이름(여러개의 Student)이 동일 , 시그니쳐(String, int ...)에 따라서 해당 메소드 호출
			// 식별자 ( 시그니쳐) : 인풋개수, 인풋자료형
				
		// 메소드 오버라이딩 (Overriding ) : 상속관계에서 부모 클래스의 메소드를 새롭게 재정의해서 사용하는 것
			// 상속 : 중복된 코드를 방지
			// 다형성 : 하나의 메소드를 여러 형태로 출력
				
				
		// 3. 메소드 : 프로그램의 기능 처리 , 입력한 것을 출력해줌
		
		
		
		public String getName() {                    // get : 필드 안의 값을
			return name;
		}

		public void setName(String name) {           // set : 인풋값을 만드시 넣어야 함 , 리턴타입이 없음
			this.name = name;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

	
		// toString () : Object 클래스의 메소드 , 객체자체를 출력시 heap의 주소가 출력되지 않고 필드의 값 출력

		@Override
		public String toString() {
			return "Student [name=" + name + ", addr=" + addr + ", num=" + num + ", kor=" + kor + ", eng=" + eng
					+ ", math=" + math + "]";
		}	
			
}