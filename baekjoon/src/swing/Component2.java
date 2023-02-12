package swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Component2 extends JFrame{
	public Component2(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		JPanel centerFrame = new JPanel();
		add(centerFrame);
		
		JButton Button1 = new JButton("Click", new ImageIcon("img/img.png"));
		Button1.setRolloverIcon(new ImageIcon("img/over.png"));
		Button1.setPressedIcon(new ImageIcon("img/press.png"));
		
		centerFrame.add(Button1);
		
		Button1.setBorderPainted(false);
		//버튼 테두리 없앰
		Button1.setContentAreaFilled(false);
		//버튼 배경색 날리기
		
		
		setVisible(true);
	}
}

