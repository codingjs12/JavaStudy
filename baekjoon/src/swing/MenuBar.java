package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuBar extends JFrame implements ActionListener{
	private JMenuItem save;

	public MenuBar(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		JPanel main = new JPanel();
		add(main);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		// 메뉴 영역에 붙여야하기 때문에 setJMenuBar메서드를 이용하여 
		// 생성한 JMenuBar에 
		JMenu file = new JMenu("파일");
		menuBar.add(file);
		
		JMenu edit = new JMenu("편집");
		menuBar.add(edit);
		
		JMenu info = new JMenu("정보");
		menuBar.add(info);
		
		save = new JMenuItem("저장하기");
		save.addActionListener(this);
		
		JMenuItem otherSave = new JMenuItem("다른이름으로 저장하기");
		
		file.add(save);
		file.add(otherSave);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object object = e.getSource();
		
		if(object == save) {
			System.out.println("저장되었습니다.");
		}
	}
}
