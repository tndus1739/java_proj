package lab;

public class ConsoleOutput1 {
	
	public static void main(String[] args) {
	
		
		// 변수 선언  :        소문자시작, 단어가 이어질 때 첫자를 대문자로 변수명 할당(캐멀캐이스)
		String fatherName ="홍길동";
		String motherName ="홍길순";
		String myName ="홍당무";
		
		int age =30;
		
		double weith1 =70.5 ;
		double weith2 =50.7 ;
		
			//출력 내용 : 우리 아버님 이름은 홍길동이고, 우리 어머님 이름은 홍길순 입니다.
			//			나의 이름은 홍당무이고, 나이는 30살이고, 몸무게는 70.5킬로 입니다.

			// println() ; 출력
	System.out.println("우리 아버님 이름은 " + fatherName + "이고, 우리 어머님 이름은 " + motherName +" 입니다.");
	System.out.println("나의 이름은 "+ myName + "이고, 나이는 " + age + "살이고, 몸무게는 " + weith1 + "킬로입니다.");
	
	    
		
			// printf() ; 출력
	System.out.printf("우리 아버님 이름은 %s이고, 우리 어머님 이름은 %s 입니다. \n",fatherName, motherName);
	System.out.printf("나의 이름은 %s이고, 나이는 %d살이고, 몸무게는 %4.1ㄴㅊf 킬로 입니다.", myName, age, weith1 );
	
		
	}
	

		
}
