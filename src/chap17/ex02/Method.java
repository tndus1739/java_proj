package chap17.ex02;

import java.util.List;

public class Method {
	
	// 1. 필드 선언
	
	List<Student>   aList;
//      타입         변수	
	
	    int[]       arr ;
//      타입         변수	
	
	
	
	 // 2. 기본 생성자 생략됨 <- Method(){}
	    
	 // 3. 메소드 : 인풋 -> (프로램) -> 출력 , 객체 생성 후 메소드 호출
	    
	    void arrayListOut(List<Student> aList) {
	    	
	    	// aList 인풋 받아서 aList의 <Student>객체를 끄집어내서 모든 필드의 내용을 출력
	    	
	    	
// 방법 1	   	for ( int i = 0 ; i < aList.size() ; i++) {
//	    		System.out.println(aList.get(i));
//	    	}	
// 방법 2	    	
	    	for ( int i = 0 ; i < aList.size() ; i++) {	
	    		Student s = aList.get(i);
	    		System.out.println(s);
	    		
	    	}
	    }
	    
	    // 인풋 : 배열 , 정수를 인풋받음    /   출력 : 인풋 받은 배열에서 정수로 들어오는 값이 몇 개가 잇는지 출력
	    void arrayOutput ( int [] arr1 , int a ) {    // a는 인풋 받은 값이 들어옴
	    	
	    	int count = 0 ;                      // 갯수를 카운트하는 변수
	    	
	    	for ( int i = 0 ; i < arr1.length ; i++) {
	    		
	    		if ( arr1[i] ==  a)	{					// 배열안의 값이 a와 같을 때		
	    			count++;							// 각 방의 값이 a와 같으면 루프돌고 개수가 카운트된다.				
	    		}
	    	}
	    	
	    	System.out.println("인풋 받은 정수는 : " +  a + " 이고, 배열에 " + count + " 개있습니다.");
	    	
	    }
	
	    // List<Student> 객체를 받아서 각 객체의 이름 , 주소를 출력하는 메소드
	    
	    void nameAddr ( List<Student> aList) {
	    	for ( int i = 0 ; i < aList.size(); i++) {
	    		Student s = aList.get(i);
	    		
	    	   System.out.println("이름 : " + s.getName() + " 주소 : " + s.getAddr());
	    	}
	    }
	    
	    
	    
}
