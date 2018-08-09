import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrideTest extends JFrame {
	public GrideTest(){
		this.setSize(700, 500);
		this.setVisible(true);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,1));
		this.add(p1);
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		Button b4 = new Button("버튼4");
		Button b5 = new Button("버튼5");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
	}

	public static void main(String[] args) {
		GrideTest gt = new GrideTest();
	}

}
