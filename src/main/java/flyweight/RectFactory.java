package flyweight;

import java.awt.Color;
import java.util.HashMap;

public class RectFactory {
	private static final HashMap<Color, MyRect> rectByColor = new HashMap<>();
	
	public static MyRect getRect(Color color) {
		MyRect rect = rectByColor.get(color);
		if (rect == null) {
			rect = new MyRect(color);
			rectByColor.put(color, rect);
		}
		return rect;
	}
}
