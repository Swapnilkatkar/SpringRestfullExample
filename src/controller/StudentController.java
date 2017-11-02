package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Student;

@RestController
public class StudentController {
	@RequestMapping(value = "/allstudent", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		list = createStudentList();
		return list;
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET, headers = "Accpet=application/json")
	public Student getStudentByRoll(@PathVariable int id) {

		for (Student student : createStudentList()) {
			if (student.getRollno() == id)
				return student;
		}
		return null;
	}

	public List<Student> createStudentList() {
		Student s1 = new Student(1, "Swapnil");
		Student s2 = new Student(2, "Sumit");
		Student s3 = new Student(3, "Pankaj");
		Student s4 = new Student(4, "Gaurav");
		Student s5 = new Student(5, "S Koli");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		return list;
	}
	
	public List<Student> DummycreateStudentList() {
		Student s1 = new Student(1, "Swapnil");
		Student s2 = new Student(2, "Sumit");
		Student s3 = new Student(3, "Pankaj");
		Student s4 = new Student(4, "Gaurav");
		Student s5 = new Student(5, "S Koli");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		return list;
	}
}
