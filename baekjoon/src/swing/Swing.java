package swing;

import javax.swing.JFrame;

public class Swing extends JFrame {
	
	public Swing() {
		setTitle("300x300 스윙 프레임 만들기"); //필수 옵션
		setSize(300,300); //필수 옵션
		setResizable(false); //창 크기 조절 불가능하게 만드는 옵션
		setLocationRelativeTo(this); //창을 가운데로 띄우게 하는 메서드(파라미터는 대상을 지정)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 필수 옵션
		setVisible(true); //밑으로 가면 실행 안됌
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swing swing = new Swing();
	}

}
