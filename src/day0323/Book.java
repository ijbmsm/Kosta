package day0323;

import java.util.Arrays;

public class Book implements Cloneable, Comparable<Book>{
	String title;
	int price;
	Author[] author;
	public Book(String title, int price, Author[] author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", author=" + Arrays.toString(author) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//default : 얕은복제제공 
		Book book = (Book) super.clone();
		//깊은복제는 별도의 코드가 필요하다. 
		book.author = Arrays.copyOf(author, author.length);
		for(int i=0; i<author.length; i++) {
			if(author[i]== null ) break;
			//book.author[i] = new Author(author[i].name, author[i].gender, author[i].phone);
			book.author[i] = (Author)author[i].clone();
		
		}

		return book;
	}
	@Override
	public int compareTo(Book obj) {
		//Ascending :  < = >
		return price - obj.price;
	}
	
	
}
