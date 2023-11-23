package chap03.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
	
	/* 논리 연산자 : 결과 값으로 true/false 를 리턴(돌려준다)	★★★★★중요★★★★★
		
			 && (AND) : 모두 true일 때 true     -> 1라도 false가 있으면 false
			 			true && true : true     
						true && false : false
						false && true : false
			            false && false : false
		 	 || (OR)  : 하나라도 true 이면 true -> 앞에 true가 오면 뒤에 결과는 상관없이 무조건 true (뒤의 결과는 실행안함)
		 	 			true || true : true     (1라도 true이면 true)
						true || false : true
						false || true : true
			            false || false : false
		 	 ^ (XOR)  : 앞뒤 값이 같을 때 false, 앞뒤의 값이 다를 때 true
		 	 			true ^ true : false     
						true ^ false : true
						false ^ true : true
			            false ^ false : false
			 ! (NOT)  : true 일 때 false , false 일 때 true
		 	 
	*/	
	
	// && (AND) 연산 : 모두 true일 때 true  
	System.out.println(true && true);     //true
	System.out.println(true && false);	  //false
	System.out.println(false && true);    //false
	System.out.println(false && false);   //false
	
	System.out.println("==========================");
	
			
	// || (OR) 연산 : 하나라도 true 이면 true 
	System.out.println(true || true);     //true
	System.out.println(true || false);	  //true
	System.out.println(false || true);    //true
	System.out.println(false || false);   //false	
	
	System.out.println("==========================");
	// ^ (XOR) 연산 : 앞뒤 값이 같을 때 false, 앞뒤의 값이 다를 때 true
	System.out.println(true ^ true);     //false
	System.out.println(true ^ false);	  //true
	System.out.println(false ^ true);    //true
	System.out.println(false ^ false);   //false
	
	System.out.println("==========================");
	// ! (NOT) 연산 : true 일 때 false , false 일 때 true
	System.out.println(!true);     //false
	System.out.println(!false);	   //true
	
	System.out.println("=======쇼트서킷발생예문========");

	
	// 논리 연산자는 숏트 서킷이 발생될 수 있다. 쇼트 서킷을 방지하기 위해서 비트연산자를 사용한다.
		// 쇼트 서킷 : 앞에 연산자로만 결과값을 유추할 수 있는 경우에는 뒤에 오는 값은 처리하지 않고 결과를 돌려줌
			// AND 연산에서 앞에 false가 올 경우 쇼트 서킷이 발생됨
			// OR 연산에서 앞에 true가 올 경우 쇼트 서킷이 발생됨
	
	
	// 쇼트서킷이 발생되지 않는 경우 : && 연산에서 앞에 true 뒤에 값을 확인 후 결과를 리턴
							// || 연산에서 앞에 false 뒤에 값을 확인 후 결과를 리턴
	
	// 쇼트서킷이 발생되는 경우  : && 연산에서 앞에 false 뒤에 값은 무시하고 결과를 리턴
						// || 연산에서 앞에 true 뒤에 값은 무시하고 결과를 리턴
	
	// && 연산에서 쇼트서킷이 발생
	
	int val10 = 3;
	
	System.out.println(false && ++val10 > 6);
	System.out.println(val10);   // 3 (원래는 val10이 4여야하는데 false가 앞에 있어서 뒤의 값을 처리를 안해서 (쇼트서킷발생) 3으로 출력)
	
	System.out.println(true && ++val10 > 6); // false
	System.out.println(val10);	 // 4
	
	// || 연산에서 쇼트서킷이 발생
	 
	int val11 = 3;
	System.out.println(true || ++val11 > 6);	// or앞에 true일 때, 뒤의 값은 실행 하지 않는다. 
	System.out.println(val11);		// 3
	
	System.out.println(false || ++val11 > 6);
	System.out.println(val11);		// 4
	
	System.out.println("======= 쇼트서킷을 방지하는 방법 ========");
	
	// 비트연산자를 사용해서 쇼트서킷을 방지할 수 있다. -> & (AND) , | (OR)
		//비트 연산, 논리연산 - 쇼트서킷을 방지할 때 사용됨
	
	// AND 연산에서 쇼트 서킷 방지 : &
	int val12 = 3 ;
	
	System.out.println(false & ++val12 > 6); 	// 비트연산자가 논리연산할 때도 사용가능, 쇼트서킷을 방지
	System.out.println(val12);					// 4 출력 -> & (비트연산자)는 뒤의 값을 실행하기 때문에 4 출력 
	
	
	// OR 연산에서 쇼트 서킷 방지 : |
	
	int val13 = 3 ;
	
	System.out.println(true | ++val13 > 6);		//  비트연산자가 논리연산할 때도 사용가능, 쇼트서킷을 방지
	System.out.println(val13);					// 4 출력 -> |(비트연산자)는 뒤의 값을 실행하기 때문에 4 출력
	
	
	
	
	
	
	}
	
	
	
	
}
