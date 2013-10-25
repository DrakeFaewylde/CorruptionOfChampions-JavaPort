package com.fenoxo.coc.zadenikt_java_port;

public class Perk {
	public static final Perk NULL = 					null; // Essentially, debug.
	
	// I added changed the gifts to "Gift: PerkName". Because I sez so.
	public static final Perk GIFT_STRONG =				new Perk("Gift: Strong");
	public static final Perk GIFT_TOUGH =				new Perk("Gift: Tough");
	public static final Perk GIFT_FAST =				new Perk("Gift: Fast");
	public static final Perk GIFT_SMART =				new Perk("Gift: Smart");
	public static final Perk GIFT_LUSTY =				new Perk("Gift: Lusty");
	public static final Perk GIFT_SENSITIVE =			new Perk("Gift: Sensitive");
	public static final Perk GIFT_BIG_COCK =			new Perk("Gift: Big Cock");
	public static final Perk GIFT_MESSY_ORGASMS =		new Perk("Gift: Messy Orgasms");
	public static final Perk GIFT_BIG_TITS =			new Perk("Gift: Big Tits");
	public static final Perk GIFT_BIG_CLIT =			new Perk("Gift: Big Clit");
	public static final Perk GIFT_FERTILE =				new Perk("Gift: Fertile");
	public static final Perk GIFT_WET_PUSSY =			new Perk("Gift: Wet Pussy");
	
	public static final Perk HISTORY_ALCHEMIST =		new Perk("History: Alchemist");
	public static final Perk HISTORY_FIGHTER =			new Perk("History: Fighter");
	public static final Perk HISTORY_HEALER =			new Perk("History: Healer");
	public static final Perk HISTORY_RELIGIOUS =		new Perk("History: Religious");
	public static final Perk HISTORY_SCHOLAR =			new Perk("History: Scholar");
	public static final Perk HISTORY_SLACKER =			new Perk("History: Slacker");
	public static final Perk HISTORY_SLUT =				new Perk("History: Slut");
	public static final Perk HISTORY_SMITH =			new Perk("History: Smith");
	public static final Perk HISTORY_WHORE =			new Perk("History: Whore");
	
	public static final Perk UNSORTED_TANK =			new Perk("Tank");
	public static final Perk UNSORTED_TANK_2 =			new Perk("Tank 2");
	public static final Perk UNSORTED_ONE_TRACK_MIND =	new Perk("One Track Mind");
	
	public static final Perk HOLIDAY_CORNUCOPIA =		new Perk("Cornucopia");
	
	protected String name;
	
	private Perk() { this("Unnamed"); }
	private Perk(String name) {
		this.name = name;
	}

	public void add(ChampionsApplet applet, Actor me) {
		applet.log(me.toString() + " got the perk " + this.name+ "!");
	}
	public void remove(ChampionsApplet applet, Actor me) {
		applet.log(me.toString() + " lost the perk " + this.name + "!");
	}
	
	//For overriding:
	public void onAttack(ChampionsApplet applet, Actor me, Actor enemy) {}
	public void onGotAttacked(ChampionsApplet applet, Actor me, Actor enemy) {}
}
