package chap04.ex03;

public class For_Statement {

	public static void main(String[] args) {
/*		
  		제어문 : 프로그램의 조건에 따라서 순서를 바꾸어 줌, -> if( if, if ~else , if ~ else if), switch
  		반복문 : 프로그램을 계속 반복하도록 하는 구문
  			- 반복문 주의 : 조건이 무한 루프에 빠지지 않도록 처리
  			  ex) for, while , do while
  			  
  			  for (변수의 초기값 ; 조건 ; 증감식) {
  			  	 // 반복될 구문 ; 
  			  }
  		
  */
		
		for (int i = 0 ; i <= 10 ; i++) {				// for 블락에서 i설정했으면 다음 블락에서는 다른 글자사용
		System.out.println("오늘 날씨는 춥습니다. : " + i);
		}
		
		System.out.println("==================");
		
		// for문에서 주의 : 무한루프에 빠지지 않도록 조건을 처리
		
		int a ;							// 변수의 초기값을 설정할 때 for 블락 밖에서 변수 선언 가능
// 		for (a = 0 ; a >= 0 ; a++ ) {	// 조건이 계속 true라서 무한루프 발생
		for (a = 0 ; a < 100 ; a++ ) {	//
		System.out.println(a);
		}
		
		System.out.println("==================");
		
		// for 문 블락 밖에서 선언, for 블락 내에서 선언 ( 변수를 새로 사용 가능하다.)
		
		for (a = 10 ; a <= 100 ; a += 2 ) {	//
			System.out.println(a);
			}
		
		System.out.println("마지막 a 변수의 값을 출력 :" + a ); // 102출력 (마지막 a 100이 2가 더해져서 102찍고 false되어서 나옴)
		
//		System.out.println("마지막 i 변수의 값을 출력 :" + i );	// for문 내에서 초기화했기 때문에 블락 밖에서는 오류
		
		
		System.out.println("======무한루프========");
		
//		for ( int i = 0 ; i >= 0 ; i++){			// 무한 루프
		for ( int i = 0 ; i < 100 ; i++){			// 정상 코드 (전에 사용햇던 i는 for블락 내에서 소멸했기 때문에 재사용가능)
		System.out.println("무한루프 : " + i);
		}
		
//		for ( int i = 0 ; true ; i++) {				//조건에 true가 오면 무한루프
		for ( int i = 0 ; i < 100 ; i++) {
			System.out.println("무한루프 2 : " + i);
		}
		
//		for ( int i = 0 ;  ; i++) {					// 조건이 생략된 경우 : JVM에서 true를 자동으로 넣음
		for ( int i = 0 ; i < 100 ; i++) {					
			System.out.println("무한루프 3 : " + i);
		}
		
		// 도달할 수 없는 코드 (참고)
//		for ( ; false ; ) {					
//			System.out.println("a");
//		}
		
		
		
		
	
	
	
	
	}
}
