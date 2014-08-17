// 6 ครึ่งต้นคูณ
public class SimpleInheritance {
	public static void main(String [] args){
		MemCustomer cus = new MemCustomer();
		System.out.println("Customer ID : " +cus.getCusId());
		System.out.println("Customer name : " +cus.getCusName());
		System.out.println("Sum production price : " +cus.getTotalPrice());
		System.out.println("Discount : " +cus.getDiscount());
		cus.calNetPrice();
	}
}
class Customer{
	String cusId = "A0101";
	String cusName = "Deferner Breaker";
	double totalPrice = 2532, netPrice = 0.0;
	
	public String getCusId(){
		return cusId;
	}
	public String getCusName(){
		return cusName;
	}
	public Double getTotalPrice(){
		return totalPrice;
	}
}
class MemCustomer extends Customer{
	double discount;
	
	public double getDiscount(){
		return discount = 0.15;
	}
	public void calNetPrice(){
		netPrice = totalPrice - (totalPrice*discount);
		System.out.println("Price after discount : " +netPrice);
	}
}
