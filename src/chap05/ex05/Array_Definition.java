package chap05.ex05;

public class Array_Definition {

	public static void main(String[] args) {
		
		/*
		 	기본 데이터 타입 ( 8가지) : 변수명 vs 참조 데이터 타입[} 참조변수명
		 	
		*/
		
		// 1. 기본 데이터 타입에서 대입 연산 ( = 같다는 뜻 아님) : stack의 값을 복사
		
		int val1 = 3;
		int val2 = val1;				// = 의 의미는 stack에 저장된 값을 대입
		
		System.out.println(val2);		// 3
		
		val2 = 7;
		
		System.out.println(val1);		// 3
		System.out.println(val2);		// 7
		
		// 2. 참조 데이터 타입에서 대입 연산 ( = ): stack의 heap의 주소를 복사
		
		System.out.println("==========================");
		
		int[] arr1 = new int[] {3, 4, 5};				// 배열선언과 동시에 값을 할당
		int[] arr2 = arr1;								// arr2에는 arr1의 참조주소가 복사
		
		System.out.println(arr1);   // [I@626b2d4a   : stack에 저장된 heap의 주소를 출력 (arr1과 arr2의 주소가 같음)
		System.out.println(arr2);	// [I@626b2d4a	 : stack에 저장된 heap의 주소를 출력

		arr1[0] = 7;
		System.out.println(arr1[0]);  // 스택에 저장된 변수의 값을 대입하는 값?
		System.out.println(arr2[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
