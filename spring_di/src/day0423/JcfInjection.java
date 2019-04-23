package day0423;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JcfInjection {
	private List<String> list;
	private List<TestVO> voList;
	private Set<String> set;
	private Map<String, String> map;
	
	public JcfInjection(Map<String, String>map) {
		this.map=map;
	}//jcfinjection
	
	public JcfInjection(List<String> list) {
		this.list=list;
		System.out.println(" List��  Injection�޾ҽ��ϴ�.");
	}//jcfInjection
	
	public JcfInjection(List<TestVO> voList, int i) {
		this.voList=voList;
		System.out.println(" voList�� Injection�Ǿ����ϴ�.");
	}//jcfInjection

	public JcfInjection(Set<String> set) {
		this.set=set;
		System.out.println(" Set��  Injection�Ǿ����ϴ�.");
	}//jcfInjection
	
	public List<String> getList(){
		return list;
	}//getList
	
	public Set<String> getSet(){
		return set;
	}//getSet

	public List<TestVO> getVoList() {
		return voList;
	}//getVoList

	public Map<String, String> getMap() {
		return map;
	}//getMap
	
	
}//class
