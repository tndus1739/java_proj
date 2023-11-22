package chap02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		/* TypeCasting : 자료형의 형식을 변환
		 
		  기본 자료형 8가지 : RAM에 Stack이라는 공간에 변수명과 값이 들어있음
		  byte < short/char < int < long < float < double
		  
		  참조 자료형 , 무한대로 생성(객체) : Stack이라는 공간에는 변수명(값이 위치한 참조주소)이 들어가 있고 Heap이라는 공간에 값이 들어있음
		  객체/배열/인터페이스
		  
		   -- 자동으로 캐스팅되는 경우 : 업캐스팅 (낮은 자료형에서 높은 자료형으로 자동으로 일어남)
		   -- 수동으로 캐스팅되는 경우 : 다운캐스팅 (높은 자료형에서 낮은 자료형으로 변하는 것, 수동으로 해줘야함)
		   						   -다운캐스팅을 할 때는 다로 명시해줘야 한다.
		   						   
		   연산을 할 때 Type이 정확해야 한다. (원래는 타입이 다르면 연산이 안돼야한다.)
		   
		 */
		
		// 1. 자동캐스팅 : 업캐스팅
		int a = 10;
		double b =20.55;
		
		// 자동으로 업캐스팅 : 자동으로 해줌
		System.out.println( a + b );		// a (int)  + b (double) : int가 자동으로 double 타입으로 캐스팅된다.
		
		// 수동으로 다운캐스팅 : 따로 명시 해야함
		System.out.println( (int) (a + b) );	// 원래는 자동으로 타입이 double이 되지만 int를 넣어줌으로서 다운캐스팅이 됨
		
		// 변수의 값을 할당할 때
		
		double c =  100;       // 정수가 자동으로 업케스팅되어서 double 변수에 할당됨
		
		int d = (int)200.5;		   // 실수를 다운캐스팅해서 정수 변수에 할당해야 함
		
		System.out.println( c );		
		System.out.println( d );		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
