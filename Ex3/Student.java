package by.htp.part02.block8.Ex3;

/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
	private String name;
	private int group;
	private int[] mark;

	public Student(String name, int group, int[] mark) {
		this.name = name;
		this.group = group;
		this.mark = mark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	public int[] getMark() {
		return mark;
	}
	
	@Override
	public String toString() {
		String str = "ФИО :" + this.getName() +" группа: " + this.group;
		
		return str;
	}

}
