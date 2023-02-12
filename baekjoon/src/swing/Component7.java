package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Component7 extends JFrame{
	public Component7(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		
		// 입력 받을 수 있는 다이얼로그
		// String val = JOptionPane.showInputDialog("당신의 이름을 입력하세요");
		
		// 확인 요청하는 다이얼로그
		//int res = JOptionPane.showConfirmDialog(null, "진짜 계속하시겠습니까?", "확인창",
//				JOptionPane.YES_NO_CANCEL_OPTION);
		//	if(res = 0) {
		// 		대충 계속 진행하는 로직
//			}
		
		//메시지 다이얼로그
		JOptionPane.showMessageDialog(null, "조심하세요");
		JLabel label = new JLabel();
		add(label);
		
		
		setVisible(true);
	}
}
