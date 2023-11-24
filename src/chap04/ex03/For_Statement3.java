package chap04.ex03;

public class For_Statement3 {

	public static void main(String[] args) {

		// 무한루프에서 break;를 사용해서 무한루프 빠져 나오기
			// 반복문에서 특정시점에 break;사용 : if문 내에서 break;를 사용 -> for , while , do while문
		
		// for 문에서 break; 
		
		for ( int i = 0 ; i >= 0 ; i+=10 ) {		 // i = i + 10  : i += 10
			
			System.out.println(i);
			
			if ( i == 10000) {		//조건을 주어서 무한루프를 빠져나온다.
				break;
			}
			
			
		}
		
		
		System.out.println("=======================");


		for ( int i = 0 ; i >= 0 ; i+=10 ) {		 // i = i + 10  : i += 10
			
			System.out.println(i);
			
			if ( i == 10000) {						// if문에 실행문이 1개일 때는 if뒤의 { }를 생략할 수 있다.
				break;
			}
			
		    System.out.println("오늘");
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
