package swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Component2 extends JFrame{
	public Component2(String title) {
		setTitle(title);
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setLayout(null);

		JButton Button1 = new JButton("Click", new ImageIcon("img/img.png"));
		JButton Button2 = new JButton("Click", new ImageIcon("img/over.png"));
		JButton Button3 = new JButton("Click", new ImageIcon("img/press.png"));
		
		Button1.setBounds(0, 350, 200, 200);
		Button2.setBounds(200, 200, 200, 200);
		Button3.setBounds(0, 0, 200, 200);
		
		add(Button1);
		add(Button2);
		add(Button3);

		setVisible(true);
	}
}

