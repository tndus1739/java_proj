package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
		int a ;  // 스캐너로 인풋받는 변수
		
		do {
			System.out.println("==========================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의 배수 출력 ||");
			System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("5. 프로그램 종료");
			System.out.println("==========================================================");
			System.out.println("위의 내용을 정수로 입력하세요.>>>>>");
			
			a =sc.nextInt();
			
			if ( a==1) {
				System.out.println("1. 구구단 출력");
				System.out.println("=============");
			// 구구단 출력 프로그램 ( for문을 넣어서 출력)
					
				for ( int aa = 1 ; aa < 10 ; aa++) {		// aa단을 출력하는 변수
					for (int bb = 1 ; bb < 10 ; bb++) {		// bb : 각 단에서 1 ~9 곱하는 수
						
						System.out.printf("%d * %d = %d\t" , aa, bb , aa*bb );
					}
					System.out.println();
				}
			}else if ( a==2 ) {
				System.out.println("2. 19단 출력");
				System.out.println("=============");
			// 19단 출력 프로그램
				for ( int cc = 1 ; cc < 20 ; cc++) {
					for ( int dd = 1 ; dd < 20 ; dd++) {
						System.out.printf("%d * %d = %d\t" , cc, dd , cc*dd );
						
					}
					System.out.println();	
				}
				
				
			}else if ( a==3 ) {
				System.out.println("3. 1 ~ 1000까지 3의 배수 출력");
				System.out.println("=========================");
			// for문, while문, do while문
				System.out.println("=== for문 1===");
				for ( int ee = 0 ; ee <=1000 ; ee+=3) {
					System.out.println("ee : " + ee );
				}
				System.out.println("=== for문 2===");
				for ( int ee = 1 ; ee <1000 ; ee++) {
					if (ee % 3 == 0)
					System.out.println("3의 배수 : " + ee );
				}
//				------------------------------------------
				System.out.println("=== while문 1===");
				int ee = 3 ;
				while (ee <=1000) {
					System.out.println("ee : " + ee );
					ee+=3;
				}
				
				System.out.println("=== while문 2===");
				
				int ee1 = 3 ;
				while (ee1 <1000) {
					ee1 += 3;     // ee1 = ee1 + 3
					System.out.println("3의 배수 " + ee1 );

				}
			
//			-------------------------------------------
				System.out.println("=== do while문 1 ===");
				int ee2 = 3 ;
 				do {
 					System.out.println("ee : " + ee2 );
					ee2+=3;
 				} while ( ee2 <= 1000);
 				
 				System.out.println("=== do while문 2 ===");
 				
 				boolean c = true ;
				int d = 1 ;
 				do {
 					if ( d % 3 == 0 ) {System.out.println("3의 배수 (dowhile) : " + d);}
 					if ( d == 1000 ) c = false ;
 					System.out.println("d : " + ee2 );
					d++;
 				} while ( d <= 1000);
 				
 				
			}else if ( a==4 ) {
				System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램"); 
				System.out.println("10개의 정수를 공백으로 넣으세요>>>>>");
			// 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램	
				
			int c , count = 0 ;            // c : 스캐너로 정수를 받는 변수 , count : 짝수르르 카운트하는 변수
			for ( int i = 1 ; i <= 10 ; i++) {
				c = sc.nextInt();    // 10번 루프 : input 값을 할당 받음
				
				if ( c <= 0) { 	// 0이거나 음수는 카운드하지 않음 
					continue;				
				}
				if (c % 2 == 0 ) {  // 작수만 카운트 변수에 할당 한다.
					count++;
				}
			}
			System.out.println("입력한 10개의 정수 중 짝수는 : " + count + " 개 입니다.");
			
			
			

			}else if ( a==5 ) {
				System.out.println("5. 프로그램 종료"); 		// 5를 입력하면 break;만나 빠져나와서 종료
				break;
			}
		}while (true);
		
		sc.close();  						// 메모리에서 스캐너를 제거해야함
			
		
		
		
		
		
	}
}
