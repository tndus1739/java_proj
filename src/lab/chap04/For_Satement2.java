package lab.chap04;

public class For_Satement2 {

	public static void main(String[] args) {
		/*

			실습 : 2중 for 문을 사용해서 1 ~ 19 단 까지, 각 단을 옆으로 출력 (printf사용)
			-- 6단, 7단, 12 단을 제외하고 출력 : continue사용
			
		 */	
		
		System.out.println(" ==== 19단 출력 ====");      // 공백있음
		for ( int a = 1  ; a < 20 ; a++ ) {
			for ( int b = 1 ; b < 20 ; b++) {
				if ( a == 6 ||  a == 7 || a == 12 ) {
					continue;
				}	
			
		
				System.out.printf(" %d * %d = %d \t" , a , b , (a * b));	
				
			}
			System.out.println();  								//한 단 끝나면 엔터
		}
	
		
		System.out.println(" ==== 공백없는 19단 출력 ====");		// 공백 없음`	ㅂ	
		for ( int a = 1  ; a < 20 ; a++ ) {
			if ( a == 6 ||  a == 7 || a == 12 ) continue;
				
			
			for ( int b = 1 ; b < 20 ; b++) {
				
			
		
				System.out.printf(" %d * %d = %d \t" , a , b , (a * b));	
				
			}
			System.out.println();  								//한 단 끝나면 엔터
		}
	
		
		
		
		
		
	}

}
