package pack01_list;

import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list =  dao.getList();
		dao.getDisplay(list);
	}

}
