package kr.co.sist.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.exam.domain.Car;
import kr.co.sist.exam.domain.CarModel;
import kr.co.sist.exam.domain.Demp;
import kr.co.sist.exam.domain.DiaryList;
import kr.co.sist.exam.domain.DynamicIf;
import kr.co.sist.exam.domain.Emp;
import kr.co.sist.exam.domain.EmpJoin;
import kr.co.sist.exam.domain.Union;
import kr.co.sist.exam.domain.Zipcode;
import kr.co.sist.exam.vo.DeptnoVO;
import kr.co.sist.exam.vo.DiaryListParamVO;
import kr.co.sist.exam.vo.EmpVO;
import kr.co.sist.exam.vo.TnameVO;

public class CarDAO {
//car_mapper.xml���� selectList�� ""�� ��
	public List<String> selectMaker(String country){
		List<String> list=null;
		//4. Handler ���
		SqlSession ss= MyBatisDAO.getInstance().getSessionFactory().openSession();
		
		list=ss.selectList("selectCarContry", country);
		
		ss.close();
		return list;
	}//selectMaker
	
	
	public List<String> selectModel(String maker){
		List<String> list=null;
		//4. Handler ���
		SqlSession ss= MyBatisDAO.getInstance().getSessionFactory().openSession();
		
		list=ss.selectList("selectCarMaker", maker);
		
		ss.close();
		return list;
	}//selectModel
	
	
	public List<CarModel> selectDetailModel(String model){
		List<CarModel> list=null;
		//4. Handler ���
		SqlSession ss= MyBatisDAO.getInstance().getSessionFactory().openSession();
		
		list=ss.selectList("selectCarModel", model);
		
		ss.close();
		return list;
	}//selectModel
	

	
	public static void main(String[] args) {
		CarDAO md=new CarDAO();
		md.selectMaker("����");
		//md.selectModel("����");
		//md.selectDetailModel("�ƹ���");
		//���� �� ��ȸ�Ǵ��� Ȯ�� 
	}//main
	
}//class
