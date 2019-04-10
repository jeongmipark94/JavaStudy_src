package kr.co.sist.exam.service;

import java.util.List;

import kr.co.sist.exam.dao.CarDAO;
import kr.co.sist.exam.dao.MyBatisDAO1;
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

public class CarService {
	private CarDAO cd;
	public CarService() {
		cd= new CarDAO();
	}//CarService
	
	public List<String> searchMaker(String country){
		List<String> list=null;
		list=cd.selectMaker(country);
		return list;
	}//searchMaker
	
	public List<String> searchModel(String maker){
		List<String> list=null;
		list=cd.selectModel(maker);
		return list;
	}//searchModel
	
	
	public List<CarModel> searchDetailModel(String model){
		List<CarModel> list=null;
		list=cd.selectDetailModel(model);
		return list;
	}//searchDetailModel
	
	
}//class
