package day0327;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AttParsing {

	public List<AttVO> personData(String lastName) throws MalformedURLException, JDOMException, IOException{
		List<AttVO> list=new ArrayList<AttVO>();
		
		//1. Builder 생성 (Parser)
		SAXBuilder builder= new SAXBuilder();
		//2.xml 읽어들여 객체 저장
		Document doc=builder.build(new URL("http://localhost:8080/jsp_prj/xml0327/att.xml"));
		//3. 최상위 부모노드 얻기
		Element rootNode = doc.getRootElement();//persons node
		//4. 처음 자식노드들 얻기
		Iterator<Element> personNodes=rootNode.getChildren().iterator();
		//5.얻어낸 모든 person node를 반복
		Element personNode=null;
		Attribute lastAtt=null;//lastName 속성을 저장
		Attribute cityAtt=null;//city속성을 저장
		Attribute zipcodeAtt=null;//zipcode속성을 저장
		String lastNameAtt="";
		
		Iterator<Element> personSubNodes=null;
		Element someNode=null;//person의 자식 노드들 받기 , name, address
		
		AttVO avo=null;
		
		
		while( personNodes.hasNext()) {//personNodes얻어 반복
			personNode=personNodes.next();//반복중인 personNode하나 얻기
			//person의 자식 노드들 얻기 name, address
			personSubNodes=personNode.getChildren().iterator();
			while( personSubNodes.hasNext()) {
				someNode=personSubNodes.next();//name, address
				//입력된 성씨로 값을 생성해야하므로 성씨가 있는 name노드를 비교
				
				//1. name노드면
				if("name".equals(someNode.getName())) {
					lastAtt=someNode.getAttribute("lastname");//성씨 속성 얻기
					lastNameAtt=lastAtt.getValue();//속성 값 얻기
				
					if(lastName.equals(lastNameAtt)) {//김씨일 때만
						avo=new AttVO(); //값을 저장할 VO생성하고
						avo.setFirstName(someNode.getText());//이름과
						avo.setLastName(lastNameAtt);//성씨를 추가
					}//end if
				}//end if
				
				//2.성이 같다면
				if(lastName.equals(lastNameAtt)) {//매개변수로 입력된 성씨와 같을 때
					//주소의 노드 값 set
					if("address".equals(someNode.getName())) {//address노드 얻기
						
						cityAtt=someNode.getAttribute("city");//city 속성 얻기
						zipcodeAtt=someNode.getAttribute("zipcode");//zipcode속성얻기
						
						avo.setCity(cityAtt.getValue());
						avo.setZipcode(zipcodeAtt.getValue());
						avo.setAddress(someNode.getText());
						list.add(avo);// parsing한 값을 가진 객체를 list에 추가
					}//end if
				}//end if
			}//end while
		}//end while
		
		return list;
	}//personData
	
	public static void main(String[] args) {
		AttParsing a= new AttParsing();
		try {
			System.out.println(a.personData("정"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
