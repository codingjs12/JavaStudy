package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEvent extends JFrame{
	public KeyEvent(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setLayout(null);
		
		JLabel jlabel = new JLabel("1");
		jlabel.setBounds(50,50,100,100);
		add(jlabel);
		
		setVisible(true);
	}
}
