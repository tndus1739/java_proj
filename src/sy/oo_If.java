package sy;

import java.util.Scanner;

public class oo_If {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		int eng ;
		int math;
		
		
		System.out.println("이름을 입력해주세요.");
		
		name = sc.next();
		
		System.out.println(name +"님의 국어, 영어 , 수학 성적을 입력해주세요.");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int sum = kor + eng + math ;
		
		if(kor <60 || eng < 60 || math < 60 ) {
			System.out.println(name + "님은 낙제입니다");
		}else if (sum >= 280) {
			System.out.println(name + "님은 A 등급입니다.");
		}else if (sum >= 260) {
			System.out.println(name + "님은 B 등급입니다.");
		}else if (sum >= 240) {
			System.out.println(name + "님은 C 등급입니다.");
		}else if (sum >= 200) {
			System.out.println(name + "님은 D 등급입니다.");
		}else  {
			
		}
		
}
	
	
}
