package swing;

import javax.swing.JFrame;

public class Component7 extends JFrame{
	public Component7(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		setVisible(true);
	}
}
