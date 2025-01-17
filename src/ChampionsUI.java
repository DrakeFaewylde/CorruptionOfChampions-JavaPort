package src;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;

public class ChampionsUI extends JPanel {
    private final JEditorPane output;
    private final JButton[] buttons = new JButton[10];
    
    public ChampionsUI() {
        super(null);
        this.setBounds(0, 0, 800, 600);
        output = new JEditorPane();
        output.setBounds(200, 0, 600, 500);
        output.setEditable(false);
        this.add(output);
        JPanel sidebar = new JPanel(null);
        sidebar.setBounds(0, 0, 200, 500);
        this.add(sidebar);
        JPanel buttonPanel = new JPanel(null);
        buttonPanel.setBounds(200, 500, 600, 100);
        for(int i = 0; i < buttons.length; i++) {
            int rowOffset = (i > 4) ? 30 : 0;
            int columnOffset = (i > 4) ? 120 * (i - 5) : 120 * i;
            buttons[i] = new JButton();
            buttons[i].setBounds(columnOffset, rowOffset, 120, 30);
            buttons[i].setVisible(false);
            buttonPanel.add(buttons[i]);
        }
        this.add(buttonPanel);
    }

    public void clear() {
        this.output.setText("");
    }
    public void write(String text) {
        this.output.setText(this.output.getText() + text);
    }
    
    public void writef(String formatText, Object... args) {
      this.write(String.format(formatText, args));
    }
    @Deprecated // Because I don't want to have to check each individual write() from the original sources.
    public void write(String text, boolean clear) {
        if(clear) this.clear();
        this.write(text);
    }
    public void setButton(int index, String label) {
        buttons[index - 1].setText(label);
        buttons[index - 1].setVisible(true);
    }
    public void clearButton(int index) {
        buttons[index - 1].setText("");
        buttons[index - 1].setVisible(false);
    }
}
