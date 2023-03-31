package inheritance;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerSin = new Customer(10020, "신삼당");
		Customer customerYoul = new GoldCustomer(10030, "이율곡");
		Customer customerHong = new GoldCustomer(10040, "홍길동");
		Customer customerKim = new VIPCustomer(10050, "김유신", 1020);
		
		customerList.add(customerKim);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerSin);
		customerList.add(customerLee);
		
		System.out.println("========고객정보 출력========");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("========할인율과 포인트 계산========");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " +
			cost + "원 지불하셨습니다");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는"
					+ customer.bonusPoint + "점입니다.");
		}
	}

}
