package pack04_db;

public interface DataAccessObject {
	// DAO : 데이터베이스에 접근해서 데이터를 조작 (CRUD)

	//Oracle(Oracle Database, My SQL
	
	String IP ="192.168.0.28";
	
	public void select();
	public void insert();
	public void update();
	public void delete();
	
}
