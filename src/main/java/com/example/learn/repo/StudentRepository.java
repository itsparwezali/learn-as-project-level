package com.example.learn.repo;
import com.example.learn.entity.Student;
import com.example.learn.repo.abstractRepo.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Repository
public interface StudentRepository extends AbstractRepository<Student,Long> {

    @Query("SELECT s from Student s where s.studentName =:studentName")
    Optional<Student>findByStudentName(@RequestParam("studentName") String studentName);

}
