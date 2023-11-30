package chap04.ex04;

public class While_Statement1 {

	public static void main(String[] args) {
 
		/*
		 
		 	반복문 : for, while , do ~ while          // for문과 while문은 서로 바꿀 수 있다.
		 	================================
		 	for (초기값 ; 조건 ; 증감식 ) {
		 		조건이 true 일 때 구문;
		 		}
		 	================================
		 	초기값 ;
		 	while (조건) {
		 		조건이 true 일때 구문 ;
		 		
		 		증감식 ;
		 	}
		   =================================
		 */
		
		
		System.out.println("=== for문 출력 ===");
		for ( int i = 0 ; i < 10 ; i++) {
			
			System.out.println("for문으로 출력 i : " + i);
		}
		
//-------------------------------------------------------------------------------------------		
		
		
		System.out.println("=== while 문 출력 ===");
		
		int a = 0 ;											// while문에서 초기값
		
		while ( a < 10 ) {
			
			System.out.println("while문으로 출력 a : " + a); 	// 실행구문 (조건이 true)
			
			a++ ;
		}
		
		
		
	}

}
