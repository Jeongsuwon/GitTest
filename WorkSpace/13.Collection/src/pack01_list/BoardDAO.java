package pack01_list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	
	public List<BoardDTO> getList() {
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		list.add(new BoardDTO(1, "정수원", "아자"));
		list.add(new BoardDTO(2, "수원", "아자"));
		list.add(new BoardDTO(3, "원", "아자"));
		return list;
		
		
	}
	
	public void getDisplay(List<BoardDTO> list) {
//			for(BoardDTO dto : list) {
//				System.out.println(dto.getNum());
//				System.out.println(dto.getTitle());
//				System.out.println(dto.getContent());
//			}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNum());
			System.out.println(list.get(i).getTitle());
			System.out.println(list.get(i).getContent());
		}
		
		
	
		}
	
	
}
