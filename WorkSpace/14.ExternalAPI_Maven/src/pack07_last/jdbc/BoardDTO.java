package pack07_last.jdbc;

public class BoardDTO {
	private int board_No;
	private String board_Title, board_Content, board_Writer, board_Date;
	public BoardDTO(int board_No, String board_Title, String board_Content, String board_Writer, String board_Date) {
		this.board_No = board_No;
		this.board_Title = board_Title;
		this.board_Content = board_Content;
		this.board_Writer = board_Writer;
		this.board_Date = board_Date;
	}
	public int getBoard_No() {
		return board_No;
	}
	public void setBoard_No(int board_No) {
		this.board_No = board_No;
	}
	public String getBoard_Title() {
		return board_Title;
	}
	public void setBoard_Title(String board_Title) {
		this.board_Title = board_Title;
	}
	public String getBoard_Content() {
		return board_Content;
	}
	public void setBoard_Content(String board_Content) {
		this.board_Content = board_Content;
	}
	public String getBoard_Writer() {
		return board_Writer;
	}
	public void setBoard_Writer(String board_Writer) {
		this.board_Writer = board_Writer;
	}
	public String getBoard_Date() {
		return board_Date;
	}
	public void setBoard_Date(String board_Date) {
		this.board_Date = board_Date;
	}

	
}
