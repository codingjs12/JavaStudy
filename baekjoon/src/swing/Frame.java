package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
	public Frame(String title) {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setLocationRelativeTo(this);
		setResizable(false);
		
		JButton button1 = new JButton("1");
		
		JPanel center = new JPanel();
		
		add(center); //최상위 컨테이너 설정은 앞에 아무런 것도 붙지 않는다.
		
		center.add(button1);
		
		setVisible(true);
		
	}
}
