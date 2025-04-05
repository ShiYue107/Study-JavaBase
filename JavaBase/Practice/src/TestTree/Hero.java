package TestTree;

//英雄类
public class Hero {
	//英雄名称
	private String name;
	//攻击力
	private int attack;
	//防御力
	private int defense;
	//金币
	private int money;
	//等级
	private int level;
	//人物简介
	private String introduction;
	//经验值
	private int exp;
	//装备
	private Equitpment[] equitpments = new Equitpment[6];
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String name, int attack, int defense, int money, int level, String introduction, int exp) {
		super();
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.money = money;
		this.level = level;
		this.introduction = introduction;
		this.exp = exp;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Equitpment[] getEquitpments() {
		return equitpments;
	}

	public void setEquitpments(Equitpment[] equitpments) {
		this.equitpments = equitpments;
	}
	
	
}
