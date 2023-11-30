package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList {

	public static void main(String[] args) {

		/*
		    // 배열 : arr           : 100번방 , 10의 배수만 저장후 출력 ->for, Arrays.toString
		    // 컬렉션 : aList		   : 20 배수 100번방까지만

		*/
		
		// 배열 : 참조자료형 , 방의 개수 선언을 반드시 해야한다.
		
		//  1. 선언
		//  자료형[] 변수 = new 자료형[방갯수];
		//  arr.length : 배열방의 갯수
		
		int[] arr = new int [100];				// index : 0 ~ 99
		
		// 배열 각 방에 값을 넣기
		
		for ( int i = 0  , a = 0 ; i < arr.length ; i++) {
			
			a+= 10;		
			arr[i] = a;
		
		}
		
		// 출력
		for ( int i = 0 ; i <arr.length ; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
		
		for ( int k : arr) {
			System.out.print(k + " , ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		
		// 컬렉션 : ArraysList , 자동으로 방크기가 늘어나고 줄어든다. 제너릭타입으로 선언 : <Integer>
		
		// import 해서 사용
		// ArrayList 선언
		// 메소드를 사용해서 값을 넣고, 삭제, 출력
		// aList.add(값추가)						   // add : 마지막 방에 값을 추가
		// aList.add(index, 값)			           // index 특정 방번호에 값을 넣음
		// aList.size()					           // 방의 갯수
		// aList.remove(index) 					   // 방 번호 삭제
		// aList.remove(값)						   // 값 삭제
		// aList.get(index)						   // index의 값을 출력
		// 
		List <Integer> aList = new ArrayList<Integer>();  
//		List <Integer> aList = new ArrayList<>(); 				 // 뒤에 있는 <> 안에는 생략가능
		
		ArrayList<Integer> aList2 = new ArrayList<>();			 // 위와 같은 방법
		
		System.out.println(aList.size());   // 선언만 해놨기 때문에 값이 0이 나와서 aList.size 하면 안됨
		
		// 값을 입력
		
		for ( int i = 0 , a = 0 ; i < 100 ; i++) {
			a +=20;
			aList.add(a);        // 방번호를 넣는게 아니라 마지막 방에 값을 넣어준다.
		}
		System.out.println("컬렉션의 방의 크기 : " + aList.size());
		
		// 각 방의 내용을 출력
		
		for ( int i = 0 ; i < aList.size() ; i++) {
		System.out.print(aList.get(i) + " , ");				// i 번째 방의 값을 출력
		}
		
		System.out.println();
		System.out.println(aList);							// 배열의 Arrats.toString처럼 한 줄로 보여준다.
	}

}
