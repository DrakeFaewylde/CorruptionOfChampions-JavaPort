package src;

import javax.swing.JApplet;

public class ChampionsApplet extends JApplet { // TODO Convert JApplet requirement to JavaFX as a means of being rid of these errors
    private static ChampionsApplet instance;
    	
    public ChampionsApplet() {
        instance = this;
    }
    
    public void init() {
        this.setContentPane(new ChampionsUI());
    }
    
    public static ChampionsApplet getInstance() {
        return instance;
    }
}
