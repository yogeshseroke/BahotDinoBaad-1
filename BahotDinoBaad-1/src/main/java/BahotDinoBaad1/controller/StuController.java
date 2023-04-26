package BahotDinoBaad1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BahotDinoBaad1.entity.Student;
import BahotDinoBaad1.service.StuService;

@RestController
public class StuController {

	@Autowired
	private StuService stuService;
	
//	@GetMapping("/students")
//	public ResponseEntity<?> getAllStudents(){
//		return ResponseEntity.ok(this.stuService.getAllStudent());
//	}
	
	@PostMapping("/save")
	public Student saveStu(@RequestBody Student student) {
		return stuService.save(student);
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable int id) {
		return stuService.getStudent(id);
	}
	
	@PostMapping("/saveAll")
	public List<Student> saveStudents(@RequestBody List<Student> student) {
		return stuService.saveAllStudents(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		return stuService.getAllStudent();
	}
	
	@GetMapping("/deleteAllStudents")
	public String deleteAll() {
		return stuService.deleteAll();
	}
	
	@PutMapping("/updateData/{id}")
	public Student updateStudent(@RequestBody Student student) {
		return stuService.updateStudent(student);
	}
}
