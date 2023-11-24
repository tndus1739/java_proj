package chap04.ex03;

import java.nio.file.spi.FileSystemProvider;

public class For_Statement5 {

	public static void main(String[] args) {

		/*      반복문 (for , while , do while) 내에서 continue; break; 키워드 사용 ->  if조건을 넣어서 사용
				
				- continue;  : 빠져나오지는 않고 아래코드는 실행하지 않고 증감식으로 이동 
				- break;     : 반복문을 빠져나온다.
		*/
	
		// continue ;
		for ( int i = 1 ; i < 10 ; i++) {
			
			if ( i % 3 == 0) {			// 3의 배수일 때 true
				continue;				//continue를 만나면 아래코드를 실행하지 않고 증감식으로 이동.
										//continue는 보통 구문을 실행하지 않기위해 넣는 긋이라서 구문앞에 넣는다. (구문 뒤에 넣으면 의미가 없음)
			
			}
			System.out.println("i변수의 값 : " + i);
			
		}
		
		
		System.out.println("============================");
		
		
		// continue ;
		for ( int i = 1 ; i < 10 ; i++) {
							
			if ( i % 3 == 0) {			
				continue;				
			}
			System.out.println("369의 배수에서는 출력안됨");   // 커밋 확인
			System.out.println();
		}
		
		
		System.out.println("============================");
		
		
		// break ;
		for ( int i = 1 ; i < 10 ; i++) {
					
			if ( i % 3 == 0) {			
				break;				
			}
			System.out.println("i변수의 값 출력: " + i);
					
		}
				
		
	}

}
