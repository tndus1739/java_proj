package chap04.ex02;

public class Swich_Statement {

	public static void main(String[] args) {
  /*
   		switch : 기본적으로 case 문 내에서 break;
   		- default 에서는 break;업이 빠져나올 수 있다.
    
   */
	
//		switch 문  ->  switch (값) 안에 정수, 문자 , 문자열이 올 수 있음 (break;를 넣어서 해당 블럭을 빠져 나와야함)
		
		int val1 = 3 ;    // val1에 3을 넣는다면 case3으로 점프
		
		switch (val1) {	// val1 : 점프변수 (case 뒤의 할당된 값에 따라 점프) / val1 안에 정수, 문자 , 문자열 입력가능
		case 1 :
			System.out.println("A");
	//		break;
		case 2 :
			System.out.println("B");
	//		break;
		case 3 :
			System.out.println("C");
	//		break;
		case 4 :
			System.out.println("D");
	//		break;
		default :						// case에 없는 값은 default로 점프 (default에는 break;안 넣어도 됨)
			System.out.println("F");    // val1에 7을 입력한다면 F로 출력
		}
		
		System.out.println("==========================");
		
	// 문자 : cahr가 들어간 switch문
		
		char ch ='a';
		
		switch (ch) {
		
		case 'a' :								// 문자니까 '' 잊지말고 입력
			System.out.println("A학점입니다.");
			break;
		case 'b' :
			System.out.println("B학점입니다.");
		 	break;
		case 'c' :
			System.out.println("C학점입니다.");
		default :
			System.out.println("F학점입니다.");
		}
		
		System.out.println("==========================");
		
		
		String abc = "토요일";
		
		switch(abc) {
		case "월요일" :
			System.out.println("월요일은 자바를 공부합니다.");
			break;
		case "화요일" :
			System.out.println("화요일은 데이터베이스를 공부합니다.");
			break;
		case "수요일" :
			System.out.println("수요일은 html를 공부합니다.");
			break;
		case "목요일" :
			System.out.println("목요일은 리엑트를 공부합니다.");
			break;
		case "금요일" :
			System.out.println("금요일은 JSP를 공부합니다.");
			break;
		case "토요일" :
			System.out.println("토요일은 운동을 합니다.");
			break;
		case "일요일" :
			System.out.println("일요일은 TV를 시청합니다.");
			break;
		default :
			System.out.println("잘못된 값을 입력했습니다. 요일을 입력하세요.");
			
		}
		
		
		
		
		
		
	}

}
