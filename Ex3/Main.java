package by.htp.part02.block8.Ex3;

public class Main {

	public static void main(String[] args) {

		GroupLogic grLogic = new GroupLogic();
		Group gr = new Group(10);

		gr.add(new Student("O.O. Kotlar", 123, new int[] { 9, 8, 9, 7, 9 }));
		gr.add(new Student("O.S. Guk", 125, new int[] { 9, 10, 9, 9, 9 }));
		gr.add(new Student("A.L. Kotenko", 122, new int[] { 8, 8, 9, 8, 9 }));
		gr.add(new Student("O.C. Dmitruk", 120, new int[] { 9, 6, 9, 7, 9 }));
		gr.add(new Student("P.O. Kononchik", 124, new int[] { 6, 8, 7, 7, 8 }));
		gr.add(new Student("S.D. Nozik", 127, new int[] { 8, 8, 9, 8, 10 }));
		gr.add(new Student("P.L. Kozel", 128, new int[] { 9, 9, 9, 6, 9 }));
		gr.add(new Student("G.S. Shum", 129, new int[] { 9, 9, 9, 9, 9 }));
		gr.add(new Student("O.D. Sokol", 121, new int[] { 8, 8, 9, 8, 9 }));
		gr.add(new Student("C.O. Glaz", 123, new int[] { 7, 8, 6, 7, 6 }));

		Student[] aLevelStudents = grLogic.takeALevelStudents(gr);
		aLevelStudents = grLogic.takeALevelStudents(gr);
		System.out.println("Наши отличники: ");
        printAStudent(aLevelStudents);
		
	}

	public static void printAStudent(Student[] aLevelStudents) {
		for (Student st : aLevelStudents) {
			System.out.println(st);
			

		}
	}

}
