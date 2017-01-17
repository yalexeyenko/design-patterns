package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class MyRect {
	private Color color = Color.black;

	public MyRect(Color color) {
		super();
		this.color = color;
	}

	public void draw(Graphics g, int upperX, int upperY, int lowerX, int loewrY) {
		g.setColor(color);
		g.fillRect(upperX, upperY, lowerX, loewrY);
	}
}
