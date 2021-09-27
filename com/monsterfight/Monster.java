package com.monsterfight;

public class Monster {

	private static final int DAMAGE_NO = 0;
	private static final int DAMAGE_GET = 1;
	private static final int NO_HEALTH = 0;

	private String name;
	private int damage;
	private int health;

	public void fight(){
		int fightResult = getRandomInteger(DAMAGE_NO,DAMAGE_GET);
		System.out.println("FightResult:" + fightResult);
		if(fightResult == DAMAGE_NO){
			System.out.println(getName() + " gets no damage. " + getName() + " health:" + getHealth());
		}else if(fightResult == DAMAGE_GET){
			System.out.println(getName() + " gets " + getDamage() +" damage.");
			setHealth(getHealth()-getDamage());
			System.out.println(getName() + " health after damage: " + getHealth());
			if(getHealth() == NO_HEALTH)
				die(getName());
		}
	}

	public void die(String name){
		System.out.println("\n\nFight Result: " + name+ " died.\n");

	}

	public Monster(){}

	public Monster(String name, int health, int damage){
		this.name=name;
		this.damage=damage;
		this.health=health;
		System.out.println(name + " created.");
	}

	public void setName(String name){
		this.name=name;
	}

	public void setDamage(int damage){
		this.damage = damage;
	}

	public void setHealth(int health){
		this.health= health;
	}

	public String getName(){
		return name;
	}

	public int getDamage(){
		return damage;
	}

	public int getHealth(){
		return health;
	}

	public static int getRandomInteger(int min, int max){ 
		return (int)Math.floor(Math.random()*(max-min+1)+min);
	}

}