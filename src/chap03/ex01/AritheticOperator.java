package chap03.ex01;

public class AritheticOperator {
	
	public static void main(String[] args) {
		/*
	    	산술 연산자 : +, -  , * , / , % ( %는 나머지만 출력)
	    	증감 연산자 : ++, (1씩 증가) , --(1씩 감소)  -> 변수 앞과 뒤에 사용 (주의)
		 */
		
		// 1. 산술 연산자
		int a = 5;
		int b = 10;
		System.out.println(a + b);	// 15
		System.out.println(a - b);	// -5
		System.out.println(a * b);	// 50
		System.out.println(a / b);	// 나누어서 몫만 출력
		System.out.println(a % b);	// 나누어서 나머지만 출력 ★★★
		
		// 캐스팅해서 연산
		System.out.println( 2 + (double) 3 );	// 5.0   업캐스팅되어서 앞에 있는 2 도 더블이 됨
		
		// 
		System.out.println( 10 % 5);	// ★ 나머지만 출력 -> 배수 구할 때 많이 사용(나머지가 0일 때 5의 배수)
			//	값 % 3 = 0 일 때 값은 3의 배수
		    //	값 % 5 = 0 일 때 값은 5의 배수
		
		System.out.println( 8 /5 );		// 몫만 출력
		System.out.println( (int) (8 / 5.0) );	// 몫만 출력
		System.out.println( 8 % 5);		// 나머지만 출력
		System.out.println( 8 / 5.0);
		System.out.println("============================");
		
		
		// 2. 증감 연산자 : == , --
		int val1 = 3;
	
		System.out.println(++val1);		//4  -> 변수 앞에 ++ : 값을 증가 후 출력
		System.out.println(val1);		//4

		System.out.println(--val1);		//3  -> 앞에서 4로 출력된 상태에서 감소 후 출력
		System.out.println(val1--);		//3  -> 3으로 출력 후 다음 입력시 감소
		System.out.println(val1);		//2
		
		System.out.println("============================");
		
		int val2 = 3;
		System.out.println(val2++);		//3	 -> 변수 뒤에 ++ : 값을 출력 후 다음 차례부터 증가
		System.out.println(val2);		//4
		
		System.out.println("============================");
		int val7 = 3;
		int val8 = 4;
		int val9 = 2 + val7-- + ++val8 ;  // 2 + 3 + 5 -> 10
		
		System.out.println("val9 : " + val9);		//10
		System.out.println("val7 : " + val7);		//2
		System.out.println("val8 : " + val8);		//5
		
		System.out.println("============================");
		
		int val10 = 30;
		int val11 = 40;
		int val12 = 50;
		
		int val13 = 7 + --val10 + ++val11 + val12-- ;  // 7+ 29 + 41 + 50 = 127
		
		System.out.println("val13 : " + val13);
		System.out.println(val10);		//29
		System.out.println(val11);		//41	
		System.out.println(val12);		//49
		
		
		
		
	}

}
