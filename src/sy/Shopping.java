package sy;

public class Shopping {

	String name;
	int price;
	int cnt;
	
	Shopping (){}
	
	Shopping ( String name , int price, int cnt ){
	this.name = name;
	this.price = price;
	this.cnt = cnt ;
	}
	
	// 메소드
	
	int multi ( int price, int cnt) {
		int totalPrice = price * cnt;
		return totalPrice;
		
	}
	
	void toto (){
		System.out.println("총 구매하신 금액은" + (price * cnt) +"원 입니다.");
	}
	
	void name (String name) {
		System.out.println(name +"을 구매하셨습니다.");
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Shopping [name=" + name + ", price=" + price + ", cnt=" + cnt + "]";
	}
	
	
	
}
