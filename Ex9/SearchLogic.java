package by.htp.part02.block8.Ex9;

import java.util.ListIterator;

import by.htp.part02.block8.Ex10.Airline;
import by.htp.part02.block8.Ex10.AirlineBase;

public class SearchLogic {
    
	public Library findByAuthor(Library lib, String...autor) {			
			
			Library helpLib = new Library();
			helpLib.setLibrary(lib.getLibrary());
			
			ListIterator itr = helpLib.getLibrary().listIterator();
			
			for(int i = 0; i <autor.length; i++) {
				String str = autor[i];			
			
			    while (itr.hasNext()){
				    Book book = (Book)itr.next();
				    if ((isAutorInList(book.getAutor(), str) == false)) {
					    itr.remove();
				    }
			    }
			}
			return helpLib;			
	}
	
	private boolean isAutorInList(Autors autor, String str) {
		boolean isTrue  = false;
		for (int i = 0; i < autor.getAutors().size(); i++ ) {
			if (autor.getAutors().contains(str)) {
				isTrue = true;
			}
		}
		return isTrue;
	}
	
	public Library findByPublishingHouse(Library lib, String publishingHouse) {			
		
		Library helpLib = new Library();
		helpLib.setLibrary(lib.getLibrary());
		
		ListIterator itr = helpLib.getLibrary().listIterator();	
		
		    while (itr.hasNext()){
			    Book book = (Book)itr.next();
			    if (!(book.getPublishingHouse().contentEquals(publishingHouse))) {
				    itr.remove();
			    }
		    }		
		return helpLib;	
    }
	
public Library findByYear(Library lib, int year) {			
		
		Library helpLib = new Library();
		helpLib.setLibrary(lib.getLibrary());
		
		ListIterator itr = helpLib.getLibrary().listIterator();	
		
		    while (itr.hasNext()){
			    Book book = (Book)itr.next();
			    if (!(book.getYear() > year)) {
				    itr.remove();
			    }
		    }		
		return helpLib;	
    }
	
}
