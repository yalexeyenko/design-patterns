package iterator;

import java.util.Iterator;

public class Runner {
	public static void main(String[] args) {
		PictureRepository pictureRepository = new PictureRepository();
		SculptureRepository sculptureRepository = new SculptureRepository();
		Iterator pictureIterator = pictureRepository.getIterator();
		Iterator sculptureIterator = sculptureRepository.getIterator();
		while (pictureIterator.hasNext()) {
			System.out.println(pictureIterator.next());
		}
		while (sculptureIterator.hasNext()) {
			System.out.println(sculptureIterator.next());
		}
	}
}
