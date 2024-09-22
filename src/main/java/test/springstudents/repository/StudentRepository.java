package test.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.springstudents.Model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);

}
