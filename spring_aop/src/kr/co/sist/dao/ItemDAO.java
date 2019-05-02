package kr.co.sist.dao;

import java.sql.SQLException;

import kr.co.sist.domain.ItemDomain;

public interface ItemDAO {
	public ItemDomain selectItem(String name)throws NumberFormatException;
		
	
}//ItemDAO
