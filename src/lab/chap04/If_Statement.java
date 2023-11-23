package lab.chap04;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {

    /*
     
    	// if  else if ,  equals("월요일")
    	 * 
		콘솔에서 "월요일"입력되었을 때 출력 "월요일은 자바를 공부 합니다."
		콘솔에서 "화요일"입력되었을 때 출력 "화요일은 데이터베이스를 공부 합니다."
		콘솔에서 "수요일"입력되었을 때 출력 "수요일은 html javascript를 공부 합니다."
		콘솔에서 "목요일"입력되었을 때 출력 "목요일은 JSP를 공부 합니다."
		콘솔에서 "금요일"입력되었을 때 출력 "금요일은 Spring를 공부 합니다."
		콘솔에서 "토요일"입력되었을 때 출력 "토요일은 운동을 합니다."
		콘솔에서 "일요일"입력되었을 때 출력 "일요일은 TV를 시청합니다."
		콘솔에서 "그 외의 값이 입력시" 입력되었을 때 출력 "잘못 입력했습니다. 요일을 입력하세요."
		
		*/
		
//		변수명 한꺼번에 바꾸기 : alt + shift + R
//		라인의 여러값 한꺼번에 바꾸기 : alt + shift + A
		
		// 1. scanner import
		Scanner sc = new Scanner(System.in);	// sca입력후 ctrl + space바
//												// new : 변수의 값을 heap에 저장해라
		String str ;
		
		// 2. 콘솔에서 입력받아서 변수에 할당
		
		System.out.println("요일을 한글로 입력하세요. ex) 월요일 >>>");
		
		str = sc.next();
		
		// if ~ else if문을 사용해서 처리
		
		if (str .equals("월요일")) {
			System.out.println("월요일은 자바를 공부 합니다.");   // System.out.println( str + "은 자바를 공부 합니다.");
		}else if (str .equals("화요일")) {
			System.out.println("화요일은 데이터베이스를 공부 합니다.");
		}else if (str .equals("수요일")) {
			System.out.println("수요일은 html javascript를 공부 합니다.");
		}else if (str .equals("목요일")) {
			System.out.println("목요일은 JSP를 공부 합니다.");
		}else if (str .equals("금요일")) {
			System.out.println("금요일은 Spring를 공부 합니다.");
		}else if (str .equals("토요일")) {	
			System.out.println("토요일은 운동을 합니다.");
		}else if (str .equals("일요일")) {	
			System.out.println("일요일은 TV를 시청합니다.");
		}else {
			System.out.println("잘못 입력했습니다. 요일을 입력하세요.");
		}
			
		
	}

}
