package src.equipment;

import src.equipment.Item;
import src.actors.Actor;
import src.characteristics.Perk;

public class Weapon extends Item {
	public static final Weapon FISTS = null;
	
	protected final int attack;
	protected final Perk perk;
	protected final String verb;

	public Weapon(String shortName, String name, String verb, String desc, int value, int attack) {
		this(shortName, name, verb, desc, value, attack, Perk.NULL);
	}
	public Weapon(String shortName, String name, String verb, String desc, int value, int attack, Perk perk) {
		super(shortName, name, desc, value);
		this.verb = verb;
		this.attack = attack;
		this.perk = perk;
	}
	
	public void action(Actor user) {
		user.equipWeapon(this);
	}
}
