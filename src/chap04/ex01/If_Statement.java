package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) {

		/*
		 클래스명 : 반드시 첫자는 영문 대문자
		 변수명 : 소문자로 시작 ( 대문자로 써도 되기는 함), 이어지는 단어의 첫자는 대문자 (낙타형식으로 이름을 사용)
		 상수명 : 대문자로만 (권장사항)
		 
		 	 특수문자 : _ , & 만 사용가능
		 	 숫자가 처음에 오면 오류발생 , 숫자는 사용가능
		  
		 */
		/*
		 제어문 : 프로그램의 순서를 바꾸어서 처리함 -> if 문 , switch 문
		 
		 if 문 - break;가 내장 (이미 내장되어 있어 사용안해도 됨)
		 switch 문 - break; (블락을 빠져나올 때 사용)
		  
		▷ If 3가지 구문 
		
		1. 조건이 1개 일 때

		   if (조건) {
			  
			  조건이 true 일 때 실행문 ;
		   
		   }else {	  
			  
			  조건이 false 일 때 실행문 ;
		   
		   }
		
		2. 조건이 여러개일 때
		
			if (조건1) {
					조건1 일 때 ;
			} else if (조건2) {
					조건2 일 때 ;
			} else if (조건3) {
					조건3 일 때 ;
			} else if (조건4) {
					조건4 일 때 ;
			} else {
					위의 모든 조건이 만족되지 않을 때 작동
			}
		
		3. 한 라인으로 사용 (else 없음)
			
			if (조건) { 조건이 true 일 때 }
		
			if (조건) 조건이 true 일때 ;  -> { }를 생략한다면 ; 를 입력해야 한다.
			
		
		*/
		
		int a = 10;
		if ( a < 30 ) {
			System.out.println("참입니다.");		//조건이 참이면실행
		} else {
			System.out.println("거짓입니다.");		//조건이 거짓이면 실행
		}
		
		System.out.println("프로그램 종료입니다.");
		
		
		
	}

}
