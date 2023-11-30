package chap05.ex06;

import java.util.Arrays;

public class Rectangle_Array {

	public static void main(String[] args) {
		/*
			다차원 배열 : 2차원 정방형 배열	( 행의 방번호 ↓ : 0번 부터 , 열의 방번호 → : 0번 부터)
				*/
		
		// 1. 2차원 정방형 배열 선언
				// 첫번째 [] : 행 , 두번째 [] : 열
		int[][]arr1 = new int[3][4];     // new : heap에  값을 저장할 방을 만들어라
										 // 방의 개수 정해줌  -> 행 3줄 ( 0 ~ 2), 열 4줄 ( 0 ~ 3)
			
		// 2. 각 index ( 방번호)에 값을 넣음
		arr1[0][0] =1;                     // 방 ( 방번호에 없는 번호를 입력하면 실행단계에서 오류발생)
		arr1[0][1] =2;					   // 1  	2	 3 	  4
		arr1[0][2] =3;					   // 10	20 	 30	  40
		arr1[0][3] =4;					   // 100   200  300  400
										   
		arr1[1][0] =10;
		arr1[1][1] =20;
		arr1[1][2] =30;
		arr1[1][3] =40;
		
		arr1[2][0] =100;
		arr1[2][1] =200;
		arr1[2][2] =300;
		arr1[2][3] =400;
		
//		arr1[2][4] = 500;					// 컴파일 단계의 오류 : 이클립스에서 오류를 확인
											// 실행 단계의 오류 : 실행시에 오류가 발생
											// 배열의 방번호를 넘길 때 발생되는 오류 : ArrayIndexOutOfBoundsException
		
		// 3. 출력 : 방번호를 직접 출력
		
		System.out.println(arr1[0][0]);		// 1
		System.out.println(arr1[1][0]);		// 10
		System.out.println(arr1[2][3]);		// 400
		
		// 4. 출력 : for문을 사용해서 출력 ★★★★★
		
			// arr1.length -> 1차원 배열일 때는 열의 개수를 출력
		    // arr1.length -> 2차원 배열일 때는 행의 개수를 출력
		System.out.println(arr1.length);		// arr1은 2차원배열이기 때문에 행의 개수를 출력 : 3
		System.out.println(arr1[0].length);		// 열의 갯수를 출력
		
		// 2차원 배열은 2중 for문를 사용해서 출력
		
		for (int i = 0 ;  i < arr1.length ; i++) {		// 행의 방번호 : i , 방번호는 항상 0 부터,  바깥쪽 for문은 행을 반복
			for ( int j = 0 ; j < arr1[i].length ; j++) {		// 열의 방번호 : j / 안쪽 for문 : 바깥쪽 for문의 한 행에 대해서 열을 반복
				System.out.print("arr[" + i + "]" + "[" + j + "]=" + arr1[i][j]);  // j < arr1[i].length -> i가 행일 때 j의 열의 개수 
				System.out.print("\t");
			}
			System.out.println();
		}
		// 5. 출력 : Enhanced for문을 사용해서 출력 : 이중 for문으로 작동
		System.out.println("=====Enhanced for======");
		for ( int [] a : arr1) { 					// 바깥쪽 for 문 -> 행을 반복 : 첫번째 행(배열)을 끄집어내서 b에 담음 (행자체가 1차원 배열 -> a)
			for ( int b : a) {					    // 안족 for 문 : 그 행의 열을 끄집어냄 / b -> 끄집어낸 행(a배열) 의 처음방(0번방)과 마지막 방까지의 값을 b변수에 담음
			System.out.print(b);
			System.out.print("\t");
		}
		 System.out.println();
		}
		// 6. 출력 : Arrays.toString(배열변수명)
		System.out.println("=====Arrays.toString======");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println("=======for문을 사용해서 Arrays.toString출력 =======");
		
		for ( int i = 0 ; i < arr1.length ; i ++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
