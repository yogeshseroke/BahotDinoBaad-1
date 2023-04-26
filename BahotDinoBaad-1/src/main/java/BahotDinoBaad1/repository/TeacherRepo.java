package BahotDinoBaad1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import BahotDinoBaad1.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
