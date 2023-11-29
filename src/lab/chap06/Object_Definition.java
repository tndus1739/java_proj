package lab.chap06;

class Animal {
   // 1. 필드
   String aName;
   String aColor;
   int aLeg;      //팔다리 갯수
   int aSpeed;
   String aCry;
   
   //생성자 : 필드의 기본 값을 입력하는 생성자
   
   Animal (){}
   
   Animal(String aName, String aColor ,int aLeg ,int aSpeed ,String aCry){
	
	this.aName = aName;
	this.aColor = aColor;
	this.aLeg = aLeg;
	this.aSpeed = aSpeed;
	this.aCry = aCry;
   }
   // 메소드 : 필드의 모든 값을 출력하는 메소드
   
   

   // 메소드 : int abc() { return aLeg + aSpeed ; }
   
   void printAll() {
	  System.out.println("동물이름 : " + aName);
	  System.out.println("색깔 : " + aColor);
	  System.out.println("다리개수 : " + aLeg);
	  System.out.println("속도 : " + aSpeed);
	  System.out.println("울음소리 : " + aCry);
	  
	   
   }

    int plus ( int aLeg , int aSpeed) {
    
    	int abc = aLeg + aSpeed;
    	return abc;
    }
   
}

public class Object_Definition {

	public static void main(String[] args) {

	// 객체 생성 및 테스트
	Animal an1 = new Animal();
	
		
	// 호랑이 독수리 사자 개
	an1.printAll();
	System.out.println("=====================");
	
	an1.aName = "호랑이";
	an1.aColor = "주황색";
	an1.aLeg = 4;
	an1.aSpeed = 80;
	an1.aCry = "어흥";
	
	an1.printAll();
	System.out.println("=====================");
	
	Animal an2 = new Animal();

	an2.aName = "독수리";
	an2.aColor = "검정색";
	an2.aLeg = 2;
	an2.aSpeed = 100;
	an2.aCry = "울음소리";
	an2.printAll();
	System.out.println("=====================");
	
	Animal an3 = new Animal();

	an3.aName = "사자";
	an3.aColor = "황토색";
	an3.aLeg = 4;
	an3.aSpeed = 80;
	an3.aCry = "울음소리";
	an3.printAll();
	System.out.println("=====================");
	
	Animal an4 = new Animal();

	an4.aName = "개";
	an4.aColor = "흰색";
	an4.aLeg = 4;
	an4.aSpeed = 70;
	an4.aCry = "울음소리";
	an4.printAll();
	System.out.println("다리개수 + 스피드 :" + an4.plus(4, 70));
	
	System.out.println("=====================");
	
	Animal an5 = new Animal("토끼", "흰색", 4, 50, "울음소리");
	an5.printAll();
	System.out.println("다리개수 + 스피드 : " + an5.plus(4, 50));
	
	System.out.println("=====================");

	
	
	
	}
    
}
