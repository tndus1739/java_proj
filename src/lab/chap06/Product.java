package lab.chap06;

public class Product {
	// 1. 필드
	
	private long idx;			//번호
	private String proName;		//제품명
	private int qty;			//제품개수
	private int year;			//생산년도
	private String proColor;	// 제품색깔
	
	
	// 2. 생성자
	
	Product(){}

	// 3. 메소드 : ★★★★★ getter(출력) / setter (필드의 값을 입력)를 사용해서 필드의 값을 출력 / 입력      (마우스 오른족 source - generate getter and setter) 
	
	public long getIdx() {
		return idx;
	}


	public void setIdx(long idx) {
		this.idx = idx;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getProColor() {
		return proColor;
	}


	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	@Override
	public String toString() {
		return "Product [idx=" + idx + ", proName=" + proName + ", qty=" + qty + ", year=" + year + ", proColor="
				+ proColor + "]";
	}
	
	
	
	
	
}
