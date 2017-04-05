package main;

import javax.swing.JFrame;

import gameLogic.Board;

public class Window extends JFrame{

	public static final int WIDTH = 607, HEIGHT = 630;
	
	private Board board;
	
	public Window()
	{
		setTitle("Snake Game");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		board = new Board();
		
		add(board);
		addKeyListener(board);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window();
	}

}
