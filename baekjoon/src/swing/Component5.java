package swing;

import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Component5 extends JFrame implements ActionListener{
	private JLabel textLabel;
	private JTextField textField;

	public Component5(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		JPanel center = new JPanel();
		add(center);
		
		textLabel = new JLabel();
		center.add(textLabel);
		
		textField = new JTextField(15);
		center.add(textField);
		// 텍스트 필드는 한줄을 입력 받을 수 있는 칸이다.
		
		textField.addActionListener(this);
		// 텍스트 필드는 엔터를 입력시 액션 이벤트가 발생한다.
		
		JTextArea textArea = new JTextArea("set Text",10,15);
		center.add(textArea);
		//텍스트 에어리어는 여러줄을 입력할때 사용한다. 
		//(한줄은 텍스트필드 여러줄은 텍스트에어리어)
		JScrollPane scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//new JScrollPane(컴포넌트) ->  해당 생성자로 생성하면 기본 옵션이 AS_NEEDED
		//new JScrollPane(컴포넌트, 수직옵션, 수평옵션)
		//수직 옵션 VERTICAL_SCROLLBAR + (ALWAYS, AS_NEEDED, NEVER)
		//수평 옵션 HORIZONTAL_SCROLLBAR + (ALWAYS, AS_NEEDED, NEVER)
		
		center.add(scrollPane);
		// 만약 스크롤 팬에 컴포넌트를 붙였다면
		// 해당 컴포넌트는 이미 스크롤팬에 붙어있는 상태이기 때문에, 
		//스크롤팬만 컨테이너에 붙이면 됨.
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object object = e.getSource();
		
		if(object == textField) {
			textLabel.setText(textField.getText());
			textField.setText("");
			textLabel.setOpaque(true);
			textLabel.setBackground(Color.BLUE);
			
		}
	}
}
