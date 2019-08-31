package by.htp.part02.block8.Ex9;

public class Main {

	public static void main(String...args) {
	    Library myLib = new Library();
	    myLib.addBook(new Book(1, "Mark Twein", new Autors(new String[] {"K,Horstman"}), "Россмэн", 1967, 200, 12.60, "Hard"));
	    myLib.addBook(new Book(2, "JavaPrograming", new Autors(new String[] {"K,Horstman", "G.Shildt"}), "Россмэн", 2018, 1000, 112.60, "Hard"));
	    
	    myLib.addBook(new Book(3, "Harry Potter", new Autors(new String[] {"Dj.Rouling"}), "Ing", 2003, 600, 15.60, "Hard"));
	    myLib.addBook(new Book(4, "Lord of the Rings", new Autors(new String[] {"Dj.Tolkin", "Dj.Tolkin.Jr."}), "Minsk", 1995, 400, 18.60, "Soft"));
	
	    SearchLogic sl = new SearchLogic();
	    
	    String author = "K,Horstman";
	    System.out.printf("Все книги %s в библиотеке: %n", author);
	    Library SearchRez1 = sl.findByAuthor(myLib, author);
	    
	    print(SearchRez1);
	    System.out.println();
	    
	    String publishingHouse = "Россмэн";
	    System.out.printf("Все книги издательства %s в библиотеке: %n", publishingHouse);
	    Library SearchRez2 = sl.findByPublishingHouse(myLib, publishingHouse);
	    
	    print(SearchRez2);
	    System.out.println();
	    
	    int year = 1994;
	    System.out.printf("Все книги изданные после %sг в библиотеке: %n", year);
	    Library SearchRez3 = sl.findByYear(myLib, year);
	    
	    print(SearchRez3);
	    System.out.println();
	   
	    }	
	
	    public static void print(Library lib) {
	    	for (Book book : lib.getLibrary()) {
			    System.out.println(book);
		    }
	    }
    
}
