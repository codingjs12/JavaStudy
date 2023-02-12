package swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Component4 extends JFrame{
	public Component4(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		JPanel center = new JPanel();
		
		add(center);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리");
		//라디오 버튼을 하나의 그룹으로 묶어야 함.
		
		buttonGroup.add(apple);
		buttonGroup.add(pear);
		buttonGroup.add(cherry);
		//이런식으로 버튼 그룹에 라디오 버튼들을 붙임
		// 단, 라디오 버튼들을 버튼 그룹에 붙인다고 해서 컨테이너에 버튼 그룹만 붙이면 보이는게 아님.
		
		center.add(apple);
		center.add(pear);
		center.add(cherry);
		
		setVisible(true);
	}
}
