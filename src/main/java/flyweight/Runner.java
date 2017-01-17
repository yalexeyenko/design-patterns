package flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner extends JFrame {
	private static final long serialVersionUID = 1L;

	private JButton startDrawing;

	int windowWidth = 1750;
	int windowHeight = 1000;

	Color[] colors = { Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta,
			Color.black, Color.gray };
	
	public Runner() {
		this.setSize(windowWidth, windowHeight);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Flyweight design pattern");
		
		JPanel contentPane = new JPanel();
		
		contentPane.setLayout(new BorderLayout());
		final JPanel drawingPanel = new JPanel();
		startDrawing = new JButton("Draw");
		
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		contentPane.add(startDrawing, BorderLayout.SOUTH);
		
		startDrawing.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = drawingPanel.getGraphics();
				
				long startTime = System.currentTimeMillis();
				
				for (int i = 0; i < 100000; i++) {
					MyRect rect = RectFactory.getRect(getRandomColor());
					rect.draw(g, getRandomX(), getRandomY(), getRandomX(), getRandomY());
				}
				
				long finishTime = System.currentTimeMillis();
				
				System.out.println("Took " + (finishTime - startTime) + " milliseconds.");
			}

		});
		
		this.add(contentPane);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Runner();
	}
	
	private int getRandomY() {
		return (int) (Math.random()*windowHeight);
	}

	private int getRandomX() {
		return (int) (Math.random()*windowWidth);
	}

	private Color getRandomColor() {
		Random random = new Random();		
		int index = random.nextInt(9);
		return colors[index];
	}
}
