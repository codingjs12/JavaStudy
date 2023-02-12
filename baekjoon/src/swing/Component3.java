package swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Component3 extends JFrame implements ItemListener{
	private JCheckBox[] fruits;
	private JLabel sumLabel;
	private int sum;
	public Component3(String title) {
		setTitle(title);
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		sum = 0;
		JPanel center = new JPanel();
		add(center);
//		
//		JCheckBox apple = new JCheckBox("사과");
//		JCheckBox pear = new JCheckBox("배");
//		JCheckBox cherry = new JCheckBox("체리", true);
//		
//		center.add(apple);
//		center.add(pear);
//		center.add(cherry);
		
		fruits = new JCheckBox[3];
		String[] names = {"사과", "배", "포도"};
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			center.add(fruits[i]);
			fruits[i].addItemListener(this);
		}
		
		sumLabel = new JLabel("0원");
		center.add(sumLabel);
		
		
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		int sign = 0;
		int stateChange = e.getStateChange();
		
		if(stateChange == ItemEvent.SELECTED) {
			sign = 1;
		}
		else {
			sign = -1;
		}
		
		Object object = e.getItem();
		
		
		if(object == fruits[0]) {
			sum += (100 * sign);
		}
		else if(e.getSource() == fruits[1]){
			sum += (200 * sign);
		}
		else {
			sum += (300 * sign);
		}
		
		sumLabel.setText("합계 : "+ sum + "원");
	}
}
