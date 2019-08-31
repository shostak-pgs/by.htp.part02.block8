package by.htp.part02.block8.Ex3;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	private StudentLogic stLogic = new StudentLogic();

	public Student[] takeALevelStudents(Group group) {
        int counter = 0;
	
		Student[] students = group.getStudents();

		for (Student st : students) {
			if (stLogic.isAStudent(st)) {
				counter++;
			}
		}
		Student[] result = new Student[counter];
		counter = 0;
		for (Student st : students) {
			if (stLogic.isAStudent(st)) {
				result[counter] = st;
				counter++;
			}
		}
		return result;
	}

}
