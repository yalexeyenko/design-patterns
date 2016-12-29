package iterator;

import java.util.Iterator;

import iterator.type.Picture;

public class PictureRepository implements ArtContainer {
	private Picture[] pictures = new Picture[3];
	
	public PictureRepository() {
		pictures[0] = new Picture("Утро в сосновом лесу", "Иван Шишкин", 1889);
		pictures[1] = new Picture("Иван Грозный и сыне его Иван 16 ноября 1581 года", "Илья Репин", 1885);
		pictures[2] = new Picture("Демон сидящий", "Михаил Врубель", 1890);
	}

	public Picture[] getPictures() {
		return pictures;
	}
	
	private class PictureIterator implements Iterator<Picture> {
		int index;
		
		@Override
		public boolean hasNext() {
			if (index < pictures.length) {
				return true;
			}
			return false;
		}

		@Override
		public Picture next() {
			if (hasNext()) {
				return pictures[index++];
			}
			return null;
		}
		
	}

	@Override
	public Iterator getIterator() {
		return new PictureIterator();
	}
}
