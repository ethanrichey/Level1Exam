import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvader implements KeyListener {
	final static int width = 500;
	final static int height = 800;
	JFrame frame;
	GamePanel gamepanel;

	public static void main(String[] args) {
		LeagueInvader LeagueInvador = new LeagueInvader();

	}

	LeagueInvader() {
		frame = new JFrame();
		gamepanel = new GamePanel();
		frame.addKeyListener(gamepanel);

		setup();

	}

	void setup() {
		frame.add(gamepanel);
		frame.setVisible(true);
		frame.setSize(width, height);
		gamepanel.startGame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
