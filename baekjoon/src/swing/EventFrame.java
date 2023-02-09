package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventFrame extends JFrame implements ActionListener{
	private JButton button1;
	private JButton button2;

	public EventFrame(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		//1. 일단 리스너를 불러오고 매개변수는 this
		//2. 그러면 메서드 아래에 빨간 줄이 뜨는 데 마우스를 올리면 뜨는 창에 맨 아래에
		//   implement를 클릭한다.
		//3. 클래스 이름에 빨간 줄이 뜬는데 마우스를 올리면 뜨는 창에서
		//	 add unimplemented method 클릭.
		add(button1);
		add(button2);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		if(button.getText().equals("1")) {
			button.setText("2");
		}
		else {
			button.setText("1");
		}
		// e -> 이벤트 기록(누가 발생 시켰나, 언제 발생시켰나)
		// e.getSource(); -> 누가 발생시켰는지에 대한 정보를 return;
		// (JButton) button에 넣어주면 button == button1 가리키는게 동일함.
		
//		Object object = e.getSource();
//		
//		if(object == button1) {
//			System.out.println("123");
//			setSize(500,500);
//		}
	}
}
