package chap02.ex02;

public class RangeOfVariable {
	public static void main(String[] args) { 	//main 메소드 안에서 작성해야 오류발생x
		// main 메소드 : 코드 작성
		// 메소드 : 객체지향언어에서 함수를 메소드라고 호칭함  (메소드 = 함수)
	
		// 변수의 사용 범위 : 전역 변수, 지역 변수
		
		// 전역 변수 : 선언된 곳에서만 유효
		int a =10;
		
		{      //  { (불락) : if , switch, for, while, do ~ while -> 제어문, 반복문을 다룸
			// 지역변수 : 그 블락 내에서의 변수 , 그 블락 내에서만 사용되고 그 블락 외에서는 사용불가
			
			int b =20;
			System.out.println("a변수의 값을 출력 (내부 블락) : "+a);
			System.out.println("b변수의 값을 출력 (내부 블락) : "+b);
			
			{
				int c = 30 ; 	//int c 는 이블락 안에서만 사용가능
				System.out.println("===========================");
				
				System.out.println("블락의 블락 a : " + a);
				System.out.println("블락의 블락 b : " + b);
				System.out.println("블락의 블락 c : " + c);
			
				System.out.println("===========================");
			
			}
			
	//		System.out.println("블락의 블락 c : " + c);    : 오류발생
			
			
		}
		
		
			System.out.println("a변수의 값을 출력 (외부 블락) : " + a);
	//		System.out.println("b변수의 값을 출력 (외부 블락) : " + b);  : 오류발생  
	
	}
}
