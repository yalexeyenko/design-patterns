package memento;

public class Originator {
	private String article;

	public String getArticle() {
		System.out.println("Originator: current version of article: " + article);
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}
	
	public Memento storeInMemento(String article) {
		System.out.println("Originator: Saving to Memento");
		return new Memento(article);
	}
	
	public String restoreFromMemento(Memento memento) {
		System.out.println("Originator: previous article restored from Memento");
		this.article = memento.getArticle();
		return article;
	}
}
