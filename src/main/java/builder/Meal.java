package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> items;

	public Meal() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.println("Item: " + item.name() + ", packing: " + item.packing().pack() + ", price: " + item.price() + "$");
		}
	}
}
