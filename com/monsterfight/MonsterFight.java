package com.monsterfight;

import com.monsterfight.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MonsterFight {
    private static final int HEALTH_ZERO = 0;
    private static final int FIGHT_GOBLIN = 0;
    private static final int FIGHT_TROLL = 1;

	public static void main (String[] args) {
		Monster goblin = new Monster("goblin",10,2);
		Monster troll = new Monster("troll",50,6);
		System.out.println(goblin.getName() + " health:" + goblin.getHealth());
		System.out.println(troll.getName() + " health:" + troll.getHealth());
		while(goblin.getHealth() > HEALTH_ZERO 
				& troll.getHealth() > HEALTH_ZERO){
			try{

				int whoAttacks = Monster.getRandomInteger(FIGHT_GOBLIN,FIGHT_TROLL);
				if(whoAttacks == FIGHT_GOBLIN){
					System.out.println("Goblin attacks");
					goblin.fight();
				}else if(whoAttacks == FIGHT_TROLL){
					System.out.println("Troll attacks");
					troll.fight();
				}

				if(goblin.getHealth() > 0 && troll.getHealth() > 0){
					System.out.println(goblin.getName() + 
							" health: " + goblin.getHealth());
					System.out.println(troll.getName() + 
							" health: " + troll.getHealth() + "\n");
				}

				TimeUnit.SECONDS.sleep(1);
			}catch(Exception e){
				System.out.println("Exception caught:" +e);
			}
		}

	}
}

