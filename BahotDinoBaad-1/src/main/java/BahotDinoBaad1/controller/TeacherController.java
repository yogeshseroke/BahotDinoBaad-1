package BahotDinoBaad1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BahotDinoBaad1.entity.Teacher;
import BahotDinoBaad1.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/saveTeacher")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}
	
	@GetMapping("/getTeacher/{id}")
	public Teacher getTeacher(@PathVariable int id ) {
		return teacherService.getTeacher(id);
	}
	
	@PostMapping("/saveTeachers")
	public List<Teacher> saveTeachers(@RequestBody List<Teacher> teacher){
		return teacherService.saveTeachers(teacher);
	}
	
	@GetMapping("/allTeachers")
	public List<Teacher> getTeachers(){
		return teacherService.getTeachers();
	}
	
	@DeleteMapping("/deleteTeacherById/{id}")
	public String deleteTeacher(@PathVariable int id){
		return teacherService.deleteTeacher(id);
	}
}
