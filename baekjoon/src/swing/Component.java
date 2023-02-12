package swing;
 //Color, Font, JLabel, Image
	import java.awt.Color;
	import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	// 이론적인 내용

	/*

	    책 페이지 393쪽
	    컴포넌트들은 JComponete 클래스를 상속 받는다.
	    때문에 JComponent에 정의된 메서드들을 내가 새로 만든 컴포넌트들에서도 사용할 수 있다.

	    모양과 관련된 메서드들 중에서, setOpaque(boolean) 메서드는
	    J라벨에 사용해야 한다. J라벨 자체가 배경이 투명하기 때문에 배경색 설정을 해도 기본적으로 보이지가 않는다.
	    그래서 위의 메서드를 통해서 불투명하게 만들어주어야 배경색이 보이게 된다.

	    component1.java 파일에서는 JLabel을 사용한다.
	 */

	public class Component extends JFrame{
	    public Component(String title) {
	        setTitle(title);
	        setSize(300, 300);
	        setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(this);

	        setFrame();
	        
	        setVisible(true);
	    	}

		private void setFrame() {
			Color mainColor = new Color(181,178,255);
	        Font mainFont = new Font("한컴 바겐세일 B", Font.BOLD,24);
	        //첫번째 인자는 글꼴, 두번째 인자는 글꼴 스타일, 세번째 인자는 글꼴 크기
	        JPanel mainFrame = new JPanel();
	        add(mainFrame);
	        // mainFrame의 이름을 가진 JPanel을 최상위 컨테이너에 붙인다.

	        JLabel txtLbl = new JLabel();
	        mainFrame.add(txtLbl);
	        // txtLbl의 이름을 가진 JLabel을 mainFrame에 붙인다.
	        // JLable을 만들 때 기본생성자를 이용하고 add로 붙인다고 하더라도, 
	        // 아무런 설정을 해주지 않으면 아무것도 보이지 않는다.

	        txtLbl.setText("이제 보입니다.");
	        // setText 메서드는 JLable에 텍스트를 삽입한다.

	        txtLbl.setOpaque(true);
	        txtLbl.setBackground(new Color(128, 128, 128));
	        txtLbl.setBackground(Color.GREEN);
	        txtLbl.setBackground(mainColor);

	        // setOpaque(true) 이용해서 불투명하게 설정해준 다음,
	        // setBackground 메서드 이용해서 컬러를 지정해준다.
	        // 색 지정 방식은 세 가지가 있는데, 첫 번째는 RGB값을 정수로 삽입
	        // 두 번째는 Color.RED 와 같이 Color 클래스에 정의 돼 있는 상수값 이용하기.
	        // 세 번째는 32번 라인처럼 Color 객체를 하나 만든 다음, 변수명을 호출해서 사용하기.

	        txtLbl.setForeground(Color.RED);
	        //글자색을 지정하는 메서드
	        txtLbl.setFont(mainFont);
	        //글꼴 설정
	        
//	        JButton button1 = new JButton("테스트 버튼");
//	        mainFrame.add(button1);
//	        button1.setEnabled(false);
//	        // setEnabled 비활성화, 활성화를 설정함
	        
	        JLabel label1 = new JLabel();
	        JLabel label2 = new JLabel("텍스트를 삽입하는 생성자");
	        
	        
//	        ImageIcon dora = new ImageIcon("img/img.png");
//	        JLabel label3 = new JLabel(dora);
//	        mainFrame.add(label3);
	        // 이미지의 크기를 그대로 가져오기 때문에 그림판을 킨다음
	        // ctrl + w 로 크기를 줄이고 저장 후 패키지 익스플로러에 간 다음 덮어쓰기
	        // 여러 생성자를 통해 문자나 이미지 문자+이미지 출력
	        JLabel label4 = new JLabel (new ImageIcon("img/img.png"));
	        mainFrame.add(label4);
		}
		
	}

