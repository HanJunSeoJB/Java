package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	/*public VIPCustomer( ) {
		customerRank = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}*/
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerRank = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원의 아이디는" + agentID +"입니다.";
	}
	
}
