import javax.swing.*;
import java.awt.*;


/**
 * This class design panel to give option for available sides.
 * 
 * @author sailaborn
 * @version 1.0
 * @since 20 April 2026
 */
public class SidesPanel extends JPanel{
	protected JCheckBox breadsticks = new JCheckBox("Breadsticks ($3.50)");
	protected JCheckBox garlicBread = new JCheckBox("Garlic Bread ($4.30)");
	protected JCheckBox cheeseBread = new JCheckBox("Cheese Bread ($4.50)");

	public SidesPanel(){
        setLayout(new BorderLayout()); 
        
        JLabel label = new JLabel("Sides", SwingConstants.CENTER);
        
        JPanel sPanel = new JPanel(new GridLayout(3, 1));
        sPanel.add(breadsticks);
        sPanel.add(garlicBread);
        sPanel.add(cheeseBread);
        
        add(label, BorderLayout.NORTH);
        add(sPanel, BorderLayout.CENTER);
    }
	
	public double getSideTotals() {
		setLayout(new BorderLayout());
		add(new JLabel("Sides"), BorderLayout.NORTH);
		double sidesTotal = 0;
		if(breadsticks.isSelected()) sidesTotal += 3.50;
		if(garlicBread.isSelected()) sidesTotal += 4.30;
		if(cheeseBread.isSelected()) sidesTotal += 4.50;
		return sidesTotal;
	}
}
