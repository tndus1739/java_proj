package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array2 {

	public static void main(String[] args) {

		/*
		 * 
		 * for , 이중 for , if, 연산자 (==, != , || , && ) 
		 * 
		 	arr : 배열 변수명, 2차원 배열 , [5] [10]  , 행은 5행, 10열
		 		arr[0] : 짝수만 저장
		 		arr[1] : 홀수만 저장 , 3의 배수는 빼고 저장
		 		arr[2] : 4의 배수와 5의 배수를 저장 
		 		arr[3] : 10의 배수를 저장 
		 		arr[4] : 8단을 입력
		 	//  for문으로 출력
		 	//  enhanced for문
		 	//  Arrays.toString(_)으로 출력
		 	 
		*/
		
		// 1. 배열선언
		int arr [][] = new int [5][10];
		
		System.out.println(arr.length);   // arr은 2차원 배열 -> 행의 개수
		System.out.println(arr[0].length);		//arr[0]의 열의 갯수
		// 2. 각 행의 값을 입력 : 이중 for문 ( 바깥족 for : 행을 이동, 안쪽 for : 열을 이동)
		
		for ( int i = 0 ; i < arr.length ; i++) {   //  i : 행의 번호
			
			if ( i == 0) {      //짝수만 저장
				int a = 2;		// 값을 저장할 변수 a를 선언
				for (int  j = 0 ; j < arr[i].length ; j++){ 
			    arr[i][j] = a;
			    a+=2 ;
			  
				}	
				
				/*
					다른 방법
				int a = 1;		// 값을 저장할 변수 a를 선언
				for (int  j = 0 ; j < arr[i].length ; a++){ 
				if ( a % 2== 0){
			    arr[i][j] = a;
			    j++ ;           // 방번호는 계속 올라가는게 아니라 변수를 2로 나누었을 때 값이 0이되면 j값이 그때 올라감
				 	
				 	*/
				
					
			}	else if (i == 1 )	{
			int a = 1;
				for (int j = 0 ; j < arr[i].length ; a++) {
					if (a % 2 != 0 ) {					//  홀수일 때 : a % 2 != 0  =  a % 2 == 1
						if(a % 3 != 0) {				//  3의 배수가 아닐 때
														// 홀수이면서 3의 배수가 아닐 때 실행블락
					arr[i][j] = a;						// j가 그냥 늘어나는게 아니라 a의 값이 홀수이면서 3의 배수가 아닐 때 j(방번호)가 늘어난다.
					j++;								// j++를 안쓴다면 for이 계속 true가 되어서 무한루프
					
				}
				
			}
			}		
			} else if (i == 2 ) {  // 4의 배수와 5의 배수를 저장 
			int a = 1;				// 값을 저장하는 변수
			for ( int j = 0 ; j < arr[i].length ; a++) {
				if ( a % 4 == 0 || a % 5 == 0) {
					// 4의 배수이거나 5의 배수이면 실행
					arr[i][j] = a;		// i : 2, j : 0 ~ 9
					j++;					// 방에 값을 넣어야 방번호 증가 
					
				}
				
			} 
			}else if (i == 3) {		// 10의 배수를 저장 
			
			int a = 1;
			for( int j = 0 ; j < arr[i].length ; a++) {
				if ( a % 10 == 0 ) {
				arr[i][j] = a ;
				j++;
				
				}
			 }
			} else if ( i == 4 ) {  // 8단을 입력
			 int a = 8;
			 for ( int j = 0 ; j < arr[i].length ; j++) {
				 arr[i][j] = a ;
					a+=8; 
			 }
			
			}
			
		}
	
			

	
		System.out.println("===================================");
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
		
		
		// for 문을 사용해서 2차원 배열의 각 방의 내용을 출력
		System.out.println("=============for문으로 출력 ===============");
		for ( int i = 0 ; i < arr.length; i ++) {
				for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
				}
				System.out.println();
		}
		
		System.out.println("=============Enhanced for문으로 출력 1 ===============");
		for ( int[] a : arr) {
			System.out.println(Arrays.toString(a));
		
			
		}
		
		System.out.println("=============Enhanced for문으로 출력 2 ===============");
		for ( int[] a : arr) {
			for ( int b : a) {
			System.out.print(b);
			System.out.print("\t");
		}
			System.out.println();
	}
	
	}	
	
	}


