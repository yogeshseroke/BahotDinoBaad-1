package BahotDinoBaad1.service;

import java.util.List;

import BahotDinoBaad1.entity.Teacher;

public interface TeacherService {

	public Teacher saveTeacher(Teacher teacher);

	public Teacher getTeacher(int id);

	public List<Teacher> saveTeachers(List<Teacher> teacher);

	public List<Teacher> getTeachers();

	public String deleteTeacher(int id);
}
