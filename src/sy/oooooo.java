package sy;

import java.util.Scanner;

public class oooooo {

	public static void main(String[] args) {

		// 스캐너에서 숫자가 문자열로 들어왔을 정수로 변환 , 실수로 변환 후 연산하기
		
		// 스캐너
		
		Scanner sc = new Scanner(System.in);
		String name;
		String kor;
		String eng;
		String math;
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		
		System.out.println("국어점수, 영어점수, 수학점수를 입력해주세요.");
		
		kor = sc.next();
		eng = sc.next();
		math = sc.next();
		
		int sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math) ;
		double avg = ((double) (Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math)) ) / 3;
	
		System.out.println(name + "님의 점수의 합계는 " + sum +"점 입니다.");
		System.out.println("점수의 평균은 " + avg + "점 입니다.");
	}

}
