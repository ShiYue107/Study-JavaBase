
public class HR {
	String name;
	String deptName;
	
	public HR() {
		
	}

	public HR(String name, String deptName) {
		this.name = name;
		this.deptName = deptName;
	}

	public void updateSalary(Employee e,double money) {
		if (e!=null) {
			e.salary+=money;
		}
	}
	
}
