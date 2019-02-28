package com.igeek;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//单行注释Ctrl+/

/* 
 * 多行注释
 *  Ctrl+Shift+ / 
 *  Ctrl+Shift+ \  
 */

/**
 * 文档注释
 * 
   * 模拟小球移动
 *
 */
public class MyBall extends JFrame implements KeyListener {
	int x = 40;
	int y = 40;

	void startLaunch() {
		/*
		 * setSize(500, 600); setLocation(100, 10); setVisible(true);
		 * setDefaultCloseOperation(EXIT_ON_CLOSE);
		 */
		this.addKeyListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBall ball = new MyBall();
		ball.startLaunch();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.drawOval(x, y, 100, 100);
		g.drawRect(x+100, y+100, 50, 160);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("up");
			y-=5;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("down");
			y+=5;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("left");
			x-=5;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("right");
			x+=5;
		}
		repaint();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
