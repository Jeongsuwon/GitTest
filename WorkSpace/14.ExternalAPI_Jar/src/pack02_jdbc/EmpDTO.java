package pack02_jdbc;

public class EmpDTO {
	public EmpDTO(int employee_id, String name, String email) {
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
	}
	private int employee_id;
	private String name, email;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
