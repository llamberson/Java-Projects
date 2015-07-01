/* Luke Lamberson - TCSS 305*/
package tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/** 
 * Basic version of my Tetris program. Allows play with score keeping 
 * and a pause function via the 'P' key. This version doesn't include 
 * Menu Options Pane, Restart, Quit, or Best Of components. This version 
 * draws each shape using lines for edges with lighter/darker coloring for
 * 'raised/3D' effects.
 * @author Luke Lamberson
 * @version 1.2
  */

/** Build game board and components. */
public class Tetris extends JFrame {
	private static final long serialVersionUID = 1114182658089028508L;

	// Status bar for keeping score
	JLabel statusbar;

	/** Setup game board components. */
	public Tetris() {

		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.SOUTH);
		Board board = new Board(this);
		add(board);
		board.start();

		setSize(200, 400);
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/** Returns status bar. */
	public JLabel getStatusBar() {
		return statusbar;
	}

	/** Main class that starts game. */
	public static void main(String[] args) {

		Tetris game = new Tetris();
		game.setLocationRelativeTo(null);
		game.setVisible(true);

	}
}
