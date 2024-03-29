package javaGame;

public class Player2 extends Player1 {
	
	private int health;
	private Boolean shield;
	
	public Player2(String name, String weapon, int health, boolean shield ) {
		super(name, weapon, health);
		this.health = health;
		this.shield = shield;
	}
	
	public void damageByGun1() {
		if (shield) {
			this.health -= 10;
			if(this.health <= 0) {
				this.health = 0;
			}
			System.out.println("Shield is ON! Got hit by Gun1. Health is Reduced by 10. New health is " + this.health);
		}
		if (!shield) {
			this.health -= 40;
			if(this.health <= 0) {
				this.health = 0;
			}
			System.out.println("Shield is OFF! Got hit by Gun1. Health is Reduced by 40. New health is " + this.health);
		}
	}
}

