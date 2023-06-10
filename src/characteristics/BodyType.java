package src.characteristics;


public enum BodyType {
	THIN("Lean", "Slender"),
	AVERAGE("Average", "Average"),
	THICK("Thick", "Curvy"),
	OPPGEN("Girly", "Tomboyish");
	
	private final String m;
	private final String f;
	
	BodyType(String forMales, String forFemales) {
		this.m = forMales;
		this.f = forFemales;
	}
	
	public String getName(Gender g) {
    if (g == Gender.MALE) {
      return this.m;
    } else if (g == Gender.FEMALE) {
      return this.f;
    }
    throw new IllegalArgumentException();
	}
}
