package pack04_db;

//A : Oracle을 이용해서 db 작업
public class OracleDAO implements DataAccessObject {
	@Override
	public void select() {
		System.out.println(IP+"에 접근해서 Oracle select");
	}
	@Override
	public void insert() {
		System.out.println(IP+"에 접근해서 Oracle insert");
		
	}
	@Override
	public void update() {
		System.out.println(IP+"에 접근해서 Oracle update");
		
	}
	@Override
	public void delete() {
		System.out.println(IP+"에 접근해서 Oracle delete");
		
	}
}
