package day0326;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


/**
 * JDOM Parser 사용 
 * @author owner
 */
public class UseJDOMParser {
	
	public UseJDOMParser() throws JDOMException, IOException {
		//1. Parser 생성
		SAXBuilder builder=new SAXBuilder();
		//2. XML문서를 객체 저장
		//local
		//Document doc=builder.build(new File("C:/dev/workspace/jsp_prj/WebContent/xml0326/names.xml"));
		//web Server
		Document doc=builder.build(new URL("http://localhost:8080/jsp_prj/xml0326/names.xml"));
		//URL도 되고 File도 된다.
		//System.out.println(doc); 
		//3. 문서 객체에서 최상위 부모노드 얻기
		Element rootNode=doc.getRootElement(); 
		//System.out.println(rootNode); 
		//4. 부모 노드의 자식 노드 얻기
		Iterator<Element> namesNode=rootNode.getChildren().iterator();
		//자식 노드 순환.
		Element nameNode=null;
		while( namesNode.hasNext()) {
			//자식 노드 얻기
			nameNode=namesNode.next();
			System.out.println("노드명:"+nameNode.getName());
			System.out.println("노드값:"+nameNode.getValue());
		}//end while
		
		System.out.println(namesNode);
	}//UseJDOMParser

	public static void main(String[] args) {
		try {
			new UseJDOMParser();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
