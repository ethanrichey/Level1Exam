import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	
	void speak(String words){
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void Run(){
		
		frame.setVisible(true);
		frame.pack();
		frame.setSize(500, 300);
		frame.setTitle("Color Teacher");
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button.setBackground(Color.yellow);
		button.setOpaque(true);
		button1.setBackground(Color.red);
		button1.setOpaque(true);
		button2.setBackground(Color.blue);
		button2.setOpaque(true);
		button3.setBackground(Color.green);
		button3.setOpaque(true);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	public static void main(String[] args) {
	Level1Exam ex = new Level1Exam();
	ex.Run();
	
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	Level1Exam ez = new Level1Exam();
		if(arg0.getSource() == button){
		ez.speak("yellow");
	}
		else if(arg0.getSource() == button1){
			ez.speak("red");
		}
		else if(arg0.getSource() == button2){
			ez.speak("blue");
	}
		else if(arg0.getSource() == button3){
			ez.speak("green");
	}
	


	}
	
}
