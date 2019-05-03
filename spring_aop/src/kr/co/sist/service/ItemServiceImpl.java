package kr.co.sist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.ItemDAO;
import kr.co.sist.domain.ItemDomain;
@Component
//@Component("xxx") ���� id�� �ο��ؼ� ã�� �� ���� 
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemDAO i_dao;
	
	@Override
	public ItemDomain searchItem(String name){
		
	System.out.println("--------searchItem ȣ�� ------");
		return i_dao.selectItem(name);
	}//searchItem

	@Override
	public String getName() {
		String name="������";
		System.out.println( "getName///"+name);
		return name;
	}//getName

	@Override
	public String getAddr() {
		String addr="����� ������ ���ﵿ ";
		
		System.out.println("-----DAO-----"+i_dao.getDbName());
		System.out.println( "getAddr////////"+addr);
		return addr;
	}//getAddr

	@Override
	public int getAge() {
		int age=20;
		System.out.println( "------getAge"+age);
		return age;
	}//getAge

	@Override
	public ItemDomain searchData(String name) {
		return new ItemDomain("IO_O001",name+" �ֹ���, ũ��Ŀ,,,,,");
	}//searchData
}//class








