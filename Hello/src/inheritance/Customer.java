package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerRank;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	public void initCustomer() {
		customerRank = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerRank + "이며, 보너스포인트는"
				+ bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerRank() {
		return customerRank;
	}

	public void setCustomerRank(String customerRank) {
		this.customerRank = customerRank;
	}
	
}
