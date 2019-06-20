package menu;

import javax.swing.*;
import java.awt.*;

class MButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MButton(String text){
		
		this.setText(text);
        this.setPreferredSize(new Dimension(300, 100));
        this.setFont(new Font("Roboto", Font.PLAIN, 30));
        this.setBackground(Color.decode("#FFF07C"));
        this.setForeground(Color.decode("#000000"));
        this.setFocusPainted(false);
        
    }

}
