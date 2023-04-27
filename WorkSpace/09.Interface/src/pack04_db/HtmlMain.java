package pack04_db;

public class HtmlMain {

	public static void main(String[] args) {
		dbWork(new MysqlDAO());
		dbWork(new OracleDAO());
		
	}
	//Oracle 또는 Mysql을 입력받아 select-delete하는 메소드
	
	public static void dbWork(DataAccessObject dao) {
		//mySql을 select..delete
		//oracle을 select..delete
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
				
	}
}
