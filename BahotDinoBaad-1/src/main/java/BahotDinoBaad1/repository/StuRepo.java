package BahotDinoBaad1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import BahotDinoBaad1.entity.Student;

@Repository
public interface StuRepo extends JpaRepository<Student, Integer>{

}
