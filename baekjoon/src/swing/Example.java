package swing;

import javax.swing.JFrame;

public class Example extends JFrame{
	public Example(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		setVisible(true);
	}
}
