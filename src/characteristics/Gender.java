package src.characteristics;

import src.actors.Actor;

public enum Gender {
	NONE, MALE, FEMALE, HERM;
	
	public static Gender get(Actor a) {
		return a.getGender();
	}
}
