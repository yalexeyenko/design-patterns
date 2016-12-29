package iterator.type;

public class Picture{
	private String name;
	private String author;
	private Integer year;
	
	public Picture(String name, String author, Integer year) {
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Picture [name=" + name + ", author=" + author + ", year=" + year + "]";
	}	
	
}
