package it.zeion.schoolClass;

import java.util.Collections;
import java.util.List;

import it.zeion.classroom.Classroom;
import it.zeion.student.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student("Franco", "Cosert", 30);
		Student st2 = new Student("Gianni", "Forgor", 32);
		Student st3 = new Student("Fabio", "Capor", 29);
		
		
		Classroom cla1 = new Classroom("A1");
		
		cla1.addStudent(st1);
		cla1.addStudent(st2);
		cla1.addStudent(st3);
		
		System.out.println(cla1.getStudentList().get(0).getName());
		System.out.println(cla1.getStudentList().get(0).getStudentCode());
		
		Classroom cla2 = new Classroom("A2");
		
		cla2.setStudentList(cla1.getStudentListSort());		
		
		System.out.println(cla1);
		
		System.out.println(cla2);
		
		System.out.println(cla1.getOlderStudent());
		
		cla1.remuveStudent("Forgor");
		
		System.out.println(cla1.getOlderStudent());

	}

}