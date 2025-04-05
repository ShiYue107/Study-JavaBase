
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("小锋",5000.00,"开发部");
		System.out.println("加薪前,"+e1.name+"的工资为"+e1.salary);
		HR r=new HR("马大哥","人事部");
			r.updateSalary(e1,2300);
		System.out.println(r.name+"给"+e1.name+"加薪后,"+e1.name+"的工资为"+e1.salary);
	}
}
