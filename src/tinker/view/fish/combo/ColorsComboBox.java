package tinker.view.fish.combo;

import javax.swing.JComboBox;

import tinker.view.fish.mi.MiColors;

@SuppressWarnings("serial")
public class ColorsComboBox extends JComboBox<String> {

	public ColorsComboBox() {
		super(new String[] { "Red", "Green", "White", "Yellow", "Blue" });
		MiColors colors = new MiColors();
		setBackground(colors.getRed());
		setForeground(colors.getForeground());
	}

}
