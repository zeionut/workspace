package it.zeion.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import it.zeion.student.Student;

public class Classroom {
	
	protected String name;
	protected List<Student> studentList = new ArrayList<>();
	
	public Classroom(String name) {
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void addStudent(Student student) {
		
		studentList.add(student);
		
	}
	
	public boolean existStudent(String surname) {
		
		boolean exist = false;
		
		Iterator<Student> iter = studentList.iterator();
		
		while (iter.hasNext()) {
			
			if (iter.next().getSurname().equals(surname)) {
				
				exist = true;
				
			}
			
		}
		
		return exist;
		
	}
	
	@Override
	public String toString() {
		
		Student student;
		
		String classroom = "";
		
		Iterator<Student> iter = studentList.iterator();
		
		while (iter.hasNext()) {
			
			student = iter.next();
			
			classroom += student.toString() + " ";
			
		}
		
		return classroom;
		
	}
	
	public int sumAgeStudent() {
		
		Student student;
		
		int allAge = 0;
		
		Iterator<Student> iter = studentList.iterator();
		
		while (iter.hasNext()) {
			
			student = iter.next();
			
			allAge += student.getAge();
			
		}
		
		return allAge;
		
	}
	
	public Student getOlderStudent() {
		
		Student studentTest;
		
		Student studentOlder = studentList.get(1);
		
		Iterator<Student> iter = studentList.iterator();
		
		while (iter.hasNext()) {
			
			studentTest = iter.next();
			
			if (studentTest.getAge() > studentOlder.getAge()) {
				
				studentOlder = studentTest;
				
			}
			
			
		}
		
		return studentOlder;
		
	}
	
	public boolean remuveStudent(String surname) {
		
		boolean done = false;
		
		Iterator<Student> iter = studentList.iterator();
		
		while (iter.hasNext()) {
			
			if (iter.next().getSurname().equals(surname)) {
				
				iter.remove();
				
				done = true;
				
			}
					
		}
		
		return done;
		
	}
	
	public List<Student> getStudentListSort() {
		
		List<Student> studentListSort = new ArrayList<>();
		
		studentListSort.addAll(studentList);
		
		Collections.sort(studentList);
		
		return studentListSort;
			
	}

}
