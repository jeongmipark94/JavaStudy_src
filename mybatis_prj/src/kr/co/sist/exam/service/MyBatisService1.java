package kr.co.sist.exam.service;

import java.util.List;

import kr.co.sist.exam.dao.MyBatisDAO1;
import kr.co.sist.exam.domain.DiaryList;
import kr.co.sist.exam.domain.Emp;
import kr.co.sist.exam.domain.EmpJoin;
import kr.co.sist.exam.domain.Union;
import kr.co.sist.exam.domain.Zipcode;
import kr.co.sist.exam.vo.DiaryListParamVO;
import kr.co.sist.exam.vo.EmpVO;

public class MyBatisService1 {
	public List<Emp> multiParam(EmpVO ev){
		List<Emp> list=null;
		MyBatisDAO1 mb_dao1= new MyBatisDAO1();
		list=mb_dao1.multiParam(ev);
		return list;
	}//multiParam
	
	public List<Emp> lessThan(int sal){
		List<Emp> list=null;
		
		if(sal < 0) {
			sal=-sal;
		}//emd if
		MyBatisDAO1 md_dao1= new MyBatisDAO1();
		list= md_dao1.lessThan(sal);
		
		return list;
	}//lessThan
	public List<Emp> greaterThan(int sal){
		List<Emp> list=null;
		
		if(sal < 0) {
			sal=-sal;
		}//emd if
		MyBatisDAO1 md_dao1= new MyBatisDAO1();
		list= md_dao1.greaterThan(sal);
		
		return list;
	}//lessThan
	
	public List<Zipcode> like(String dong){
		List<Zipcode> list= null;
		
		MyBatisDAO1 mb_dao=new MyBatisDAO1();
		list=mb_dao.like(dong);
		
		return list;
	}//like
	
	//////////////////////////////게시판의 리스트////////////////
	//게시판의 총 갯수
	public int totalCount() {
		int cnt=0;
		MyBatisDAO1 mb_dao=new MyBatisDAO1();
		cnt= mb_dao.diaryTotalCount();
		return cnt;
	}//totalCount
	//한화면에 보여줄 게시물의 갯수
	public int pageScale() {
		return 10;//10개씩 보여주기
	}//pageScale
	//총페이지수
	public int totalPage(int totalCount, int pageScale) {
		int totalPage=0;
		totalPage=(int)Math.ceil((double)totalCount/pageScale);//정수/정수=정수라서 (double) 해준다.
		return totalPage;
	}//totalPage
	
	//시작번호
	public int startNum(String currentPage, int pageScale) {
		int startNum=1;
		
		if(currentPage!=null) {
		int tempPage=Integer.parseInt(currentPage);
		startNum=tempPage*pageScale-pageScale+1;
		}//end if
		return startNum;
	}//startNum

	public int endNum(int startNum, int pageScale) {
		return startNum+pageScale-1;
		
	}//endNum

	public List<DiaryList> diaryList( DiaryListParamVO dlp_vo){
		List<DiaryList> list=null;
		
		MyBatisDAO1 mb_dao=new MyBatisDAO1();
		list=mb_dao.subquery(dlp_vo);//이렇게 해주면 시작과 끝번호를 가지고 오게 된다.
		
		return list;
	}//diaryList
	
	public List<Union> union(){
		List<Union> list=null;
		
		MyBatisDAO1 mb_dao=new MyBatisDAO1();
		
		list= mb_dao.union();
		
		return list;
	}//union
	
	public List<EmpJoin> join(int mgr){
		List<EmpJoin> list=null;
		
		MyBatisDAO1 mb_dao=new MyBatisDAO1();
		list=mb_dao.join(mgr);
		
		return list;
	}//Join
	
}//class
