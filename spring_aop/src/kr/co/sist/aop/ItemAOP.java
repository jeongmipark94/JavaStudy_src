package kr.co.sist.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import kr.co.sist.domain.ItemDomain;

@Aspect
@Component
public class ItemAOP {
	//@After("execution( * searchItem(String))")
	@Before("execution( * searchItem(String))")
	public void beforeItem( JoinPoint jp) {
	//	System.out.println("after advice");
		System.out.println("before advice");
		//target method�� �Ű������� ó�� ( JoinPoint )
		Object[] params=jp.getArgs();
		//target method�� method���� ( �Ű�����, method��)
		Signature sig = jp.getSignature();
		System.out.println( "target method�� " + sig.getName());
		System.out.println( "target method ���������� " +
			(Modifier.toString(sig.getModifiers()) ));
		
		if( params != null) {
			System.out.println( "�Ű����� ���� " +params.length);
			for(Object param: params) {
				System.out.println("�Ű����� �� :"+ param);
			}//end for
		}//end if
	}//before
	
//	@Before("execution( * get*())") //��� Spring Bean�� getter ȣ��
//	@Before("execution( * kr.co.sist.service.ItemServiceImpl.get*())")//ItemServiceImple�� getter ȣ�� 
	@Before("execution( String kr.co.sist.service.ItemServiceImpl.get*())")//ItemServiceImple�� getter ȣ��
	//ItemServiceImpl �� ��ȯ���� String getter ȣ��
	public void getter() {
		System.out.println("getter before advice");
	}//getter
	
	@Around("execution(* searchData(..))")
	public ItemDomain around(ProceedingJoinPoint pjp) throws Throwable {
//		pjp.getArgs();//targer �Ķ���� ó��	
//		pjp.getSignature();//target method ����
		//signature�� method�� �̸��� return ���� �ֵ�
			
			//target�� �������� �޾ƿͼ� ������ �����.
		ItemDomain id= (ItemDomain)pjp.proceed(); //target method�� ������ ���� ���� object�� ��ȯ���ص���.
		if(id!=null) {
			id.setItem(id.getItem()+" s('.  ^)v");
		}//end if
		return id;
	}//around
/*	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		
		//target�� �������� �޾ƿͼ� ������ �����.
		Object o= pjp.proceed(); //target method�� ������ �� ��
		
		return o;
	}//around
*/	
}//class
