package pack02_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class EmpDAO { //실제 db와 연동하여 요구사항 처리 후 리턴
	private Connection conn; //연결 객체
	private PreparedStatement ps; //전송 실행 객체
	private ResultSet rs; //결과 객체
	
	//'db 접속'이 하나의 기능으로 만들고 재활용( 성공하면 그 다음 -> ps 사용)
	public Connection getConn() {
		//접속 시 필요한 것 : 접속 주소(url), 계정(user), 암호(password)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

	public void testDb() {

		conn = getConn();//연결객체 초기화
		String sql = "select 3 test from dual";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("쿼리 결과: "+rs.getInt("test"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//data가 테스트할 때까지는 row(행) 개수가 1이었음. -> 107
	public ArrayList<EmpDTO> selectEmp() {
		conn = getConn();
		String sql = "select EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME name, EMAIL from employees";
		ArrayList<EmpDTO> list = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO(rs.getInt("employee_id"), rs.getString("name"), rs.getString("email"));
				list.add(dto);
				System.out.println(dto.getEmployee_id() + dto.getName() + dto.getEmail());
			}
			System.out.println(list.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

