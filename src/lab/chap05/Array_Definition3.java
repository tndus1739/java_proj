package lab.chap05;

import java.util.Scanner;

public class Array_Definition3 {

	public static void main(String[] args) {

		// 스캐너 인풋 받고 do while 문
		/* 1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 7의 배수와 8의 배수를 저장 후 출력
		   2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 1씩 증가하는데 4의 배수는 빼고 저장 후 출력
		   3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력 
				*/
		
		// 배열, 제어문 (for, do ~while , 연산자 ( || ,! = (같지않다) , == (같다))
		
		// 1. Scanner 선언
		Scanner sc = new Scanner (System.in);		// 콘솔로 값을 인풋 받음
		
		// 내부 블락에서 사용할 변수 선언
		// 배열 변수 , 스캐너로 선택하는 변수, 배열의 방의 크기를 스캔으로 받는 변수
		
//		int [] arrl = new int [50] //선언과 동시에 방의 크기 지정
		
		int[] arr ;        //배열 변수만 선언만 하고 지정은 안함
		arr= new int [50]; // 배열의 방의 크기를 나중에 선언
		
		int n ;         	// 출력을 선택하는 변수 (스캐너로 콘솔로 인풋)
		int idx ;           // 배열의 방의 크기를 지정하는 변수
		
		do {
			System.out.println("==========================================");
			System.out.println("1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 7의 배수와 8의 배수를 저장 후 출력");
			System.out.println("2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 1씩 증가하는데 4의 배수는 빼고 저장 후 출력");
			System.out.println("3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("==========================================");
			System.out.println("위의 내용을 선택하세요.>>>>>>");
			
			n = sc.nextInt();
			
			if (n==1) {
				System.out.println("1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 7의 배수와 8의 배수를 저장 후 출력");
				System.out.println("배열 방의 크기를 정수로 넣으세요.>>>");
				
				idx = sc.nextInt();
				
				arr = new int[idx] ;      //배열방의 크기
				
				System.out.println("입력된 배열방의 크기는 : " + arr.length); // 스캐너로 입력받아서 방크기 지정
				
				int a = 1;   //방에 값을 넣는  변수
				// 각 배열방에 7의 배수와 8의 뱃수를 입력
				for ( int i = 0 ;    ; a++) {   // 조건이 공백되면 루한루프   ★★★★★
												// i = 방번호  , a = 방에 들어가는 값 ( 7의 배수 ,  8 의 배수일 때 i값이 증가)
					if ( i == idx) {break;}
					if ( a % 7 == 0 || a % 8 == 0 ) {						// a가 7의 배수나 8의 배수일 때
						arr[i] = a;											// arr[i]
						i++;												// 7의 배수나 8의 배수의 값이 등록되었을 때 방번호 증가
					}
					
				}
				// 각 배열의 방에 내용을 출력
				for ( int  i = 0 ; i < arr.length; i++){
					System.out.println("방번호 : " + i + ", 값 : " + arr[i]);
				}
				
				
				
			}else if (n==2) {
				System.out.println("2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 1씩 증가하는데 4의 배수는 빼고 저장 후 출력");
				System.out.println("배열 방의 크기를 정수로 넣으세요.>>>");
				idx = sc.nextInt();
				
				arr = new int[idx] ;    // 배열 방의 크기를 스캐너로 입력받아서 처리함 
				// 1, 2, 3, 5, 6, 7, 9, 10, 11....
				// 배열 방에 값넣기 : for문을 사용
				
				int a = 1;
				for ( int i = 0 ; i < arr.length ; a++ ) { // i : 방번호 , a : 값
					
					if ( a %4 == 0 ) {continue;}  /// a의 변수의 값이 4의  배수일 때는 아래내용 실행하지 않고 위에 내용으로 감
					arr[i] = a;
					i++;
					
				}
			
				// 각 방의 내용을 for문을 사용해서 물력
				for (int i = 0 ; i < arr.length ; i++) {
					System.out.println("방번호 : " + i + ", 값 : " + arr[i]);
				}
				
				
				
			}else if (n==3) {
				System.out.println("3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력");
				System.out.println("배열 방의 크기를 정수로 넣으세요.>>>");
				
				idx = sc.nextInt();
				arr = new int[idx];     // 배열 방의 크기를 스캐너로 입력 받아서 지정
				
				// 배열의 각 방에 값을 넣음 (for)
				// 3, 9 ,15
				int a  = 1 ;
				for ( int i = 0 ; i < arr.length ; a++ ) {			//i : 방번호는 값이 들어갔을때만 방번호가 늘어야한다.
				 if ( a %  3 == 0 ) {   // a의 값이 3의 배수 , -> 3배수, 6배수 둘다 들어옴
					 if ( a % 6 != 0) { // -> 6의 배수가 아닐 때 true
						 // 3의 배수이면서 6의 배수가 아닌것이 실행↓
						 arr[i] = a;
						 i++;		// 값이 들어갈 때 방번호 증가
					 }
						 
					 }
				 }
				// 배열의 각 방에 값을 출력하는 for
				for ( int i = 0 ; i < arr.length ; i++) {
					System.out.println("방번호 : " + i + ", 값 : " + arr[i]);
					
				}
				
				
			}else if (n==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}
			
			
			
		}while (true);								//true 이기 때문에 무한루프돈다; (break;넣어주면 오류사라짐)
		
		System.out.println("도달할 수 없는 코드 -- ");	//반복문에서 빠져나와야 도달할 수 있는 코드
		
	}

}
