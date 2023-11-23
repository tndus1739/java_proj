package chap03.ex04;

public class ReationOperator {

	public static void main(String[] args) {
		/* 비교연산자 : 비교해서 결과를 true 나 false로 리턴 (되돌려줌)
		 	- 크기비교 연산자 : > , < , >= , <=  (왼족을 기준으로)
		  	- 등가비교 연산자 : == (같으면 true) , != (같지 않으면 true)
		  
		 */
		
		// 1. 크기비교 연산자 / 등가비교 연산자
		
		System.out.println( 5 > 2);		// true
		System.out.println( 5 < 2);		// false
		System.out.println( 5 >= 2);	// true
		System.out.println( 5 <= 2);	// false
		System.out.println( 5 == 2);	// false
		System.out.println( 5 != 2);	// true
		
		char a = 'a' ;
		char b = 'a' ;
		
		System.out.println( a == b );	// true
		System.out.println( a != b );	// false
		
		System.out.println("=============================");
		
		// 2. 참조자료형일 때 등가비교 연산자 사용
		
			// 객체변수명 (str1) : stack 메모리영역에 저장됨 , str1 = 값이 저장된 heap의 주소 정보를 가지고 있음
			// 객체의 값 : Heap 메모리영역에 저장 ("안녕"은 heap에 저장)
		
		String str1 = new String("안녕");		//String은 참조자료형
		String str2 = new String("안녕");
		
		System.out.println(str1 == str2 );	// == 은 stack에 변수의 값을 비교
		
		// 참조 자료형일 때 Heap 영역의 값을 비교할 때  .equals() 를 사용해서 값을 비교 ★★★★★
		
		System.out.println(str1.equals(str2));  // true
		
		
		System.out.println("=============================");
		
		// String은 특수한 기능들이 많이 적용되어 있음
		
		// new 를 사용하지 않을 때 ( new : heap에 새로운 주소를 만듦 )
		
		String str3 = "오늘";
		String str4 = "오늘";
		
		System.out.println(str3 == str4 );   // ==는 stack에 저정된 변수의 값을 비교
		System.out.println(str3.equals(str4));	// Heap에 저장된 값을 비교
		
		
	}

}
