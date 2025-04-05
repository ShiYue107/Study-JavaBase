package dome01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="张三";
		p1.age=18;
		
		Person p2=new Person();
		p2.name="李四";
		p2.age=19;
		
		Person p3=new Person();
		p3.name="王五";
		p3.age=20;
		
		Person.country="昆明";
		
		System.out.println(p1.name+"-"+p1.age+"-"+Person.country);
		System.out.println(p2.name+"-"+p2.age+"-"+Person.country);
		System.out.println(p3.name+"-"+p3.age+"-"+Person.country);
	}
}
