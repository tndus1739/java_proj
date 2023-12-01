package lab.chap10;

public class Lion extends Animal {   //Animal 의 자식

  int eye ;
  int lionLeg ;
  
  int plus( int eye , int leg) {
	int sum = eye + leg;  
	return sum;
  }
	
  
  
  
 void lionEye () {	
	System.out.println("사자의 눈 개수는 " + eye + "개입니다."); 
 
  }
	
	
	
	
	
}
