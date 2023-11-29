package chap06.ex01;
		// 클래스 밖에 : 패키지, 임포트, 외부 클래스
public class Object_Definition {			// 클래스 : 객체를 만들어 내기 위한 설계도 (붕어빵틀)
											// class가 따로 없는 이유 public class 의 이름인 Object_Definition로 객체를 생성해서
		// 클래스 블락 내 : 필드, 메소드, 생성자

	
		// 필드 (멤버 변수) : Heap 공간에 변수와 값이 저장 , 클래스 블락에 선언된 변수를 필드라고 호칭
						//  변수 : 메소드 블락내에 선언된 것을 변수 ( Stack에 변수명과 값이 저장)
		String name ;							// 필드이름
		int age ;
		double weight ;
		String add ;    // add : address
		
		
		// 생성자 2가지 ( 아래 2개 중 하나 호출)
		
		// 생성자 : 클래스 이름과 동일하고 리턴타입이 없는 메소드, 객체 생성시 필드의 값을 초기화할 때 사용
		
		Object_Definition(){}				// 기본 생성자, 생략해도 됨, 객체 생성시 생성자 호출해서 필드의 값을 초기화
											// 리턴타입이 없음
		// Object_Definition(){}  선택시 객체의 필드의 값등록 해야함
		
		// 생성자 : 인풋 값이 존재하는 생성자
		Object_Definition(String name, int age , double weight, String add){		// 인풋변수이름
			
			// this : 자신의 객체에 있는 필드를 뜻함 (자기자신의 객체) , this넣는 이유: 인풋변수이름 , 받는변수이름, 필드이름이 동일할 경우 
			this.name = name;			// 받는변수이름
			this.age = age;
			this.weight = weight;
			this.add = add;
		}
		
		
		// 메소드 (함수) : 리턴타입 메소드명(입력매개변수) {이 메소드 호출시 실행코드 ; }    // 직접 만든 메소드
		void printName() {		// void : 리턴타입이 오지 않을 때
			int a = 10;			// 변수 : stack 공간에 변수명, 값 저장
			System.out.println("필드에 입력된 이름 : " + name);
		}
		
		// 메소드( 호출시 작동됨) : 리턴타입이 반드시 와야함
		int printAge () {						     // age 라는 값을 리턴으로 돌려준다.
			return age ;
		}
		
		void printAll() {
				System.out.println("이름 : " + name + " , 나이 : " + age );
				System.out.println("몸무게 : " + weight + " 주소 : " + add);
		}
		// 메소드 ( 함수 )  블락
	public static void main(String[] args) {             //자바에서 만든 메소드
		/*
		 	 절차적 프로그래밍 (POP)  : 시간의 순서에 따라서 프로그래밍 -> c언어
		 	 					-> 성능이 우수하다. 유지보수하기 힘들다. 고장시 그 회사에서만 수리가능 , 수리비 많이 나옴
		 	 					   규모가 커지면 개발하기 어렵다. 반복된 코드가 계속 적용될 수 있다.
		 	 					   람보르기니, 페라리
		 	 					   한 회사에서 부품의 모든 것을 그 차에 맞게 최적화해서 만듦
		 	                        
		 	 객체지향 프로그래밍 (OOP) : 객체, 객체 프로그래밍 -> Java, C++
								-> 캡슐화 (보안에 강하다.), 상속 가능 (코드 중복 방지), 다형성 : 하나의 객체를 여러 형태로 찍어낼 수 있다.
								   유지보수하기가 쉽다., 개발하기 쉽다.
								   코드가 굉장히 간결해서 반복된 코드를 줄일 수 있다.
								   현대자동차 : 자동차에 들어가는 부품은 여러 협력사를 통해 만듦 -> 타이어, 시트, 엔진 , 유리창 등등
			
			 클래스 : 객체를 생성하는 툴, 설계도 (붕어빵 틀)
			 객체 ( 인스턴스) : 클래스를 기반으로 RAM에 로드된 상태 , 건물, 붕어빵						
				- 하나의 클래스로 여러개의 객체를 생성할 수 있다.
										
		*/					    
		// 변수 (메소드 안에 선언)
		String abc ;
		
		// 1. 객체 생성 : 클래스(객체를 만들어내는 하나의 설계도)를 메모리(Ram-객체)에 올려주는 것
			// 클래스명 객체명 = new 클래스명 ();						// 클래스명 (); -> 기본 생성자 호출
			// 타입    변수명 = new 생성자호출;
		Object_Definition hong = new Object_Definition();     // hong이라는 객체가 만들어짐
		
		// 2. 객체의 필드의 값등록
		hong.name = "홍길동";
		hong.age = 30;
		hong.weight = 77.5;
		hong.add = "서울";
		
		// 3. 객체의 메소드 호출 , 객체의 메소드 호출
		hong.printName();
	
		System.out.println(hong.printAge());
	
		hong.printAll();
		
		System.out.println("=========================");
		
		// 객체 생성 : 생성자에 매개변수의 값을 넣어서 객체 생성
		
		Object_Definition lee = new Object_Definition("이순신", 40, 88.8, "부산");	// 인풋값이 들어가는 생성자
		
		// 2. 메소드 호출 (위에서 값이 바로 들어가 있어서 바로 메소드 호출)
		
		lee.printAll();               // printAll(); : 그 필드의 값을 출력해라
		
		System.out.println("=========================");
		
		// 1. 객체 생성 : 클래스 ( 설계도 , 붕어빵틀) ----> 객체 ( 건물, 붕어빵)
		
		Object_Definition noh = new Object_Definition("노수연", 30	, 50.1, "파주") ;		// 객체 초기화하려면 인풋값 들어있는 객체 선택
		
		// 2. 객체의 메소드 호출
		noh.printAll();				// 메소드 안에 모든 것을 출력
		
		System.out.println("=========================");
		
		System.out.println(noh.name);		// 노수연
		System.out.println(noh.age);		// 30
	
		System.out.println("=========================");
		
		System.out.println(hong.name);		// 홍길동
		System.out.println(hong.age);		// 30
		
		System.out.println("=========================");

		System.out.println(lee.name);		// 이순신
		System.out.println(lee.age);		// 40
		
		
		System.out.println("======필드의 값을 수정=======");
		lee.name = "이길동";    // 필드의 값 변경
		lee.age = 77;
		
		System.out.println("=========================");

		System.out.println(lee.name);		// 이길동
		System.out.println(lee.age);		// 77
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
