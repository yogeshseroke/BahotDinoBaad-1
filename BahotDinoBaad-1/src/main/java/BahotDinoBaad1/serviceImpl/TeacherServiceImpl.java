package BahotDinoBaad1.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BahotDinoBaad1.entity.Teacher;
import BahotDinoBaad1.repository.TeacherRepo;
import BahotDinoBaad1.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepo teacherRepo;
	
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher getTeacher(int id) {
		// TODO Auto-generated method stub
		return teacherRepo.findById(id).get();
	}

	@Override
	public List<Teacher> saveTeachers(List<Teacher> teacher) {
		// TODO Auto-generated method stub
		return teacherRepo.saveAll(teacher);
	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return teacherRepo.findAll();
	}

	@Override
	public String deleteTeacher(int id) {
		// TODO Auto-generated method stub
		 teacherRepo.deleteById(id);
		 return "deleted successfully";
	}

}
