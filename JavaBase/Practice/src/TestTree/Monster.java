package TestTree;


public class Monster {
	//怪物名称
	private String name;
	//攻击力
	private int attack;
	//防御力
	private int defense;
	//生命力
	private int life;
	//怪物经验
	private int killExp;
	//怪物金币
	private int killMoney;
	
	public Monster() {
		// TODO Auto-generated constructor stub
	}
	public Monster(String name, int attacke, int defense, int life, int killExp, int killMoney) {
		super();
		this.name = name;
		this.attack = attacke;
		this.defense = defense;
		this.life = life;
		this.killExp = killExp;
		this.killMoney = killMoney;
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
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getKillExp() {
		return killExp;
	}
	public void setKillExp(int killExp) {
		this.killExp = killExp;
	}
	public int getKillMoney() {
		return killMoney;
	}
	public void setKillMoney(int killMoney) {
		this.killMoney = killMoney;
	}
}
