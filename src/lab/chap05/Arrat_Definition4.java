package lab.chap05;

import java.util.Arrays;

public class Arrat_Definition4 {

	public static void main(String[] args) {

		/*
		  	변수 : 1개의 값만 저장 stack에 변수명, 벼수값이 저장 , stack에 값을 비교할 때 == 사용, -> 기본자료형
		  	배열 : 1개의 변수에 여러개의 값을 저장 -> 참조자료형 stack에 변수명과 참조주소가 들어가 있음, 값은 heap에 저장
		  			heap에 있는 값을 비교할 때 : .equals()사용
		  			초기값 -> 정수 : 0 , 실수 : 0.0 , boolean : false
		*/
		
//		int a = 10 ;  // a라는 변수에 10이라는 하나의 값
		int a ;		  // 변수
		int[]b = new int [10] ;       // [] : 배열선언 -> 10개의 방을 넣을 수 있다. 
									  // (heap에 배열방 10개를 만듦, 방을 만들면 heap공간에는 초기값이 반드시 들어가야한다.  정수는 0이 기본 , 실수는 0.0)
									  // index : 0 ~ 9
//		System.out.println(a);			//변수는 초기값을 반드시 넣어야 사용가능하다.
		System.out.println(b[0]);
		
		// b배열에 값을 할당
		b[0] = 3; 
		b[1] = 6; 
		b[9] = 10;
		
		// 배열의 각 방의 내용을 출력
		System.out.println(b[9]);
		
		// for문을 사용해서 0 ~ 9 방 출력
		for ( int i = 0 ; i < 10 ; i++) {			// i :방번호
			System.out.println(b[i]);
		}
		
		System.out.println(b.length);		// 배열 방의 샛수
		System.out.println("=====================");
		
		for ( int i = 0 ; i < b.length ; i++) {
			System.out.println( b[i]);
		}
		
		// Enhanced for : 배열 0 ~ 마지막 방까지 모두 출력
		System.out.println("====Enhanced for ====");
		for (int k : b) {
			System.out.println(k);
		}
		
		// Arraays.toString (배열변수)
		System.out.println("======Arraays.toString (b)======");
		
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
