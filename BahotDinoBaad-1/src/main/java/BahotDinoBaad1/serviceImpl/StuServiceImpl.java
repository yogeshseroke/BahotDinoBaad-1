package BahotDinoBaad1.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BahotDinoBaad1.entity.Student;
import BahotDinoBaad1.repository.StuRepo;
import BahotDinoBaad1.service.StuService;

@Service
public class StuServiceImpl implements StuService{

	@Autowired
	private StuRepo stuRepo;
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return stuRepo.save(student);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return stuRepo.findById(id).get();
	}

	@Override
	public List<Student> saveAllStudents(List<Student> student) {
		// TODO Auto-generated method stub
		return stuRepo.saveAll(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return stuRepo.findAll();
	}

	@Override
	public String deleteAll() {
		// TODO Auto-generated method stub
		stuRepo.deleteAll();
		return "successfully delete all data from students";
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student s = stuRepo.findById(student.getStuId()).orElse(null);
		
		s.setStuName(student.getStuName());
		
		return stuRepo.save(s);
	}

}
