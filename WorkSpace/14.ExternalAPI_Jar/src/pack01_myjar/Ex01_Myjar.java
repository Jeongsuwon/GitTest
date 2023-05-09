package pack01_myjar;

import java.util.ArrayList;
import java.util.List;

import pack01_list.BoardDAO;
import pack01_list.BoardDTO;
import phone.PhoneDAO;

public class Ex01_Myjar {
public static void main(String[] args) {
	//자바프로젝트를 계속해서 만들고있는데 해당하는 프로젝트가 기능을 가지고,
	//완성이 되어서 외부에서 사용이 되어야할 때 여러가지 확장자로 추출이 될 수 있다.(export)
	//Scanner, Random등은 사실 자바프로젝트로 이미 만들어놓고 추출되어 기본 Java언어에 포함되어 있는 기능들
//	BoardDAO dao = new BoardDAO();
//	List<BoardDTO> list = new ArrayList<BoardDTO>();
//	dao.getList();
	
	PhoneDAO dao = new PhoneDAO();
	dao.mobile();
	dao.powerOn();
}
}
