package kr.co.sist.run;

import java.util.List;

import kr.co.sist.assembly.Assembly;
import kr.co.sist.service.Service;
import kr.co.sist.vo.EmpVo;

/**
 * 조립자 클래스를 사용하여 서비스객체를 얻고 서비스를 사용하는 일.- (이 작업 controller에서 해주면 됨 실제로는)
 * @author owner
 */
public class UseAssembly {//약결합으로 한 결과 , 밖에서보면 약결합인지 강결합인지 모른다.
//일처리한 클래스 건드리지않고 assembly만 바꿔줬는데 결과가 바뀜
	public static void main(String[] args) {
		Assembly as=new Assembly();
		Service service = as.getBean();
		service.addEmp(new EmpVo(1234, "테스트"));
		System.out.println("------------------------------------");

		List<EmpVo> list= service.searchEmp();
		for( EmpVo emp : list) {
			System.out.println(emp.getEmpno()+" / " + emp.getEname());
		}//end for
	}//main

}//class
