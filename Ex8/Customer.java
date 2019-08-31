package by.htp.part02.block8.Ex8;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
 *  методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими 
 *  конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 *  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 *  Найти и вывести:
 *  a) список покупателей в алфавитном порядке;
 *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {
    private int id;
    private String surname;
    private String name;    
    private String patronymic;
    private String address;
    private int cardNumber;
    private long bankAccount;
    
    public Customer(int id, String surname, String name, String patronymic, String address, int cardNumber, long bankAccount) {
    	this.id = id;
    	this.surname = surname;
    	this.name = name;
    	this.patronymic = patronymic;
    	this.address = address;
    	this.cardNumber = cardNumber;
    	this.bankAccount = bankAccount;    	
    }	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}
	//Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
	@Override
	public String toString() {
		String customer = this.id + " " + this.surname + " " + this.name + " " + this.patronymic + ", " + this.address;
		return customer;
	}

}
