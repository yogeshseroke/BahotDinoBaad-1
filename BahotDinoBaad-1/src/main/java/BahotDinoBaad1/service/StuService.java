package BahotDinoBaad1.service;

import java.util.List;

import BahotDinoBaad1.entity.Student;

public interface StuService {

	public Student save(Student student);

	public Student getStudent(int id);

	public List<Student> saveAllStudents(List<Student> student);

	public List<Student> getAllStudent();

	public String deleteAll();

	public Student updateStudent(Student student);
	
}
