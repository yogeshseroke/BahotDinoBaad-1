package BahotDinoBaad1.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import BahotDinoBaad1.entity.Student;

@SpringBootTest
public class StuRepoTest {

	Student student;
	
	@Autowired
	StuRepo stuRepo; 
	
	void setUp() {
		student = getStudent();
	}
	
	@Test
	void saveTest() { 
		Student student = new Student();
		student.setStuId(1);
		student.setStuName("A");
		Student s = stuRepo.save(student);
		assertEquals(student.toString(), s.toString());
	}
	
	@Test 
	void findByIdTest() {
		Student student = new Student();
		student.setStuId(1);
		student.setStuName("A");
		Student s = stuRepo.findById(student.getStuId()).orElse(null);
		assertEquals(student.toString(), s.toString());
	}
	
	@Test
	void saveAllTest() {
		List<Student> student = new ArrayList<Student>();
		student.set(0, getStudent());
		student.set(1, getStudent());
		List<Student> s = stuRepo.saveAll(student);
		assertEquals(student.toString(), s.toString());
	}

	private Student getStudent() {
		// TODO Auto-generated method stub
		return null;
	}
}
