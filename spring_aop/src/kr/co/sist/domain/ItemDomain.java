package kr.co.sist.domain;

public class ItemDomain {
	private String itemNo, item;

	public ItemDomain(String itemNo, String item) {
		super();
		this.itemNo = itemNo;
		this.item = item;
	}

	public ItemDomain() {
		super();
	}

	public String getItemNo() {
		return itemNo;
	}

	public String getItem() {
		return item;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
	
}
