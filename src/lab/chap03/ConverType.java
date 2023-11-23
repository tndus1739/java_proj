package lab.chap03;

import java.util.Scanner;

public class ConverType {

	public static void main(String[] args) {
		
		// String으로 인풋 받은 값을 정수나 실수 타입으로 변환해서 출력
			// Integer.parseInt(변수);     변수 : 문자열로된 정수 , "13"
			// Double.parseDouble(변수);   변수 : 문자열로된 실수 , "13.33"
		
		
		Scanner sc = new Scanner(System.in);
		
		// Scanner에서 국어점수, 영어점수, 수학점수 받기
		
		String kor ;            // 범위지정 후 ctrl + / : 주석처리
		String eng ;
		String math ;
		
//		int kor;
//		int eng;
//		int math;
//		
		int hap ;
		double avg ;
		
		System.out.println("국어점수 영어점수 수학점수를 공백으로 구분해서 넣으세요>>>>");
		
		kor = sc.next();    // 스캐너에서 값을 받은 뒤에 계산
		eng = sc.next();
		math = sc.next();
		
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		math = sc.nextInt();
//		
// 		hap = Integer.parseInt(kor + eng + math); -> kor = sc.next();(문자)니까 출력하면 다 붙어서 나옴
		
		
		hap = Integer.parseInt(kor)+ Integer.parseInt(eng) + Integer.parseInt(math) ;
		avg = hap / 3.0 ;
		
				
		//코드입력
		// 아래와 같이 출력
	    //System.out.println("모든 점수의 합 : " + hap);
		System.out.println("모든 점수의 합 : " + hap);
		System.out.println("모든 점수의 평균 : " + avg);
		//--------------------------------------------------------
		
		

}
}
