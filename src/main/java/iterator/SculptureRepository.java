package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.type.Sculpture;

public class SculptureRepository implements ArtContainer {
	private List<Sculpture> sculptures;

	public SculptureRepository() {
		this.sculptures = new ArrayList<>();
		this.sculptures.add(new Sculpture("Давид", "Микеланджело", 1501));
		this.sculptures.add(new Sculpture("Мыситель", "Огюст Роден", 1880));
		this.sculptures.add(new Sculpture("Пьета", "Микеланджело", 1499));
	}

	public List<Sculpture> getStatues() {
		return sculptures;
	}

	private class SculptureIterator implements Iterator<Sculpture> {
		int index;

		@Override
		public boolean hasNext() {
			if (index < sculptures.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Sculpture next() {
			if (hasNext()) {
				return sculptures.get(index++);
			}
			return null;
		}

	}

	@Override
	public Iterator getIterator() {
		return new SculptureIterator();
	}
}
