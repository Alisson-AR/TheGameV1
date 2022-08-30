package player;

public class Weapon extends Skill{
	private	String type;
	private int damage;
	//Skill ice = new Skill();
	
	public Weapon(String type, int damage, String skillName, int cost, int damag) {
		super(skillName, cost, damag);
		this.type = type;
		this.damage = damage;
	}
	
	public Weapon() {
		
	}
	

	
	
	public Weapon(String type, int damage) {
		this.type = type;
		this.damage = damage;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
