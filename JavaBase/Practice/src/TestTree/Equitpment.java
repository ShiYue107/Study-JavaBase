package TestTree;

//װ����
public class Equitpment {
	//װ������
	private String name;
	//������
	private int attack;
	//������
	private int defense;
	//�۸�
	private int price;
	
	public Equitpment() {
		// TODO Auto-generated constructor stub
	}
	
	public Equitpment(String name, int attack, int defense, int price) {
		super();
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
