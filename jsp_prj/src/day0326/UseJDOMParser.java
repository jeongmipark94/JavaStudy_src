package day0326;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


/**
 * JDOM Parser ��� 
 * @author owner
 */
public class UseJDOMParser {
	
	public UseJDOMParser() throws JDOMException, IOException {
		//1. Parser ����
		SAXBuilder builder=new SAXBuilder();
		//2. XML������ ��ü ����
		//local
		//Document doc=builder.build(new File("C:/dev/workspace/jsp_prj/WebContent/xml0326/names.xml"));
		//web Server
		Document doc=builder.build(new URL("http://localhost:8080/jsp_prj/xml0326/names.xml"));
		//URL�� �ǰ� File�� �ȴ�.
		//System.out.println(doc); 
		//3. ���� ��ü���� �ֻ��� �θ��� ���
		Element rootNode=doc.getRootElement(); 
		//System.out.println(rootNode); 
		//4. �θ� ����� �ڽ� ��� ���
		Iterator<Element> namesNode=rootNode.getChildren().iterator();
		//�ڽ� ��� ��ȯ.
		Element nameNode=null;
		while( namesNode.hasNext()) {
			//�ڽ� ��� ���
			nameNode=namesNode.next();
			System.out.println("����:"+nameNode.getName());
			System.out.println("��尪:"+nameNode.getValue());
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
