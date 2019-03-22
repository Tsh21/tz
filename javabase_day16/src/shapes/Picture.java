package shapes;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Picture extends JFrame {

	private static final long serialVersionUID = -5288822322168977364L;
	
	private int width;
	private int height;
	
	//放图形的集合
	private ArrayList<Shape> listShape = new ArrayList<Shape>();
	
	//成员内部类
	private class ShapesPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//foreach循环
			for ( Shape s : listShape )
			{
				s.draw(g);
			}			
		}
	}
	
	//构造函数
	public Picture(int width, int height)
	{
		add(new ShapesPanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.width = width;
		this.height = height;
		setLocationRelativeTo(null);
		setSize(width, height);
		setVisible(true);
	}
	
	//添加图形的方法
	public void add(Shape s)
	{
		listShape.add(s);
	}
	

}
