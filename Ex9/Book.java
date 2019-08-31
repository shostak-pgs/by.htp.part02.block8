package by.htp.part02.block8.Ex9;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 * и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 *  и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 *  Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
public class Book {
    private int id;
    private String name;
    private Autors autor;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private double price;
    private String binding;
    
    public Book(int id, String name, Autors autor, String publishingHouse, int year, int numberOfPages, double price, String binding) {
    	this.id = id;
    	this.name = name;
    	this.autor = autor;
    	this.publishingHouse = publishingHouse;
    	this.year = year;
    	this.numberOfPages = numberOfPages;
    	this.price = price;
    	this.binding = binding;  	
    }
	
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	public Autors getAutor() {
		return autor;
	}
	public void setAutor(Autors autor) {
		this.autor = autor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	@Override
	public String toString() {
		String book = this.id + "   " + this.autor.toString() + "   " + this.name + '\n' + "Издательство " + this.publishingHouse + " " +
	this.year + "г. " + this.numberOfPages + " страниц"  + " цена: " + this.price + "р, переплет " + this.binding;
		return book;
	}
}
