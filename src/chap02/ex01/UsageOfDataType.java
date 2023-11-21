package chap02.ex01;
// 패키지 : 폴더 
public class UsageOfDataType {	// 클래스 영역
	public static void main(String[] args) {	// 메인 메소드 영역 -> 이 영역에서 프로그램 작성해야 오류 안남
		// 변수 : 한 번 선언 후 변수의 값을 다른 값을 할당 할 수 있다. , 변수명을 소문자로 시작, 여러 단어를 이를 경우에는 이어지는 단어는 대문자로 시작
        //		        														(캐멀캐이스 이름 작성)
		// 상수 : 변수 선언 앞에 final 키가 등록됨, 상수명은 대문자로만 지정, 한 번 값을 할당하면 그 값을 수정할 수 없다.
		
		/* 자료형 : 변수나 상수를 정의할 때 반드시 자료형이 와야한다. (60page)
		   - 기본 자료형 (8개)   : 메모리의 stack 공간에 변수와 값이 할당
		     boolean(true / false 밖에 못씀), 정수 (byte, short, int, long), 실수 (float, double), 문자 (char)
		     
		   - 참조 자료형 (무한대) : 메모리의 stack 공간에는 변수명, 값은 Heap 에 저장됨, 첫자는 대문자
		    					객체 / 배열 / 인터페이스
		    					Sring : 참조자료형, 문자열을 담는다.
	
		*/
		
		//[변수 선언 방법 2가지]
		//1. 변수 선언과 값은 나중에 할당
		int a;		// 변수 선언
		int b;		// 변수 선언
		
		a= 1; 		// 변수의 값은 나중에 할당
		
		System.out.println(a);
//      System.out.println(b);		// 오류 발생 : 변수 선언 후 값이 할당이 안되어 있으면 오류발생
		
		//2. 변수 선언과 동시에 값을 할당
		
		int c = 10;
		int d = 20;
		
		System.out.println(c);  // 10출력
		System.out.println(d);  // 20출력
		
		//리터럴 : 변수, 상수에 들어가는 값
		
		//변수에 새로운 값을 팔당
		c = 55;
		d = 66;
		System.out.println(c); // 55출력
		System.out.println(d); // 66출력
		 
		// 상수 : 한 번 값이 할당 되면 다른 값을 넣을 수 없다. (final 키를 넣어서 상수 선언)
		//       상수 명은 대문자로 할당.
		
		final int ABC = 200;
		final double PI = 3.14;
		
		System.out.println(ABC);
		
//		ABC = 300; 				// 상수는 새로운 값을 넣으면 오류 발생
		
		System.out.println("=============8가지 자료형============");
		
		//기본 자료형 8가지
		//1.boolean
		boolean abc ; // boolean은 값에 true나 false 값만 넎을 수 있다.
		abc = true;
		
		System.out.println(abc);	//true
		
		//2. 정수 값을 넣을 수 있는 자료형 (byte : 1byte, short : 2byte, int : 4byte, long :8byte)
		//byte : 1byte (8bit) : -128 ~ 127 (범위 넘어가면 오류발생)
		byte aa ;
		byte bb ;
		
		aa = -128;
		bb = 127 ;
		
		System.out.println(aa);
		System.out.println(bb);
		
		// short : 2byte (16bit) : -32,768 ~ 32,767
		short cc;
		short dd;
		cc = -32768;		// 숫자에 , 적지마 (, 대신에 _ 는 가능)
		dd = 32767;
		System.out.println(cc);
		System.out.println(dd);
		
		// int : 4byte (32bit) : -2,147,483,648 ~ 2,147,483,647)
		int ee ;
		int ff ;
		ee = -2_147_483_648;	//  _ 는 구분자로 생략 (언더바)
		ff = 2_147_483_647 ;
		
		
	    // long : 8byte (64bit) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
				// 64 bit : 처음 비트 (MSB , 부호를 처리하는 비트)
				// clac  (계산기) 
				// 리터럴에 1, L 을 명시를 해야 한다.
		
		long gg ;
		long hh ;
		// long형에서 정수의 범위를 벗어난 값을 넣을 때 : L
		gg = -9_223_372_036_854_775_808L;   //리터럴에 대문자 L을 적용해 long을 선언한다. (리터럴 - 문자가 가리키는 값 그 자체)
		hh = 9_223_372_036_854_775_807L;
		System.out.println(gg);
		System.out.println(hh);
		
		long ii ;
		ii = 5000;  // int 범위 내의 값을 얺을 때는 L을 명시하지 않아도 됨
		
		// 실수 : float , double -> (double이 기본)
		// float : 4byte (32bit) , 소숫점 7자리까지 정밀도가 유지됨 , 리터럴 뒤에 f, F
		float jj;
		jj = 3.1488888888888888888888888888F;		//리터럴 뒤 F
		System.out.println(jj);
		
		// double : 8byte (64bit), 소숫점 15자리가지 정밀도 유지됨 -> 기본형
		double kk;
		kk = 3.1488888888888888888888888888888888888888888888; 	// 기본이라 리터럴 뒤에 안붙여도 됨
		System.out.println(kk);
		
		System.out.println("=====================================");
		
		// char : 1문자를 넣을 수 있음 : 영문, 한글, 일본어, 중국어.. (cf : string : 문자열 (2글자 이상)
			/*
			  	 - chat 의 값(리터럴)을 넣을 때는 ''
			  	 - 1문자로 넣을 수 있고
			  	 - 문자, 아스키 코드 값 (10진수), 유니코드로 할당 (16진수) 
			  	 - 아스키 코드 : 7bit ,영어대문자, 영엉소문자, 숫자, 특수문자는 아스키코드를 가지고 있음
			  	 - 유니코드 : (2byte ~ 3byte) 한글, 일본어, 중국어, ...
			     - %c : chat 변수의 값을 불러옴 , 문자형을 출력해준다. (cf - %s : 문자열을 출력해준다) 
			     - %b : boolen 변수의 값을 불러온다
			 */
		char ll;
		ll = 'A';
		char mm;
		mm = '가';
		System.out.println(ll);
		System.out.println(mm);
		System.out.println("================");
		
		// 문자로 값넣기 : a
		char nn = 'a' ;
		System.out.println(nn);
		
		// 10진수 아스키코드값으로 값넣기 : a
			// ' ' 넣으면 오류
		char oo = 97;
		System.out.println(oo);
		
		// 16진수 유티코드값으로 값넣기 : a (유니코드입력법 참고)
		char pp = '\u0061';
		System.out.println(pp);
		
		System.out.println("==============================");
		
		char firstName1 = '\uC218' ;  // 이름 첫자    : 수
		char firstName2 = '\uC5F0' ;  // 이름 두번째  : 연
		char lastname = '\uB178' ;      // 성         : 노
		
		// 출력내용 : 나의 이름은 노수연 입니다. (유니코드로)
		
		//println () ; 출력
		
		//printf () ; 출력     
		
		System.out.println("나의 이름은 "+ lastname+firstName1+ firstName2 + " 입니다.");
		System.out.printf("나의 이름은 %c%c%c 입니다.", lastname, firstName1 , firstName2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
	}

}
