package brickBreaker_game;

import javax.swing.JFrame;
public class Main {

	public static void main(String[] args)
	{
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 710, 595);
		obj.setTitle("Break it Bub!");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay) ;
	}

}
