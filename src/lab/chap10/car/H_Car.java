package lab.chap10.car;

public class H_Car extends Car {

	@Override 		// @(어노테이션) 스프링에 많이 나옴		//@Override : 부모의 메소드를 오버라이딩 하겠다고 선언
	void run() {									// run입력하고 ctrl + space
		System.out.println("현대자동차는 부릉하고 달립니다.");
	}
	
	// @Override를 붙이지 않고도 오버라이딩이 되기는 한다.
	// @Override를 붙이지 않고 부모의 메소드를 오버라이딩을 하려고 했는데 오타가 발생하면 부모에게 없는 메소드가 되어버리니까 주의
	// @Override를 붙이면 오타나는거 잡아줌
}
