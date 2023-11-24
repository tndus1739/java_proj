package chap04.ex05;

public class DoWhile_Statement {

	public static void main(String[] args) {

		/*  
		   while문 : 조건이 true일 때 실행문 실행됨.
		   do while문 : 조건이 밑에 있어서 조건에 상관없이 1번은 무조건 실행문이 실행됨.
		   
		   
		   
		    [while문]
			================================
			초기값 ;
			while (조건) {
				실행문 ; -> 조건이 true일 때 실행문 실행
				증감식 ;
			}
			================================
			
			
			[do while문]
			================================
			초기값 ;
			do {
			    실행문 ;
			    증감식 ;
			} while ( 조건 ) ;                   // ★★★ ; 빠지지 않게 주의 
			================================
				
		*/
		
		// while문
		int a = 0 ;
		while ( a < 0 ) {						// 조건이 false이므로 아래 내용이 출력이 안됨
			System.out.println("a : " + a);     // 작동이 안됨
		}
		
		
		
		// do while문 (조건);
	
		int b = 0 ;
		do {
			System.out.println("b : " + b);		// 조건과 상관없이 1번은 반드시 실행됨
		}while ( b < 0 );						// 조건과 상관없이 출력
	
		// do ~ while문에서 반복처리
	
		int c = 0 ;
		do {
			System.out.println("c : " + c );
			c++;
		} while ( c < 100);
	
		System.out.println("=================="
				+ "");
		
		
		// 반복 횟수가 100번인 경우 while문과 do while문의 비교
		
		System.out.println("======while=======");

		a = 0;
		while ( a < 10 ) {
			System.out.println("a : " + a);
			a++;
		}
		
		
		System.out.println("======do while=======");
		a = 0;
		do {
			System.out.println("a : " + a);
			a++;
		} while ( a < 10);
		
		
		
		
		
		
		
		
	}

}
