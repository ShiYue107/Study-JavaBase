
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("С��",5000.00,"������");
		System.out.println("��нǰ,"+e1.name+"�Ĺ���Ϊ"+e1.salary);
		HR r=new HR("����","���²�");
			r.updateSalary(e1,2300);
		System.out.println(r.name+"��"+e1.name+"��н��,"+e1.name+"�Ĺ���Ϊ"+e1.salary);
	}
}
