package kr.co.sist.lunch.user.vo;

public class OrderAddVO {
	private String orderName, phone,	ip_address, lunchCode;	
	private int quan;
	
	
	public OrderAddVO(String orderName, String phone, String ip_address, String lunchCode, int quan) {
		this.orderName = orderName;
		this.phone = phone;
		this.ip_address = ip_address;
		this.lunchCode = lunchCode;
		this.quan = quan;
	}
	
	
	public String getOrderName() {
		return orderName;
	}
	public String getPhone() {
		return phone;
	}
	public String getIp_address() {
		return ip_address;
	}
	public String getLunchCode() {
		return lunchCode;
	}
	public int getQuan() {
		return quan;
	}
	
	
	
}
