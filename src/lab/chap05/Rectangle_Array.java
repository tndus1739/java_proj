package lab.chap05;

import java.util.Arrays;

public class Rectangle_Array {

	public static void main(String[] args) {
		/*
		 	// 1. 선언

		 	arr[3][10] : 행의 방번호 ( 0 ~ 2 ), 방의 갯수 : 3 , arr.lenth
		 				 열의 방번호 ( 0 ~ 9 ), 열의 개수 : 10, arr[0].length
		 		
		 	// 2. 배열 방에 값을 저장

		 			[2중 for문을 사용해서 값을 저장]
		 	
		 				 0행에는 1부터 시작해서 1씩 증가
		 				 1행에는 3의 배수를 저장
		 				 2행에는 7의 배수 , 8의 배수 저장
		 	// 3. 출력			 
		 			
		 			2중 for문을 사용해서 출력
		 			enhanced for문을 사용해서 출력
		 			arrays.toString () 으로 출력 , -> 1차원 배열을 출력
		 			
				*/
		
		// 1. 배열 선언
		
		int [][] arr = new int [3][10];
		
		System.out.println(arr.length);			// 행의 갯수 : 3
		System.out.println(arr[0].length);		// 열의 개수 : 10
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		 
		// 2. 이중 for문을 사용해서 값을 입력
		System.out.println("==============2. 값을 입력 =============");
		
		for( int i = 0 ; i <arr.length ; i++) {   // 행을 반복 -> 행 자체가 1차원 배열
//			System.out.println(" 행의 방번호 : " + i);
			
//				System.out.println("i : " + i + " , j : " + j);
				if (i == 0) {
					// i가 0배열의 각 방에 : 1씩 증가
					int a = 1;		//값을 저장
					for ( int j = 0 ; j<arr[i].length ; j++) {	//j : 방번호 , 열을 반복
					arr[i][j] = a ;
					a++;
					
					}
				}else if (i == 1) {
					// i가 1일때 각 방에 3의 배수 저장
					int a = 3;		//값을 저장
					for ( int j = 0 ; j<arr[i].length ; j++) {	
					arr[i][j] = a ;
					a+=3;
					}
				}else if ( i == 2) {
					// i가 2일 때 7, 8의 배수 저장 
					int a = 1 ;		//값을 저장
					for ( int j = 0 ; j<arr[i].length ; a++) {	// j가 아니라 a가 증가
						if ( a % 7 ==0 || a % 8 == 0) {			// 7의배수, 8의 배수
							arr[i][j] = a ;
							j++;	
						}
					 }	
				 }
			 }
			System.out.println("========================");
			for (int i = 0 ; i < arr.length ; i++) {
				System.out.println(Arrays.toString(arr[i]));
				
			}
		}
	
	
}
