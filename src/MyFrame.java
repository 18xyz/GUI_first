import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame(){
		this.setSize(500, 500);
		this.setVisible(true);
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel j = new JPanel();
		j.setLayout(new BorderLayout());
		this.add(j);
		Button b = new Button("btn1");
		Label l = new Label("Hi!");
		Button b2 = new Button("btn2");
		b2.setEnabled(false);
		Label l2 = new Label("Hello!");
		Button b3 = new Button("skfksj");
		
		j.add(b3, BorderLayout.WEST);
		j.add(b, BorderLayout.CENTER);
		j.add(l,BorderLayout.EAST);
		j.add(b2,BorderLayout.NORTH);
		j.add(l2,BorderLayout.SOUTH);
//		this.pack();
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		

	}

}
