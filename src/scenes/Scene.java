package src.scenes;

import src.actors.Actor;
import src.actors.Player;

public interface Scene {
	void displayText(Player me, Actor enemy); // me and enemy are null if not applicable
	Scene action(Player me, Actor enemy, int button);
	// | 1 | 2 | 3 | 4 | 5 |
	// | 6 | 7 | 8 | 9 | 10|
}
