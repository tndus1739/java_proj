package lab.chap10.Fruit;

public class Banana  extends Fruit {

	
	Banana (){}
	Banana ( String name, int cnt , int price){
	super.name = name;
	super.cnt = cnt ;
	super.price = price;
	
	}
	
	@Override
	void totalPrice() {
		System.out.println( name + "의 전체 가격은 " + (cnt * price)+ "입니다.");
	}
}
//System.out.println(super.name + "의 전체 가격은 " + (super.cnt * super.price)+ "입니다.");
// 블럭이 상속되어서 내려왔기 때문에 super 써도 되고 안써도 됨 ( 써야할 때도 있음)