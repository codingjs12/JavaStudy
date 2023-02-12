package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

public class Component6 extends JFrame{
	public Component6(String title) {
		setTitle(title);
		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		JLabel imgOne = new JLabel(new ImageIcon("img/img.png"));
		JLabel imgTwo = new JLabel(new ImageIcon("img/press.png"));
		
		// JSplitPane
		// new JSplitPane(어느 기준으로 나눌지 옵션, 컴포넌트1, 컴포넌트2)
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, imgOne, imgTwo);
		splitPane.setDividerLocation(300);
		add(splitPane);
		
		JToolBar toolbar = new JToolBar("툴바");
		toolbar.add(new JLabel("검색"));
		toolbar.addSeparator();
		toolbar.add(new JLabel("삭제"));
		add(toolbar);
		
		setVisible(true);
	}
}
