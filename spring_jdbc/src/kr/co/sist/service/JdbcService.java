package kr.co.sist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.jdbcDAO;

@Component
public class JdbcService {
		@Autowired(required=false)
		private jdbcDAO jdao;
	
		public void daoPrint() {
			System.out.println(" �������� ��ü(JDBC Template) : "+ jdao.getJt());
		}
		
	
}
