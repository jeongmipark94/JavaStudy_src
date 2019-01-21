package kr.co.sist.lunch.user.vo;

public class OrderListVO {
	private String lunchName, orderDate;
	private int quan;
	public OrderListVO(String lunchName, String orderDate, int quan) {
		this.lunchName = lunchName;
		this.orderDate = orderDate;
		this.quan = quan;
	}//OrderListVO
	
	
	
	public String getLunchName() {
		return lunchName;
	}
	public String getorderDate() {
		return orderDate;
	}
	public int getQuan() {
		return quan;
	}
	
	
	
	@Override
	public String toString() {
		return "OrderListVO [lunchName=" + lunchName + ", orderDate=" + orderDate + ", quan=" + quan + "]";
	}
	
	
	
	

}//class
