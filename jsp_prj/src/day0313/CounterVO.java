package day0313;

/**
 * scope�Ӽ��� ���� �ٸ��� �����Ǵ� ��ü.
 * @author owner
 */
public class CounterVO {
	private int cnt;
  
	public CounterVO() {//int cnt �����ִ� �����ڴ� �ȵȴ�.
		System.out.println("CounterVO");
	}//CounterVO

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt += cnt;
	}
	
	
	
	
}
