package by.htp.part02.block8.Ex9;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> lib;
	
	public Library () {
		lib = new ArrayList<Book>();
	}
	
	public Library (Book...book) {
		this.lib = new ArrayList<Book>();
		for (Book b : book) {
			lib.add(b);
		}
	}
	
	public void addBook(Book...book) {
		
		for (Book b : book) {
			lib.add(b);
		}
	}
	
public void setLibrary(List<Book>list) {	
	
		for (Book b : list) {
			lib.add(b);
		}
	}

public void setLibrary(ArrayList<Book> book) {	
	
	for (Book b : book) {
		lib.add(b);
	}
}

	public List<Book> getLibrary() {
		return this.lib;
	}
}
