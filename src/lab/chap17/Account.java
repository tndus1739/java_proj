package lab.chap17;

public class Account {

	//필드
	
	String name;					// 이름
	int account;			 		// 계좌번호
	int money = 10000;				// 계좌 잔액
	
    Account (){}
	
    Account (String name , int account, int money ){
    this.name = name ;
    this.account = account ;
    this.money = money;
    
    }
	
	
	void deposit (int money ) {		// 입금  -> 00원이 입금되었습니다. 계좌의 총금액은 00원입니다.
	this.money += money;
	 System.out.println(money + "원이 입급되었습니다.");
	 System.out.println(name+ "님의 계좌의 총액은 " + this.money + "원 입니다.");   // this.money  머니 money : 필드안의 머니 
	}

	void withdraw (int money) {      // 출금	-> 00원이 출금되었습니다. 잔고는 00원 입니다. 
	this.money -= money;
	System.out.println(money + "원이 출금되었습니다.");
	System.out.println(name+ "님의 계좌의 총액은 " + this.money + "원 입니다.");
	}
	
	// setter : name , account만 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", account=" + account + ", money=" + money + "]";
	}

	



}